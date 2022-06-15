package Projekt;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SRV {
    Scanner in = null;
    PrintWriter out = null;
    ServerSocket serverSocket = null;
    Socket socket = null;
    Scanner console = null;
    
    void start() {
        try {
            serverSocket = new ServerSocket(8989);
        } catch (IOException e) {
            System.out.println("Can't open port");
        }
        System.out.print("The server is waiting for a connection...");
    }
    
    void catchClient() {
        try {
            socket = serverSocket.accept();
            System.out.println("Client connected");
        } catch (IOException e) {
            System.out.println("Can't accept");
        }
        
        try {
            in = new Scanner(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    void sendMessage(String msg) throws IOException {
        if (msg.equalsIgnoreCase("/end")) close();
        out.println("Server:  " + msg);
        System.out.println(msg);
    }
    
    void close() throws IOException {
        out.close();
        in.close();
        serverSocket.close();
        socket.close();
    }
    
    void writeToConsole() throws IOException {
        while (true) {
            console = new Scanner(new InputStreamReader(System.in));
            String txt = console.nextLine();
            sendMessage(txt);
            break;
        }
    }
}
