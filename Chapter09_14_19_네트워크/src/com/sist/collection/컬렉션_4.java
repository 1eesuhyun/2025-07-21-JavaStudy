package com.sist.collection;
/*
 *    Iterator / ListIterator
 *    => 단방향
 *    => 컬렉션이 저장된 경우 => 복잡한 데이터가 있는 경우
 *    => 크롤링
 *       <tr> <td> ..
 *    -----------------------------------------
 *    1) 크롤링 : 태그의 구분자 : id,class
 *       <td class="a">
 *    2) Iterator 주요 기능
 *        1. hasNext() : boolean => while문때 사용
 *        2. 실제 값 : next()
 *        3. 삭제 : remove()
 *    3) ListIterator 주요기능
 *        1. hasNext() : 데이터가 있을때까지 루프, false가 되면 빠져나감, hasPrevious()
 *           1 2 3 4 5...                   5 4 3 2 1...
 *        2. next(), remove()
 */
import java.util.*;
public class 컬렉션_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("춘향이");
		list.add("심청이");
		list.add("이순신");
		list.add("안중근");
		System.out.println("=== 일반 ===");
		for(String name:list)
		{
			System.out.print(name+" ");
		}
		/*Iterator : 한번 사용하면 더이상 수행을 못한다(일회성)
		*     장점 : 메모리가 들어가지 않는다
		* => Set => Iterator를 이용하는것이 편하다
		*  - 복잡한 크롤링 할 경우에 주로 처리
		*  - 웹 사용빈도는 거의 없다
		*  - 변수 : 기본형
		*  - 연산자, 제어문 => 배열 일차원
		*  - 객체지향
		*      => 캡슐화, 오버라이딩
		*      => 인터페이스
		*  - 라이브러리 Object / String / StringBuffer
		*            StringTokenizer / Collection
		*            Math, Random...
		*            IO / SQL
		*            -- 파일 다운로드 / 업로드
		*  ---------------------------------------
		*/ 
		System.out.println("\n=== Iterator ===");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("\n===== 비교 =====");
		for(String name:list)
		{
			System.out.print(name+" ");
		}
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("==== Set => Iterator ====");
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);set.add(2);set.add(3);set.add(4);set.add(5);
		Iterator<Integer> it2=set.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next()+" ");
		}
		
		
	}

}
