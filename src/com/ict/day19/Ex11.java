package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//스트림은 지연이 될 수 있으므로 Buffer(임시기억) 이용해서 지연 현상을 해결한다.
//BufferedOutputStream 사용 // 혼자서는 사용 안됨
public class Ex11 {
	public static void main(String[] args) {
		// 파일 만들 위치 지정
		// 이 구조로 try catch를 쓰고 close를 하는게 좋다.
		String pathname = "D:/khjsss999/util/test02.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis =null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b= new byte[(int)(file.length())];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bis.close();   // fis먼저 열고 bis가 나중에 열렸기에 bis 닫고 fis닫으면 된다.
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
