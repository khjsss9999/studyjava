package com.ict.free240202;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Free_Server implements Runnable{
	ArrayList<Free_ServerClients> list = null;
	ServerSocket ss = null;
	
	public Free_Server() {
		try {
			list = new ArrayList<Free_ServerClients>();
			ss = new ServerSocket(7009);
			System.out.println("서버 시작 ~~~");
			new Thread(this).start();
		} catch (IOException e) {
		}
		
	}

	@Override
	public void run() {
		while (true) {
			try {
				Socket s = ss.accept();
			Free_ServerClients sc =	new Free_ServerClients(s,this);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Free_Server();
	}
}
