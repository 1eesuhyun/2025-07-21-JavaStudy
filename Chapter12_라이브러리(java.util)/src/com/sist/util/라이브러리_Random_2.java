package com.sist.util;
import java.text.SimpleDateFormat;
import java.util.*;
// Random() => 임의의 예약일 ...
// 데이터를 문자열로 묶은 경우 => 단어별 구분
// 필요시 => 정수 변경
// 01 ~ 07   08 09 8진법
public class 라이브러리_Random_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-M-d");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-M-d HH:mm:ss"); // HH -> 대문자는 24시로 표현
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-M-d hh:mm:ss"); // hh-> 소문자는 오후/오전 시간으로 표시 ex) 16시 -> 4시
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		String today=sdf.format(date);
		StringTokenizer st=new StringTokenizer(today,"-");
		String year=st.nextToken();
		String month=st.nextToken();
		String day=st.nextToken();
		int d=Integer.parseInt(day);
		Random r=new Random();
		int[] reserve=new int[r.nextInt(10)+11]; // 11~20
		for(int i=0; i<reserve.length;i++) 
		{
			reserve[i]=r.nextInt(31)+1;
			for(int j=0;j<i;j++)
			{
				if(reserve[i]==reserve[j])
				{
					i--;
				break;
				}
			}
		}
		Arrays.sort(reserve);
		System.out.println(Arrays.toString(reserve));
		System.out.println("예약 가능한 날");
		for(int i:reserve)
		{
			if(d<=i)
				System.out.print(i+" ");
				
			
		}
		
	}

}
