package FileIOEx;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileEx7 {
	public static void main(String[] args) {
		
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		// System.in으로 콘솔에서 입력하는 문자를 문자 스트림으로 변환하는 객체 생성.
		isr = new InputStreamReader(System.in);
		// System.out으로 콘솔에 출력하는 OutputStreamWriter 객체 생성.
		osw = new OutputStreamWriter(System.out);
		
		int i;
		
		try {
			// InputStreamReader에서 한 문자씩 읽으면서 Loop를 돈다.
			while((i = isr.read()) != -1) {
				// OutputStreamWriter에 읽은 문자 하나를 쓴다.
				osw.write((char)i);
			}
			isr.close();
			osw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}