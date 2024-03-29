import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * This is the class responsible with a client Thread
 */
class ClientThread extends Thread {
    private Socket socket = null;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            while (true) {

                String comand1 = "exit";
                String comand2 = "stop";
                String comand3 = "register";
                String comand4 = "login";
                String comand5 = "friend";
                String comand6 = "send";
                String comand7 = "read";

                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = input.readLine();

                PrintWriter output = new PrintWriter(socket.getOutputStream());
                if (request.equals(comand7)) {
                    String raspuns = "Server received the request " + request + ".";
                    output.println(raspuns);
                    output.flush();
                } else if (request.equals(comand6)) {
                    String raspuns = "Server received the request " + request + ".";
                    output.println(raspuns);
                    output.flush();
                } else if (request.equals(comand5)) {
                    String raspuns = "Server received the request " + request + ".";
                    output.println(raspuns);
                    output.flush();
                } else if (request.equals(comand4)) {
                    String raspuns = "Server received the request " + request + ".";
                    output.println(raspuns);
                    output.flush();
                } else if (request.equals(comand3)) {
                    String raspuns = "Server received the request " + request + ".";
                    output.println(raspuns);
                    output.flush();
                } else if (request.equals(comand1)) {

                    String raspuns = "You did exit from the serer!";
                    output.println(raspuns);
                    output.flush();
                    try {
                        socket.close();
                    } catch (IOException e) {
                        System.err.println(e);
                    }
                    break;
                } else if (request.equals(comand2)) {
                    String raspuns = "Server stopped!";
                    output.println(raspuns);
                    output.flush();
                    try {
                        socket.close();
                        System.exit(0);
                    } catch (IOException e) {
                        System.err.println(e);
                    }
                } else {
                    String raspuns = "Wrong command! Please send one of the following: register, login, friend, send, read, exit, stop.";
                    output.println(raspuns);
                    output.flush();
                }
            }
        } catch (IOException e) {
            System.err.println("Communication error" + e);
        }
    }
}