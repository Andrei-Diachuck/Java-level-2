package Projekt;

import java.io.*;

public class Client {

    public static void main(String[] args) throws IOException {
        CLI cli = new CLI();
        System.out.println("You are connected to the server");

        new Thread(() -> {
            try {
                cli.readMSG();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                cli.sendMSG();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}