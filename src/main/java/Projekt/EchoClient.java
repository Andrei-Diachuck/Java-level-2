package Projekt;

import java.io.*;

public class EchoClient {
    
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

//class CLI {
//    Socket socket = null;
//    Scanner in = null;
//    PrintWriter out= null;
//    Scanner console = null;
//    String userMessage, serverMessage;
//
//    public CLI() throws IOException {
//        socket = new Socket("127.0.0.1",8989);
//        in  = new Scanner(new InputStreamReader(socket.getInputStream()));
//        out = new PrintWriter(socket.getOutputStream(),true);
//        console = new Scanner(new InputStreamReader(System.in));
//    }
//
//    void sendMSG() throws IOException {
//        while (true) {
//            if ((userMessage = console.nextLine()) != null) {
//                out.println(userMessage);
//                if (userMessage.equalsIgnoreCase("/end"))
//                    break;
//            }
//        }
//    }
//
//    void readMSG() throws IOException {
//        while (true) {
//            if ((serverMessage = in.nextLine()) != null){
//                System.out.println(serverMessage);
//            }
//        }
//    }
//
//    void close() throws IOException {
//        out.close();
//        in.close();
//        console.close();
//        socket.close();
//    }











//
//    public static void main(String[] args) {
//        Client client = new Client();
//        new Thread(() -> client.read()).start();
//        new Thread(() -> client.sedMessage()).start();
//    }
//
//
//    static class Client {
//        private Socket socket;
//        private BufferedReader in;
//        private PrintWriter out;
//        private BufferedReader console;
//        private String userM, serverM;
//
//        public Client() {
//            try {
//                socket = new Socket("127.0.0.1", 8787);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                out = new PrintWriter(socket.getOutputStream(), true);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            console = new BufferedReader(new InputStreamReader(System.in));
//        }
//
//        private void sedMessage() {
//            while (true) {
//                try {
//                    if ((userM = console.readLine()) != null) {
//                        System.out.println(userM);
//                        if (userM.equalsIgnoreCase("/end")) {
//                            break;
//                        }
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        private void read() {
//            while (true) {
//                try {
//                    if ((serverM = console.readLine()) != null) {
//                        System.out.println(serverM);
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//

//    public static void main(String[] args) {
//        new EchoClient().start();
//    }
//
//    private void start() {
//        try {
//            openConnection();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            sendMessage(scanner.nextLine());
//        }
//    }
//
//    private void sendMessage(String message) {
//        try {
//            out.writeUTF(message);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void openConnection() throws IOException {
//        socket = new Socket("127.0.0.1", 8787);
//        in = new DataInputStream(socket.getInputStream());
//        out = new DataOutputStream(socket.getOutputStream());
//        new Thread(() -> {
//            try {
//                while (true) {
//                    String message = in.readUTF();
//                    if ("/end".equalsIgnoreCase(message)) {
//                        break;
//                    }
//                    System.out.println("Сообщение от сервера: " + message);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                closeConnection();
//            }
//        }).start();
//    }
//
//    private void closeConnection() {
//        if (in != null) {
//            try {
//                in.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        if (out != null) {
//            try {
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        if (socket != null) {
//            try {
//                socket.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }



