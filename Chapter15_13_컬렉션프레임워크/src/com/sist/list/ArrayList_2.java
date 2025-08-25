package com.sist.list;
/*
 *   List
 *    => CRUD기능(add, remove, set, get, size)
 *    => containsAll() : 두 개의 list에서 중복된 데이터(교집합)를 모아서 관리
 *                        오라클 : JOIN
 *    => retainAll() : 중복데이터 찾기(부분 집합)
 *    => addAll() : 데이터 전체
 *    => subList : 부분적 데이터 복사 => 중복 구매
 *       ------------ 뮤직(지니,멜론)
 */
import java.util.*;
public class ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(1);
		list.add(2);
		
		System.out.println("== 데이터 출력 ==");
		System.out.println(list.toString());
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		// 일부만 추출(subList)
		System.out.println("== 일부 추출 ==");
		ArrayList list2=new ArrayList(list.subList(1, 4)); // 인덱스번호 1부터 4전까지
		list2.add(10);
		list2.add(11);
		list2.add(12);
		for(Object obj:list2)
		{
			System.out.println(obj);
		}
		// 정렬(sort)  => Collections.sort
		System.out.println("== 정렬 ==");
		Collections.sort(list);
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		// 같은 데이터 추출
		// subList, retainAll, addAll => 사용시 원본이 변경됨
		System.out.println("== 같은 데이터 추출 ==");
		System.out.println(list.retainAll(list2));
		// retainAll => 교집합
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		// 전체 데이터 복사 addAll
		System.out.println("== 전체 데이터 복사 ==");
		ArrayList list3=new ArrayList();
		list3.addAll(list);
		for(Object obj:list3)
		{
			System.out.println(obj); 
			// 위에서 ratainAll(교집합)을 써서 list에는 4,5,6만 저장되어 있음 그래서 4,5,6만 출력
		}
		/*
		 *   subList(int start, int end)
		 *           start 부터 end-1까지 추출
		 *   => 페이징 기법
		 *   addAll() => list가 가지고 있는 모든 데이터 복사
		 *   retainAll() => 두개의 ArrayList에 있는 교집합을 추출
		 *                  ex) list.retainAll(list2)   list과 list2의 교집합을 출력한다
		 *                      list : 1,2,3,4,5,6,7,8,9     list2 : 4,5,6,10,11,12
		 *                            => 4,5,6만 추출
		 *   Collections.sort() => 정렬
		 */
	}

}
