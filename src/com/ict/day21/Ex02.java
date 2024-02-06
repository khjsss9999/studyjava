package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

// 기상청
public class Ex02 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		String pathname = "D:/khjsss999/util/kma_xml.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			URL ur1 = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = ur1.openConnection();
			
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine())!= null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
		fw = new FileWriter(file);
		bw = new BufferedWriter(fw);
		bw.write(sb.toString());
		bw.flush();
			
		} catch (MalformedURLException e) {
	
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
	}
}
