//import java.util.Random;

class User extends Thread{
	int result;
	
	public User(String str) {
		super(str);		// setName(str);
	}
	
	public void run() {
		result = 0;
		
		for (int i = 1; i <= 100; i++) {
			int num = (int)(Math.random() * 20) + 1;
//			Random r = new Random();
//			int x = r.nextInt(20) + 1;
			
			System.out.println(getName() + ": " + num);
			
			result += num;
		}
	}
}

public class ex2 {
	public static void main(String[] args) {
		
		User u1 = new User("User1");
		User u2 = new User("User2");
		
		u1.start();
		u2.start();
		
		try {
			u1.join();
			u2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("***** User1의 값: " + u1.result + " *****");
		System.out.println("***** User2의 값: " + u2.result + " *****");
		
		if(u1.result > u2.result) {
			System.out.println("User 1의 합이 더 큽니다.");
		}else if(u1.result < u2.result) {
			System.out.println("User 2의 합이 더 큽니다.");
		}else {
			System.out.println("두 수가 같다.");
		}
	}
}
