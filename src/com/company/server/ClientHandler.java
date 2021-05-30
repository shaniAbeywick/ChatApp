package com.company.server;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket client;

    public ClientHandler(Socket socket) {
        this.client = socket;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(30000);
            InputStream inputStream = client.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream()); //data wrapper

            //continuous reading data from client
            String inputData;
            while (null != (inputData = bufferedReader.readLine())) {
               System.out.println("Client says : " + inputData);
              if(inputData.equals("exit")){
                  outputStream.writeBytes(" Welcome to the system !!!\n");
                  break;
              }
                //send data to client


               switch (inputData) {
                   case "6367143":
                   case "5565120":
                       outputStream.writeBytes("Your Password is correct !\n");
                       break;
                   case "Kavi123":
                   case "Sha123":
                       outputStream.writeBytes("Your User name is correct !\n");
                       break;
                   default:
                       outputStream.writeBytes("Your authentication details are invalid,try again..\n");
                       break;
               }




            }
            this.client.close();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

        //receive data


    }
}



//create a thread
//extend the class using thread super class
// implement the class using runnable interface
