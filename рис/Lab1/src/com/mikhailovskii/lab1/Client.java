package com.mikhailovskii.lab1;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {
    }

    public static void main(String[] args) {
        final String str = "abcdefghijklmnop";

        try {
            String host = (args.length < 1) ? "127.0.0.1" : args[0];
            Registry registry = LocateRegistry.getRegistry(host, 1087);
            RemoteInterface stub = (RemoteInterface) registry.lookup("task");
            String response = stub.replaceAllVowelsWithStars(str);
            System.out.println("Response: " + response);
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }


}
