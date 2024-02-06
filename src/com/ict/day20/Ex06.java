package com.ict.day20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// BufferdReader => readLine() : 한줄씩 읽는다. 더이상 읽을 수 없을때 null; 
public class Ex06 {
	public static void main(String[] args) {
		String pathname = "D:/khjsss999/util/test06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String msg = null;
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
