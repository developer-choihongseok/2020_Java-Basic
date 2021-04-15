import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

class telephone_directory{
	
	HashMap<String, String> telephoneMap = new HashMap<String, String>();
	
	String FileName = "c:\\Temp\\phone.txt";
	
	void start() {
		PhoneFile();
		Process();
	}
	
	void PhoneFile() {
		try {
//			File f = new File(FileName);
//			FileReader fr = new FileReader(f);
//			Scanner sc = new Scanner(fr);
			
			// ★ Scanner를 쓰면, hasNext(), next() 등을 쓸 수 있는 장점이 있다.
			Scanner sc = new Scanner(new FileReader(new File(FileName)));
			
			while(sc.hasNext()) {
				String name = sc.next();	// next() : 공백 전까지 입력받은 문자열을 리턴.
				String phone = sc.next();
				
				telephoneMap.put(name, phone);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("총 " + telephoneMap.size() + "개의 전화번호를 읽었습니다.");
	}
	
	void Process() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름>> ");
			String name = sc.nextLine();
			String phone = telephoneMap.get(name);
			
			if(name.equals("그만")) {
				break;
			}
			
			if(phone == null) {
				System.out.println("찾는 이름이 없습니다.");
			}else {
				System.out.println(phone);
			}
		}
		sc.close();
	}
}

public class ex3 {
	public static void main(String[] args) {
		
		telephone_directory td = new telephone_directory();
		td.start();
	}
}
