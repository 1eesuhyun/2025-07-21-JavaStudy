package com.sist.collection;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *   Set<String>
 *   List<Integer> -> O List<int> -> X
 *   Map<String,Object>
 *   -----------------
 *                | new A(), new B()
 *   --------------------------------------------
 *   => key, vlaue
 *      ---------- properties, xml, json
 *                 ---------------------
 *                 xml => spring-boot : yml
 *      driver=oracle...
 */

public class 컬렉션_2 {
	public static Set<String> genieMusic()
	{
		Set<String> set=new HashSet<String>();
		try
		{
			for(int k=1;k<=2;k++)
			{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20250825&hh=17&rtm=Y&pg="+k).get();
			Elements title=doc.select("table.list-wrap a.title");
			
			for(int i=0;i<title.size();i++)
			{
				String t=title.get(i).text();
				set.add(t);
			}
			}
		}catch(Exception ex) {}
		return set;
	}
	public static Set<String> melonMusic()
	{
		Set<String> set=new HashSet<String>();
		try
		{
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++)
			{
				String t=title.get(i).text();
				set.add(t);
			}
		}catch(Exception ex) {}
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList list=new ArrayList();
		/*
		 *  T : 임의의 클래스형(Type)
		 *  E : 컬렉션 요소(Element)
		 *  K : Key
		 *  V : Value
		 *  N : Number
		 *  ? : 와일드 카드
		 *      <? extends Number> => 데이터형 한정
		 *      
		 *    => 타입의 안정화 / 재사용이 뛰어남
		 *    => C#, 파이썬, TypeScript
		 *    
		 *    class BoardVO
		 *    => interface BoardVO
		 */
		Set<String> genie=genieMusic();
		int i=1;
		System.out.println("=== 지니 뮤직 Top 100 ===");
		for(String title:genie)
		{
			System.out.println(i+"."+title);
			i++;
		}
		Set<String> melon=melonMusic();
		i=1;
		System.out.println("== 멜론 뮤직 Top 100 ==");
		for(String title:melon)
		{
			System.out.println(i+"."+title);
			
			i++;
		}
		// 지니뮤직에만 있는 노래(차집합) => removeAll
		System.out.println("==== 둘 다 있는 노래 ====");
		// removeAll => minus
		//Set<String> genie=
		//genie.removeAll(melon);  // genie-melon
		//melon.removeAll(genie);  // melon-genie
		//genie.retainAll(melon);  // 지니와 멜론 교집합
		// [1,2,3,4,5].removeAll([3,4,5,6,7]) => 1,2
		System.out.println("=== Set에 있는 데이터를 List로 이동 ===");
		//List<String> list=new ArrayList<String>(genie);
		// Set => List로 이동
		// list.addAll(genie)
		List<String> list=new ArrayList<String>();
		list.addAll(genie);
		i=1;
		for(String title:list)
		{
			System.out.println(i+"."+title);
			i++;
		}
		System.out.println("==== 지니뮤직 Top 10 ====");
		List<String> top=list.subList(0, 10);
		i=1;
		for(String title:top)
		{
			System.out.println(i+"."+title);
			i++;
		}
		
	}

}
