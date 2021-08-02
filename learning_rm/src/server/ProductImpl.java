// package server;

import java.rmi.RemoteException;

public class ProductImpl implements Product {
    String name;
    String description;
    double price;

    public ProductImpl(String name, String description, double price) throws RemoteException {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() throws RemoteException {
        return name;
    }

    public String getDescription() throws RemoteException {
        return description;
    }

    public double getPrice() throws RemoteException {
        return price;
    }

}
