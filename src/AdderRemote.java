import java.rmi.*;  
import java.rmi.server.*;  
public class AdderRemote extends UnicastRemoteObject implements Adder{  
    int j;
    AdderRemote(int j)throws RemoteException{  
        super();  
        this.j=j;
    }  
    public int add(int x,int y){return this.j+x+y;}  
}  