package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

// URLConnection 클래스 : 원격지 서버 자원의 결과와 원격지 서버의 헤더 정보를 가져올 수 있다.
public class Ex01 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 내 컴퓨터에 저장
		String pathname = "D:/khjsss999/util/webPage02.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL ur1 = new URL("https://comic.naver.com/index");
			URLConnection conn = ur1.openConnection();  // url 에 대한 결과 헤더정보 등이 conn이 참조하기에
			
			is = conn.getInputStream();  // InputStream 인 is 가 conn.getInputStream() 해서 참조하게 한다.
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine())!= null) {  // msg 가 버퍼 객체가 한줄씩 읽어온걸 참조한다. null 을 만나기 전까지
				sb.append(msg+"\n");    // sb.append 로 sb 가 참조하는 객체에 한줄씩 읽어온걸 합친다.
			}
			
			System.out.println(sb.toString());
			System.out.println("\n===================");
			
			// 헤더 정보를 가지고 웹 브라우저가 해석하고 실행한다.
			// 헤더 정보를 얻어내자
		 Map<String, List<String>> map =	conn.getHeaderFields();
		 for (String k : map.keySet()) {  // map 이 컬렉션?? Map을 참조하는 변수인데 keySet()은 키들을 불러온다???
			System.out.println(k+":"+map.get(k));
		}
			
		} catch (Exception e) {

		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {

			}
		}
		
		
		
		
	}
}













