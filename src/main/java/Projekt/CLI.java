package Projekt;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CLI {
    Socket socket = null;
    Scanner in = null;
    PrintWriter out= null;
    Scanner console = null;
    String userMessage, serverMessage;
    
    public CLI() throws IOException {
        socket = new Socket("127.0.0.1",8989);
        in  = new Scanner(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(),true);
        console = new Scanner(new InputStreamReader(System.in));
    }
    
    void sendMSG() throws IOException {
        while (true) {
            if ((userMessage = console.nextLine()) != null) {
                out.println(userMessage);
                if (userMessage.equalsIgnoreCase("/end"))
                    break;
            }
        }
    }
    
    void readMSG() throws IOException {
        while (true) {
            if ((serverMessage = in.nextLine()) != null){
                System.out.println(serverMessage);
            }
        }
    }
    
    void close() throws IOException {
        out.close();
        in.close();
        console.close();
        socket.close();
    }
    
}
