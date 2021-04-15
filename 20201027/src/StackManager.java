import java.util.ArrayList;

public class StackManager {
	
	public static void main(String[] args) {
		
		IStack<Integer> stack = new MyStack<Integer>();
		
		for (int i = 0; i < 10; i++) {
			stack.push(i);	// 10개의 정수 넣음.
		}
		
		while(true) {
			Integer n = stack.pop();
			
			// 스택이 빈 경우
			if(n == null) {
				break;	
			}
			System.out.print(n + " ");
		}
	}
}

class MyStack<T> implements IStack<T>{
	
	ArrayList<T> al = null;
	
	public MyStack() {
		al = new ArrayList<T>();
	}
	
	@Override
	public T pop() {
		if(al.size() == 0) {
			return null;
		}else {
			return al.remove(0);	// 맨 앞에 있는 아이템 삭제
		}
	}

	@Override
	public boolean push(T ob) {
		al.add(0, ob);	// 맨 끝에 삽입 
		return true;
	}
}
