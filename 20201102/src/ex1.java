import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		
		System.out.println("전화번호 입력 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		
		File f = new File("c:\\Temp\\phone.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(f);
			
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String str = sc.nextLine();	// 한 줄을 읽는다.
				
				if(str.equals("그만")) {
					break;
				}
				fw.write(str + "\r\n");	// 한 줄 띄어 저장하기 위해 "\r\n"을 붙인다.
			}
			System.out.println(f.getPath() + "에 저장하였습니다.");
			fw.close();
			sc.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
