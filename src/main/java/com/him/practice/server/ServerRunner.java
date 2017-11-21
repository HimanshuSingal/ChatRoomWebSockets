package com.him.practice.server;

import java.util.Scanner;
import javax.websocket.DeploymentException;

public class ServerRunner {

	public static void main(String[] args) throws DeploymentException {

		org.glassfish.tyrus.server.Server server = new org.glassfish.tyrus.server.Server("localhost", 8080, "/ws",ServerCode.class);
		server.start();
		System.out.println("Press any key to stop the server..");
		new Scanner(System.in).nextLine();
		server.stop();
	}

}
