package API;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);	// byte 단위로 넘어오는 입력값을 정확하게 받아오는 것.
//		
//		System.out.print("이름 입력: ");
//		String name = sc.nextLine();
//		
//		System.out.println(name + "님 환영합니다.");
		
		try {
			FileInputStream fs = new FileInputStream("C:\\Temp\\student.txt");
			Scanner s = new Scanner(fs);
			
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
			s.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		sc.close();
	}
}