package Projekt;

import java.io.*;

public class EchoServer {
    
    public static void main(String[] args){
        SRV s = new SRV();
        s.start();
        s.catchClient();
        new Thread(() -> {
            while (true) {
                String txt = null;
                txt = s.in.nextLine();
                if (txt != null) {
                    try {
                        s.sendMessage(txt);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        
        new Thread(() -> {
            try {
                s.writeToConsole();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

//class SRV {
//    Scanner in = null;
//    PrintWriter out = null;
//    ServerSocket serverSocket = null;
//    Socket socket = null;
//    String input;
//    Scanner console = null;
//
//    void start() {
//        try {
//            serverSocket = new ServerSocket(8989);
//        } catch (IOException e) {
//            System.out.println("Can't open port");
//        }
//        System.out.print("The server is waiting for a connection...");
//    }
//
//    void catchClient() {
//        try {
//            socket = serverSocket.accept();
//            System.out.println("Client connected");
//        } catch (IOException e) {
//            System.out.println("Can't accept");
//        }
//
//        try {
//            in = new Scanner(new InputStreamReader(socket.getInputStream()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            out = new PrintWriter(socket.getOutputStream(), true);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    void sendMessage(String msg) throws IOException {
//        if (msg.equalsIgnoreCase("/end")) close();
//        out.println("Server:  " + msg);
//        System.out.println(msg);
//    }
//
//    void close() throws IOException {
//        out.close();
//        in.close();
//        serverSocket.close();
//        socket.close();
//    }
//
//    void writeToConsole() throws IOException {
//        while (true) {
//            console = new Scanner(new InputStreamReader(System.in));
//            String txt = console.nextLine();
//            sendMessage(txt);
//            break;
//        }
//    }


//
//    public static void main(String[] args) {
//        Server server = new Server();
//        server.start();
//        server.client();
//
//        new Thread(() -> {
//            String txt = null;
//            while (true){
//                try {
//                    txt = server.in.readUTF();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                if (txt != null){
//                    server.sedMessage(txt);
//                }
//            }
//        }).start();
//
//        new Thread(() -> server.writeToConsole()).start();
//
////        try (ServerSocket serverSocket = new ServerSocket(8787)) {
////            System.out.println("Ожидание подлючения...");
////            Socket socket = serverSocket.accept();
////            System.out.println("Клиент подключился");
////            DataInputStream in = new DataInputStream(socket.getInputStream());
////            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
////
////            while (true) {
////                String message = in.readUTF();
////                if ("/end".equalsIgnoreCase(message)) {
////                    out.writeUTF("/end");
////                    break;
////                }
////                System.out.println("Сообщение от клиента: " + message);
////                out.writeUTF(message);
////            }
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
//
//    }
//
//    static class Server{
//        private Socket socket;
//        private DataInputStream in;
//        private DataOutputStream out;
//        private  BufferedReader console = null;
//        private ServerSocket serverSocket;
//
//        private void start(){
//            try {
//                serverSocket = new ServerSocket(8787);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Ожидание подлючения...");
//        }
//
//        private void client(){
//            try {
//                socket = serverSocket.accept();
//                System.out.println("Клиент подключился");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                in = new DataInputStream(socket.getInputStream());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                out = new DataOutputStream(socket.getOutputStream());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//        void sedMessage(String message) {
//            if (message.equalsIgnoreCase("/end")) close();
//            System.out.println("S ::: " + message);
//            System.out.println(message);
//        }
//
//        void close() {
//            try {
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                in.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                socket.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        void writeToConsole(){
//            while (true) {
//                console = new BufferedReader(new InputStreamReader(System.in));
//                String txt = null;
//                try {
//                    txt = console.readLine();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                sedMessage(txt);
//            }
//        }
//    }
//
//}

