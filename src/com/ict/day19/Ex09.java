package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 스트림은 지연이 될 수 있으므로 Buffer(임시기억) 이용해서 지연 현상을 해결한다.
// BufferedOutputStream 사용 // 혼자서는 사용 안됨
public class Ex09 {
	public static void main(String[] args) {
		String pathname = "D:/khjsss999/util/test01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			// true가 있으면 이어쓰기가 된다. 없으면 덮어쓰기가 된다.
			fos = new FileOutputStream(file, true);
			bos = new BufferedOutputStream(fos);  // 반드시 FileOutputStream 밑에 와야 한다. 
			
			String msg = "한국 ICT 인재 개발원 \n5강의장 \n자바 실습 중\n";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();        // flush를 해주는건 버퍼에 꽉 차기 전에 파일에 문자들을 출력하기 위해서이다.
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bos.close();   // fos,bos 둘다 열었기에 bos 닫고 그 다음 fos 닫아주면 된다.
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
