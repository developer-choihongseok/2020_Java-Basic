import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex_1 {
	public static void main(String[] args) {
		
		File f = new File("c:\\Temp\\phone.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(f);
			System.out.println(f.getPath() + "를 출력합니다.");
			
			while(true) {
				int c;
				
				if((c = fr.read()) != -1) {
					System.out.print((char)c);
				}else {
					break;
				}
			}
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
