// package Client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1",3000);
            Product laptop = (Product) registry.lookup("laptop");

            System.out.println("The laptop is: " + laptop.getDescription());
        } catch (RemoteException | NotBoundException e) {

            e.printStackTrace();
        }

    }
}
