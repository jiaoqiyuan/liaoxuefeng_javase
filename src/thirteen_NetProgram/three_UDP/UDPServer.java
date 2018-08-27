package thirteen_NetProgram.three_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class UDPServer {

	public LocalDateTime currentTime() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		DatagramSocket ds = new DatagramSocket(9090);
		System.out.println("UDP server ready.");
		for (;;) {
			// receive:
			byte[] buffer = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
			ds.receive(packet);
			byte[] data = packet.getData();
			String s = new String(data, StandardCharsets.UTF_8);
			System.out.println("Packet received from: " + packet.getSocketAddress() + " " + s);
			// send:
			String resp = LocalDateTime.now().toString();
			packet.setData(resp.getBytes(StandardCharsets.UTF_8));
			ds.send(packet);
		}
	}
}
