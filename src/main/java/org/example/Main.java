package org.example;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 8089;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Elena");  // отправляем сообщение на сервер

            String resp = in.readLine(); // ждём, что скажет сервер
            System.out.println(resp);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}