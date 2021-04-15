package FileIOEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx6 {
	public static void main(String[] args) {
		
		// 출발지 -> 도착지
		File src = new File("c:\\windows\\system.ini");
		File dst = new File("c:\\Temp\\system.ini");
		
		int c;
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dst);
			
			while((c = fr.read()) != -1) {	// 문자 하나 읽고,
				fw.write((char)c);	// 문자 하나 쓰고.
			}
			fr.close();
			fw.close();
			
			System.out.println(src.getPath() + "를 " + dst.getPath() + "로 복사하였습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}