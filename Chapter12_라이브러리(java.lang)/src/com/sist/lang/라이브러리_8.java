package com.sist.lang;
/*
 *   - Wrapper
 *      기본형을 클래스화
 *      - 정수형
 *        byte => Byte
 *        short => Short
 *        int => Integer***
 *        long => Long***
 *      - 문자형
 *        char => Character
 *      - 실수형
 *        float => Float
 *        double => Double***
 *      - 논리형
 *        boolean => Boolean***
 *      - 문자열형
 *        char[] => String***
 *        
 *        => 양쪽 호환
 *           오토박싱    /    언박싱 => 메소드는 한개만 parse???()
 *             |             |
 *          클래스에 값 대입   기본형에 클래스 객체 대입
 *          
 *          Integer ii=10;
 *          int i=ii;
 *             String   String => 정수변경 Integer.parseInt("10")=> 10
 *          자바 ===> 서버 ===> 클라이언트
 *              10
 *              String.valufOf(10)
 *               => "10"
 *              => 문자열 변경
 *              write(String s)
 *              String read()
 *              
 *              정수 : Integer.parseInt("10")
 *              실수 : Double.parseDouble("10.5")
 *              논리 : Boolean.parseBoolean("true")
 *              
 *              *** 웹/윈도우 => 데이터형 개념이 없다
 *                             Only String
 *              입력창
 *                JTextField
 *                 ----
 *                <input tpye=text>
 *                -----------------
 *                
 *                public String boardList(HttpServletRequest req)
 *                {
 *                   String page=req.getParameter("Page")
 *                }
 *                public String boardList(MemberVO vo)
 *                {
 *                   
 *                }
 */
import java.util.*;
public class 라이브러리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub <> 안에는 클래스형만 들어갈 수 있음
//		Integer ii=new Integer(10);
//		int i=ii.intValue();
		//Integer ii=10;
		//int i=ii;
		int a=100;
		System.out.println(Integer.toBinaryString(a)); // 2진법
		System.out.println(Integer.toOctalString(a)); // 8진법
		System.out.println(Integer.toHexString(a)); // 16진법
		
	}

}
