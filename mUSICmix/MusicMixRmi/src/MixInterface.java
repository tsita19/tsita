import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.*;

public interface MixInterface extends Remote{
public void playAudio(String audioName)throws RemoteException;
}

