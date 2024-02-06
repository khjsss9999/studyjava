package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

// URL(Uniform Resource Locator) : 인터넷에서 접근 가능한 자원의 주소(위치)
// URL 클래스 : 해당 위치의 자원의 결과만 가져온다.
//			 final 클래스이다.(final 이 붙어서 상속이 안 된다.)

public class Ex12{
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 내 컴퓨터에 저장
		String pathname = "D:/khjsss999/util/webPage01.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			URL url = new URL("https://comic.naver.com/index"); // 인터넷 가서
			
			is = url.openStream(); // 열어서
			isr = new InputStreamReader(is); 
			br = new BufferedReader(isr); 
			
			
			
			String msg = null;
			// String 에 여러 번 + 를 사용하면 기존것이 남은 채로 새로 메모리를 또 할당하기 때문에 메로리를 많이 사용하게 된다.
			// 그것을 해결하기 위해서 StringBuffer 나 StringBuilder 를 사용한다.
			// (Buffer는 동기화 지원하기에 느리다. Builder 는 동기화 미지원 하기에 단일에서 빠르게 쓸때만 사용하기에 좋다.)
			// append()로 추가 한다.
			StringBuffer sb = new StringBuffer();   // 객체이기에 String 으로 바로 나오지는 않는다.(버전에 따라 다를 수 있다??)
			// StringBuilder sb = new StringBuilder();
			while ((msg = br.readLine())!= null) {
				// 화면에 출력
				// System.out.println(msg+"\n");
				sb.append(msg+"\n");
			}
			// sb.toString => 자료형 String 으로 만들어준다.
			// System.out.println(sb.toString());
			
			// 파일에 저장하기
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
			
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


















