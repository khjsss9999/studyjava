package com.ict.free240202;

import java.net.Socket;

public class Free_ServerClients{
	Socket s;
	Free_Server server;
public Free_ServerClients() {
	
}
public Free_ServerClients(Socket s, Free_Server server) {
	this.s = s;
	this.server = server;
}


}  
