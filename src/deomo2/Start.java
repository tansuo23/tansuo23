package deomo2;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Start {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(88);
        while (true){
            Socket commit = socket.accept();
        head(commit);
        }

    }
    private static void  head(Socket com){ ;

    }
}
