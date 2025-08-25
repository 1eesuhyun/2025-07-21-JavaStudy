package com.sist.list;
/*  Vector
 *   1. 사용 빈도가 낮다 => 네트워크
 *      ----------- 동기적인 프로그램 => 보완(대체) ArrayList(비동기)
 *   2. 크롤링 : 나눠서 작업
 *             -------- 쓰레드
 *             목록 ==> 링크 ==> 상세보기
 *   3. 주요 기능 : CRUD
 *      - 추가 : add ===> addElement
 *      - 수정 : set ===> set
 *      - 삭제 : remove ===> removeElementAt
 *                          removeElementAll
 *      - 읽기 : get ===> elementAt()
 *      - 갯수 : size ===> size()
 */
import java.util.*;
public class Vetcor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec=new Vector();
		vec.addElement("홍길동");
		vec.addElement("이순신");
		vec.addElement("춘향이");
		vec.add("강감찬");
		// size 저장된 갯수
		System.out.println("인원수:"+vec.size());
		//vec.forEach(name->System.out.println(name)); // 람다식
		for(Object obj:vec)
		{
			System.out.println(obj);
		}
		// 삭제 remove
		System.out.println("=== 삭제 ===");
		vec.removeElementAt(1);
		// vec.remove(1);
		for(Object obj:vec)
		{
			System.out.println(obj);
		}
		// 수정 set
		System.out.println("=== 수정 ===");
		vec.setElementAt("세종대왕", 0);
		// vec.set(1,"세종대왕");
		System.out.println("인원수:"+vec.size());
		for(Object obj:vec)
		{
			System.out.println(obj);
		}
		// 전체 삭제 clear
		vec.removeAllElements();
		System.out.println("== 전체 삭제 ==");
		System.out.println("인원수:"+vec.size());
		for(Object obj:vec)
		{
			System.out.println(obj);
		}
		System.out.println("== 인원 여부 ==");
		if(vec.isEmpty())
		{
			System.out.println("없습니다");
		}
		else
		{
			System.out.println("있습니다"+vec.size());
		}
	}

}
