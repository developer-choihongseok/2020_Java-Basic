package FileIOEx;

import java.io.FileReader;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) {
		// 밑에서도 쓸려면, 전역변수로 선언해주어야 한다.
		FileReader fin = null;
		
		try {
			fin = new FileReader("c:\\Windows\\system.ini");
			
			int c;
			
			// read() : 한 문자씩 파일 끝까지 읽기
			// 뜻 : "더 이상 읽을 것이 없다." 는 말.	-> 파일 전체를 읽어 화면에 출력.
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();	// 사용을 했으면 꼭 닫아줘야 한다.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}