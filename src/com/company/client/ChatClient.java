package com.company.client;

import java.io.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) throws IOException {

        Client client = new Client();
        client.start();
        // capture input data using scanner class

        String password ;
        String username ;


        Scanner takeInput =new Scanner(System.in);
        System.out.println("Enter your Password : ");
        password = takeInput.next();
        client.sendMessage(password);
        System.out.println("Enter your Username : ");
        username = takeInput.next();
        client.sendMessage(username);
        client.sendMessage("exit");






      // System.out.println("Client finished the execution");

        //send data to the server









    }
     //send data from client to server
    //send data both direction
    //get the user input and send to the server
    //send data according to server reply
    //handling multiple clients using threads

}

