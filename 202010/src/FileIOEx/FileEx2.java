package FileIOEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileEx2 {
	public static void main(String[] args) {
		
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("c:\\Temp\\test2.txt");
			in = new InputStreamReader(fin);
//			InputStreamReader iin = new InputStreamReader(new FileInputStream("c:\\Temp\\test2.txt"));
			
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}