package CollectionFrameWorks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {
	public static void main(String[] args) {
		
		HashSet hs  = new HashSet();
		
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		
		System.out.println(hs + "\n");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		// TreeSet: 오름차순으로 자동 정렬!
		TreeSet ts = new TreeSet();
		
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");
		
		Iterator it2 = ts.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println();
		
		// 순서 유지 X, 데이터 중복 X.
		Set set = new HashSet();
		
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(40));
		
		System.out.println(set);
		
		// Hash -> TreeSet
		Set treeSet = new TreeSet(set);
		System.out.println(treeSet + "\n");
		
		/*
		 이진검색 트리
		 	- 모든 노드는 최대 두 개의 자식노드를 가질 수 있다.
		 	- 왼쪽 자식 노드의 값은 부모 노드의 값보다 작고, 오른쪽 자식 노드의 값은 부모노드의 값보다 커야 한다.
		 	- 노드의 추가,삭제에 시간이 많이 걸린다.
			- 검색과 정렬에 유리(범위 검색) -> 들어올 때, 정렬이 되어진다!
			- 중복된 값 저장 X
		*/
		TreeSet set1 = new TreeSet();
		
		set1.add("abc");
		set1.add("alien");
		set1.add("bat");
		set1.add("car");
		set1.add("disc");
		set1.add("dance");
		
		System.out.println(set1);
		System.out.println("result: " + set1.subSet("b", "d") + "\n");
		
		TreeSet set2 = new TreeSet();
		
		int[] score = {80,95,50,35,45,65,10,100};
		
		for (int i = 0; i < score.length; i++) {
			set2.add(new Integer(score[i]));
		}
		// headSet() : 지정된 객체보다 작은 값의 객체들을 반환한다(단, 지정된 객체 포함X)
		// tailSet() : 지정된 객체보다 큰 값의 객체들을 반환한다(단, 지정된 객체 포함)
		System.out.println("50보다 작은 값: " + set2.headSet(new Integer(50)));
		System.out.println("50보다 큰 값: " + set2.tailSet(new Integer(50)) + "\n");
		
		/*
		 연습문제)
		 	로또 번호 생성기
		 		- Random 클래스, 중복 값 제거, 번호 정렬
		*/
//		TreeSet ts = new TreeSet();
//		
//		Random r = new Random();
//		
//		int[] lotto = new int[6];
//		
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int)(Math.random() * 45) + 1;
//			
//			for(int i_duplicate = 0; i_duplicate < i; i_duplicate++) {
//				if(lotto[i] == lotto[i_duplicate]) {
//					i--;
//				}
//			}
//			ts.add(new Integer(lotto[i]));
//		}
//		System.out.println("로또 번호: " + ts);
		
		Random r2 = new Random();
		
		TreeSet lotto2 = new TreeSet();
		
		// TreeSet 크기가 6보다 작을 때까지 반복
		while(lotto2.size() < 6) {
			lotto2.add(r2.nextInt(45)+1);
		}
		System.out.println("로또 번호: " + lotto2);		
	}
}