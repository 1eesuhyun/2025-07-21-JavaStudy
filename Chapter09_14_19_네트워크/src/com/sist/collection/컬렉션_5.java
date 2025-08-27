package com.sist.collection;
import java.util.*;
public class 컬렉션_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>(); 
		// <> 안에는 클래스형 int => Integer , double => Double
		for(int i=1;i<=5;i++)
		{
			list.add(i);
		}
		// ListIterator : 양방향으로 데이터 접근 가능
		ListIterator<Integer> it=list.listIterator();
		while(it.hasNext()) // 앞에서 뒤로 1 2 3 4 5
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("\n");
		while(it.hasPrevious()) // 뒤에서 앞으로 5 4 3 2 1
		{
			System.out.print(it.previous()+" ");
		}
		// 데이터를 한번에 묶어서 제어
		
	}

}
