package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        JSONResponseController responseCheck = new JSONResponseController();

        responseCheck.GetClientsSuccess();
        responseCheck.GetClientsFailed();
        responseCheck.PostSuccess();
        responseCheck.PostFailed();

        //System.out.println("Hello world!");
    }
}