package rmlclient;

import java.rmi.Remote;
import java.rmi.RemoteException;

// RMI实现
public interface RemoteTest extends Remote {

    String demo(String pram) throws RemoteException;

}
