package com.company.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("server is running......");
        ServerSocket serversocket = new ServerSocket(6000);
        System.out.println("Server socket created...");

        while (true){
            //server is running forever..
            Socket client = serversocket.accept(); //wait until accept client
            System.out.println("client is accepted...");
            ClientHandler clientHandler = new ClientHandler(client);
            Thread thread = new Thread(clientHandler);
            thread.start();






        }
    }
}
//accept  the user input using command lines (scanner class)
//use GUI for client and server
//encrypt messages between client and the server
//limit the number of clients
