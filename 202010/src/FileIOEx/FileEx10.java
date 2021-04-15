package FileIOEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx10 {
	public static void main(String[] args) {
		
		File src = new File("c:\\Temp\\Java.pdf");
		File dest = new File("c:\\Temp\\Java_copy.pdf");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			
			// 고속 복사
			byte[] buf = new byte[1024*10];	// 10kb 버퍼
		
			while(true) {
				int n = fi.read(buf);	// 버퍼의 크기만큼 읽기. n은 실제 읽은 바이트
				fo.write(buf,0,n);		// buf[0]부터 n바이트까지 쓰기.
			
				if(n < buf.length) {
					break;
				}	
			}
			fi.close();
			fo.close();
			
			System.out.println(src.getPath()+ "를 " + dest.getPath() + "로 복사하였습니다.");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}