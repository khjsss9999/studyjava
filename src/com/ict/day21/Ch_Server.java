package com.ict.day21;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Ch_Server {
	ServerSocket ss = null;
	ArrayList<CopyClient> list = null;
	
	public Ch_Server() {
		list = new ArrayList<>();
		try {
			ss = new ServerSocket(7004);
			System.out.println("서버 시작 ~");
			
			exec();
		} catch (Exception e) {
		}
	}
	private void exec() {
		while(true) {
			try {
				Socket s = ss.accept();
				CopyClient cc = new CopyClient(s, this);
				cc.start();
				list.add(cc);
			} catch (Exception e) {
			}
		}
	}
	public void sendMsg(Protocol p) {
		try {
			for (CopyClient cc : list) {
				cc.out.writeObject(p);
			}
		} catch (Exception e) {
		}
		
	}
	public void removeClient(CopyClient cc) {
		list.remove(cc);
	}
	public static void main(String[] args) {
		new Ch_Server();
	}
}






