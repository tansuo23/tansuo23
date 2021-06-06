package rmlclient;

import java.rmi.Naming;

public class ClientDemo {
    public static void main(String[] args) throws Exception {

        RemoteTest remoteTest = (RemoteTest) Naming.lookup("rmi://localhost:9090/clientdemo");
        String reult = remoteTest.demo("jsvm");
        System.out.println(reult);
    }
}
