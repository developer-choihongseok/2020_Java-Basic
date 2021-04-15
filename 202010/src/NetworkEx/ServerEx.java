package NetworkEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		Socket socket = null;
		ServerSocket listener = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);	// 서버 소캣 -> 0 ~ 1023을 제외한 아무 숫자 가능!!
			System.out.println("연결 대기중........");
			
			socket = listener.accept();	// 클라이언트로부터 연결 요청 대기.
			System.out.println("연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결 종료");
					break;
				}
				System.out.println("클라이언트 : " + inputMessage);
				System.out.println("보내기>> ");
				
				String outputMessage = sc.nextLine();	// 키보드에서 한 행 읽기.
				out.write(outputMessage + "\n");		// 키보드에서 읽은 문자열 전송.
				out.flush();	// out의 스트림 버퍼에 있는 모든 문자열 전송.
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			
			try {
				socket.close();
				listener.close();
				
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생하였습니다.");
			}
		}
	}
}