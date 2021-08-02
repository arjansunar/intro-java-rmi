// package server;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) {
        try {

            // System.setSecurityManager(new SecurityManager());

            System.out.println("Server is booting...");
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            ProductImpl p1 = new ProductImpl("laptop", "its a computer", 100000.0);

            Product stub = (Product) UnicastRemoteObject.exportObject(p1, 0);

            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 3000);
            registry.rebind("laptop", stub);

        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
