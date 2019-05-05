package thirteen_NetProgram.five_RMI;
import java.rmi.RemoteException;
import java.time.LocalDateTime;

public class ClockImpl implements Clock {

	@Override
	public LocalDateTime currentTime() throws RemoteException {
		return LocalDateTime.now();
	}

}
