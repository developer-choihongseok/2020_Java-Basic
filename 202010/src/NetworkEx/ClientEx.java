package NetworkEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		Socket socket = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("127.0.0.1", 9999);	// 클라이언트 소캣 생성 서버에 연결.
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				System.out.print("보내기>> ");
				String outputMessage = sc.nextLine();
				
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n");	// "bye" 문자 전송.
					out.flush();	// out의 스트림 버퍼에 있는 모든 문자열 전송.
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				
				String inputMessage = in.readLine();
				System.out.println("서버: " + inputMessage);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		
				try {
					sc.close();
					if(socket != null) {
						socket.close();	// 클라이언트 소캣 닫기.
					}

				} catch (IOException e) {
					System.out.println("서버와 채팅 중 오류 발생");
				}
		}
	}
}