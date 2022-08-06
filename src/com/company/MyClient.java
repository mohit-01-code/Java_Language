package com.company;
import java.net.*;
import java.io.*;

public class MyClient {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localHost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello, I am Client.");
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
