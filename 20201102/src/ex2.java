import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex2 {
	public static void main(String[] args) {
		
		File f = new File("c:\\Windows\\system.ini");
		FileReader fr = null;
		
		try {
			fr = new FileReader(f);
			
			int c;
			
			while((c = fr.read()) != -1) {
				char tmp = (char) c;
				
				// 입력 받은 인자가 영문 소문자인지 여부를 판단하여 true/false 값을 반환.
				if(Character.isLowerCase(tmp)) {
					// 대상 문자열을 모두 대문자로 변환.
					tmp = Character.toUpperCase(tmp);
				}
				System.out.print(tmp);
			}
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
