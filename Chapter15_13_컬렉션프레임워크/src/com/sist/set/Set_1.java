package com.sist.set;
/*
 *   Set
 *    - HashSet : 중복 제거 => 코딩 테스트
 *      1) 특징
 *         = 순서가 없다(인덱스 번호가 없다)
 *           일반 for문은 사용 불가 => forEach, Iternater
 *         = 데이터 중복 허용X
 *         = 주로 ArrayList에 있는 데이터중에 중복 제거
 *         = 구현된 클래스
 *           HashSet / TreeSet
 *      2) 주요 기능
 *         = 데이터 저장 : add()
 *         = 데이터 삭제 : remove()
 *         = 데이터 읽기 : get()
 *         = 저장된 데이터 갯수 : size()
 *         = 전체 삭제 : clear()
 *         = 존재 여부 : isEmpty()
 *        ArrayList => Set => ArrayList
 *                      |
 *                   Cookie => MyBatis => Spring
 *    - TreeSet : 
 */
import java.util.*;
public class Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		// 데이터 추가 => 중복된 데이터 제외
		set.add("사과");
		set.add("배");
		set.add("수박");
		set.add("참외");
		set.add("귤");
		set.add("망고");
		set.add("사과");
		set.add("망고");
		set.add("배");
		System.out.println("과일 갯수:"+set.size()+"개");
		for(Object obj:set)
		{
			System.out.println(obj);
		}
		// 삭제 Set는 인덱스 번호가 없기때문에 실제 값을 지워야함
		System.out.println("== 삭제 ==");
		// CRUD => 추가 / 일기 / 수정 / 삭제
		set.remove("배"); // 인덱스 번호 작성X
		System.out.println("과일 갯수:"+set.size()+"개");
		for(Object obj:set)
		{
			System.out.println(obj);
		}
		// clear
		System.out.println("== 전체 삭제 ==");
		set.clear();
		System.out.println("과일 갯수:"+set.size()+"개");
		for(Object obj:set)
		{
			System.out.println(obj);
		}
		if(set.isEmpty())
		{
			System.out.println("과일이 없습니다");
		}
		else
		{
			System.out.println("과일이 있다");
		}
		// 단점 => 객체 단위 저장 => 같은 이름이 있는 경우에는 제거할 수 없다
		// JSP(X), Servlet(X), Sprint(X)
		// websocket
		// 오라클에 존재 => TreeSet
		
	}

}
