package FileIOEx;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileEx4 {
	public static void main(String[] args) {
		
		FileReader fin = null;
		BufferedOutputStream out = null;
		
		int c;
		
		try {
			fin = new FileReader("c:\\Temp\\test2.txt");
			out = new BufferedOutputStream(System.out, 5);	// System.out : 모니터에 출력(즉, 콘솔 창)
			
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			
			new Scanner(System.in).nextLine();	// 값을 보기 위해서 엔터키로 멈추어 둠.
			
			out.flush();	// flush() : 버퍼에 남아있는 내용을 비워둔다.
			
			fin.close();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
