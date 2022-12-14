import java.rmi.*;  
import java.rmi.registry.*;  
public class App{  
    public static void main(String args[]){  
        try{  
            Adder stub=new AdderRemote(10);  
            Registry registry = LocateRegistry.createRegistry(5000);
            registry.rebind("sonoo",stub);  
        }
        catch(Exception e){
            System.out.println(e);
        }  
    }  
} 