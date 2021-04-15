package CollectionFrameWorks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArrayList: " + add(al));
		System.out.println("LinkedList: " + add(ll));
		System.out.println();
		
		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArrayList: " + add2(al));
		System.out.println("LinkedList: " + add2(ll));
		System.out.println();
		
		System.out.println("= 중간에서 삭제하기 =");
		System.out.println("ArrayList: " + remove2(al));
		System.out.println("LinkedList: " + remove2(ll));
		System.out.println();
		
		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArrayList: " + remove(al));
		System.out.println("LinkedList: " + remove(ll));
		System.out.println();
	}
	
	public static long add(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			list.add(i + "");	// ""를 넣으면 시간을 벌릴 수가 있다.
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.add(500, "X");
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	public static long remove(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = list.size()-1; i >= 0; i--) {	//list.size()-1: 마지막에 있는 숫자 앞을 뜻한다.
			list.remove(i);
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
}