package FileIOEx;

import java.io.File;

public class FileEx5 {
	public static void main(String[] args) {
		
		File f1 = new File("c:\\Windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName() + "\n");
		
		String str = "";
		
		if(f1.isFile()) {
			str = "파일";
		}else if(f1.isDirectory()) {
			str = "디렉터리";
		}
		System.out.println(f1.getPath() + "은 " + str + "입니다." + "\n");
		
		File f2 = new File("c:\\Temp\\test");
		
		if(!(f2.exists())) {
			f2.mkdir();	// 존재하지 않으면 디렉터리 생성.
		}
		
		listDirectory(new File("c:\\Temp"));
		f2.renameTo(new File("c:\\Temp\\javasample"));
		System.out.println();
		listDirectory(new File("c:\\Temp"));
	}
	
	static void listDirectory(File dir) {
		System.out.println("----------" + dir.getPath() + "의 서브 리스트입니다.");
		
		File[] subFiles = dir.listFiles();
		
		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();	// 마지막 수정 날짜.
			
			System.out.println(f.getName());
			System.out.println("\t파일 크기: " + f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t,t,t,t);
		}
	}
}