(To Build)
mvn package
the jar is packaged in target 
cd target
To Run the Server
	java -cp "websockets-1.0-SNAPSHOT.jar;lib/*" com.him.practice.server.ServerRunner
To Run the Client
	java -cp "websockets-1.0-SNAPSHOT.jar;lib/*" com.him.practice.client.ClientRunner