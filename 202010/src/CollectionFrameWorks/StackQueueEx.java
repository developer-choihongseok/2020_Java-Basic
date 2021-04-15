package CollectionFrameWorks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/*
 Stack
 	- 나중에 들어간 것이 먼저 나오는 구조  -> LIFO(Last In First Out)구조\
 	- 시스템 해킹에서 버퍼오버플로우 취약점을 이용한 공격을 할 때 스택 메모리의 영역에서 함.
 	- 인터럽트처리, 수식의 계산, 서브루틴의 복귀번지 저장 등에 쓰임.
 	
 Queue
 	- 먼저 들어간 자료가 먼저 나오는 구조 -> FIFO(First In First Out)구조
 	- 한 쪽 끝은 front로 정하여 삭제 연산만 수행함.
 	- 다른 한 쪽 끝은 rear로 정하여 삽입 연산만 수행함.
*/
public class StackQueueEx {
	public static void main(String[] args) {
		
		System.out.println("= stack =");
		Stack st = new Stack();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
//		System.out.println(st);
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println(st);
		
		// 자바에서는 Queue는 LinkedList를 활용하여 생성해야 한다.
		System.out.println("= Queue =");
		Queue q = new LinkedList();
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
//		System.out.println(q);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());	
		}	
		System.out.println(q);
	}
}