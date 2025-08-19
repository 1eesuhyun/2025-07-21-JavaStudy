package com.sist.main;
import java.util.*;
class GenieMusic
{
	public void dataIn()
	{
		System.out.println("지니뮤직 크롤링");
	}
	public void list()
	{
		System.out.println("목록 출력");
	}
	public String titleFind(String fd)
	{
		System.out.println("제목으로 검색");
		return fd;
	}
	// 가수, 상세보기, 동영상
}
class Melon extends GenieMusic
{
	public void dataIn()
	{
		System.out.println("멜론 크롤링"); // -> 오버라이딩
	}
}
public class 정리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
