package CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Date;

public class GenericTest2 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		
		list1.add("Hello");
		list1.add(100);
		list1.add(new Date());
		
		System.out.println(list1 + "\n");
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("Hello");
//		list2.add(1234);
		
		System.out.println(list2 + "\n");
		
		Integer[] intArray = {1,2,3,4,5};
		printArray(intArray);
		
		Character[] charArray = {'A','B','C','D','E'};
		printArray(charArray);
	}
	
//	static void printArray(Integer[] i) {
//		for(Integer ii : i) {
//			System.out.println(ii);
//		}
//	}
	
	// 선호하는 방식 X
//	static void printArray(Object[] i) {
//		for(Object o : i) {
//			System.out.println(o);
//		}
//	}
	
	static <T> void printArray(T[] intArray) {
		for(T i : intArray) {
			System.out.printf("%s ", i);
		}
		System.out.println();
	}
}