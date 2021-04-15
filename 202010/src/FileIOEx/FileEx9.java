package FileIOEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx9 {
	public static void main(String[] args) {
		
		File src = new File("c:\\Temp\\pengsu.jpeg");
		File dest = new File("c:\\Temp\\pengsu_copy.jpeg");
		
		int c;
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			// 일반 복사
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			
			System.out.println(src.getPath()+ "를 " + dest.getPath() + "로 복사하였습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}