package com.company;
import java.net.*;
import java.io.*;

public class MyServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("Message: "+str);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
