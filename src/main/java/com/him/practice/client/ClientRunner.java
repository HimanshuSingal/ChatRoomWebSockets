package com.him.practice.client;

import java.net.URI;
import java.util.Scanner;
import javax.websocket.Session;
import org.glassfish.tyrus.client.ClientManager;

import com.him.practice.util.JsonUtil;

public class ClientRunner {

    public static final String SERVER = "ws://localhost:8080/ws/chat";

    public static void main(String[] args) throws Exception {
        ClientManager client = ClientManager.createClient();
        String message;

        // connect to server
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tiny Chat!");
        System.out.println("What's your name?");
        String user = scanner.nextLine();
        Session session = client.connectToServer(ClientCode.class, new URI(SERVER));
        System.out.println("You are logged in as: " + user);

        // repeatedly read a message and send it to the server (until quit)
        do {
            message = scanner.nextLine();
            session.getBasicRemote().sendText(JsonUtil.formatMessage(message, user));
        } while (!message.equalsIgnoreCase("quit"));
    }

}
