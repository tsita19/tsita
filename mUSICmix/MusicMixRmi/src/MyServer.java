
import java.rmi.*;

public class MyServer{
    public static void main(String args[]){
    try{
        MixInterface stub=new MixRemote();
        Naming.rebind("rmi://localhost:5000/MUSIC",stub);

        } catch(Exception e){System.out.println(e);}
     }
}
