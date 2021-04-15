package CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/*
 Iterator
  - 컬렉션에 저장된 요소들을 읽어오는 방법의 표준화
  - 저장된 각 요소에 접근하는 기능을 가진 Iterator 인터페이스 정의
  - Collection 인터페이스에는 Iterator를 반환하는 iterator()를 정의
  - iterator()는 Collection에 정의된 메서드이므로, List와 Set에 포함!
*/
public class ListIteratorEx1 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		// hasNext() : 읽어 올 요소가 더 이상 있는지 없는지 확인. 
		// 있으면 true, 없으면 false 반환.
		while(it.hasNext()) {		// 순방향
			System.out.print(it.next());	// 현재 내용을 찍고, 그 다음 커서 이동.
		}
		System.out.println();
		
		while(it.hasPrevious()) {	// 역방향
			System.out.print(it.previous());	// 이전 내용을 찍고, 그 다음 커서 이동.
		}
		System.out.println();
		
		Iterator<String> iit = list.iterator();
		
		while(iit.hasNext()) {
			String str = iit.next();
			System.out.println(str);
		}
		
		// Iterator는 재사용이 안되므로, 아래와 같이 다시 얻어와야 한다!!
		Iterator iiit = list.iterator();
	}
}