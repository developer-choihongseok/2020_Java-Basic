package FileIOEx;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("c:\\Temp\\test2.txt");
			
			while(true) {
				String line = sc.nextLine();
				
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n");	// ★ 윈도우 개행!! -> 직접 적어주면 된다.
			}
			fout.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}