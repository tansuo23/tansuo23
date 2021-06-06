package rmlservet;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImpl extends UnicastRemoteObject implements RemoteTest {
        public RemoteImpl()throws RemoteException{

        }


    @Override
    public String demo(String pram) throws RemoteException {
        return pram +"滕建龙有";
    }
}
