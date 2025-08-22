package com.sist.regex;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class 라이브러리_정규식표현법_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date(); // 시스템의 날짜를 갖고 오는 클래스
		// 기능 보완 Calendar
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String today=sdf.format(date);
		// 2025-08-22
		System.out.println(today);
		String regex="(\\d{4})-(\\d{1,2})-(\\d{1,2})";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(today);
		
		if(m.matches()) // 전체가 동일할때는 'matches' 일부가 동일할때는 'find' /find==contains // matches==equals
		{
			System.out.println(m.group());
			System.out.println("년도:"+m.group(1));
			System.out.println("월:"+m.group(2));
			System.out.println("일:"+m.group(3));
		}
		String ip="211.123.142.441";
		regex="(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})\\.(\\d{1,3})";
		p=Pattern.compile(regex);
		m=p.matcher(ip);
		if(m.matches())
		{
			System.out.println();
			System.out.println(m.group());
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
		/*
		 *  패턴 만들기
		 *  --------
		 *  Pattern.matchers : equals => 전체 문장
		 *  Matcher.find/group : contains => 부분 검색
		 *     => 찾은 문장열 읽기 : group()
		 *     => 주로 find()를 사용
		 *  replaceAll : 변환
		 *  그룹() : 그룹을 묶는 경우
		 *  
		 *  => 데이터셋 => 데이터사전
		 */
	}

}
