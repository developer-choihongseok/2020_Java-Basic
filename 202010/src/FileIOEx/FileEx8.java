package FileIOEx;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEx8 {
	public static void main(String[] args) {
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter("c:\\Temp\\test3.txt"), true);
			
			pw.printf("제 나이는 %d살입니다.\n", 26);
			pw.printf("저는 %s입니다.\n", "수강생");
			pw.println("파일쓰기.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}