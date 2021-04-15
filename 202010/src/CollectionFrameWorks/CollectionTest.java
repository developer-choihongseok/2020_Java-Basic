package CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.Vector;
/*
 컬렉션 프레임워크
  	
  	컬렉션
  		- 여러 객체를 모아 놓은 것을 의미
  	프레임워크
  		- 표준화, 정형화된 체계적인 프로그래밍 방식
  		
  	- 다수의 객체를 다루기 위한 표준화된 프로그래밍 방식
  	- 컬렉션을 쉽고 편리하게 다룰 수 있는 다양한 클래스 제공
  	
  	핵심 인터페이스
  	
  	List
  		- 순서가 있는 데이터의 집합, 데이터의 중복을 허용
  	Set
  		- 순서를 유지하지 않는 데이터의 집합, 데이터의 중복 X
  	Map
  		- 키(Key)와 값(Value)의 쌍으로 데이터의 집합
  		- 순서 유지X, 키는 중복X, 값은 중복 허용
  		
  	List 주요 메서드
  	
  		void add(int index, Object o)
  			- index의 위치에 o의 값 추가
  		Object get(int index)
  			- index 위치에 있는 요소를 반환
  		int indexOf(Object o)
  			- 요소 o가 있는 위치 반환
  		ListIterator listIterator()
  			- ListIterator 객체를 반환
  		Object remove(int index)
  			- index 위치에 요소 삭제하고, 삭제한 요소를 반환
  		Object set(int index, Object o)
  			- 지정한 index의 요소를 o로 변경
*/
public class CollectionTest {
	public static void main(String[] args) {
		// 동기화 기능 제공
		Vector v = new Vector();	// 기본 용량: 10
		
		v.add("A");
		v.add("C");
		v.add("E");
		v.add("D");
		System.out.println(v);
		
		// 지정된 인덱스에 값을 넣고, 나머지 값들은 하나씩 뒤로 밀린다.
		v.add(1, "B");
		System.out.println(v + "\n");
		
		System.out.println("인덱스 2 위치의 값 삭제");
		v.remove(2);
		System.out.println(v + "\n");
		
		System.out.println("인덱스 2 위치의 값 반환: " + v.get(2) + "\n");
		
		System.out.println("용량: " + v.capacity());	// Vector에만 capacity() 메서드가 있다!!
		System.out.println("사이즈: " + v.size());	// 현재 들어있는 값 크기.
		System.out.println();
		
		// 객체의 나열이므로 객체 형태는 다 들어 갈 수 있고, 동기화 기능 제공 X.
		ArrayList list = new ArrayList(10);
		
		// 이 방법 추천하지 X
		list.add(5);	// 오토박싱
//		list.add("A");	// 같지 않는 자료형도 추가 할 수 있다.
		
		// 이 방법 추천하지 X
		list.add(new Integer(4));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		System.out.println(list);
		System.out.println(list.get(2));
		
		list.add(2, 12);
		System.out.println(list);
		
		list.set(2, 0);
		System.out.println(list + "\n");
		
		// subList(1,4) : 1부터 4사이에 저장된 객체 반환 -> 1,2,3번 인덱스 포함.
		ArrayList list1 = new ArrayList(list.subList(1, 4));
		
		print(list, list1);
		
//		list.sort(null);	// 오름차순 정렬
//		list.sort(Comparator.naturalOrder());	// 오름차순 정렬
//		list.sort(Comparator.reverseOrder());	// 내림차순 정렬
		
		Collections.sort(list);
		Collections.sort(list1);
		
		print(list, list1);
		
		// containsAll() : 첫번째 리스트가 두번째 리스트의 모든 요소를 포함시  true.
		// contains() : 지정된 객체가 ArrayList에 포함되어 있는지 아닌지.
		System.out.println("list.containsAll(list1): " + list.containsAll(list1) + "\n");
		
		list1.add("B");
		list1.add("C");
		list1.add(3, "A");
		
		print(list, list1);
		
		list1.set(3, "AA");
		print(list, list1);
		
		// list에서 list1과 겹치는 부분만 남기고(= 공통요소를 제외하고는) 나머지는 모두 삭제.
		System.out.println("list.retainAll(list1): " + list.retainAll(list1));
		print(list, list1);
		
		// list1에서 list에 포함된 객체들을 삭제.
		for (int i = list1.size() - 1; i >= 0; i--) {
			list1.remove(i);
		}
		print(list, list1);
	}
	
	static void print(ArrayList list, ArrayList list1) {
		System.out.println("list: " + list);
		System.out.println("list1: " + list1 + "\n");
	}
}