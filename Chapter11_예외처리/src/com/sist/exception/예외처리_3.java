package com.sist.exception;

import javax.naming.PartialResultException;

/*
 *   다중 catch사용
 *   => 의심되는 에러
 *   
 *   1. 배열을 생성
 *   2. 문자열 정수 입력 => 정수로 변환 => 배열에 저장
 *   3. 나누기
 */
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		try
		{
			System.out.println(a/b);
		}catch(Exception e) // 크기가 큰 클래스 일수록 마지막으로 내린다 why? 클래스가 크기때문에 위에서 에러를 전부 잡아서 작은 클래스들은 쓰나마나 의미가 없다
		{
			System.out.println("에러 벌생");
		}
//			catch(RuntimeException e)
//		{
//			System.out.println("에러 벌생");
//		}
	}

}
