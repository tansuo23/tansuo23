package rmlservet;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RemoteServet {
    public static void main(String[] args) {
        try {
            RemoteTest remoteTest = new RemoteImpl();
            LocateRegistry.createRegistry(9090);
            Naming.bind("rmi://localhost:9090/clientdemo", remoteTest);
            System.out.println("服务启动完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
