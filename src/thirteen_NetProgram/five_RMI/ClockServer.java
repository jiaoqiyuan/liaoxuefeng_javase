package thirteen_NetProgram.five_RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ClockServer {

	public static void main(String[] args) throws Exception {
		Clock impl = new ClockImpl();
		Clock stub = (Clock) UnicastRemoteObject.exportObject(impl, 1099);
		LocateRegistry.createRegistry(1099);
		Registry registry = LocateRegistry.getRegistry();
		registry.bind("Clock", stub);
		System.out.println("Clock server ready.");
	}
}
