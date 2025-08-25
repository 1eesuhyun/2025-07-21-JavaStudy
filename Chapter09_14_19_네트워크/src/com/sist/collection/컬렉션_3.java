package com.sist.collection;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor   // default 생성자
@AllArgsConstructor  // 매개변수가 있는 생성자
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
}
/*
 *   List<<T> => String
 *   {
 *     T => 매개변수, 리턴형
 *   }
 */
public class 컬렉션_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개발부","대리",3700));
		list.add(new Sawon(2,"심청이","자재부","과장",4800));
		list.add(new Sawon(3,"이순신","총무부","사원",3500));
		list.add(new Sawon(4,"춘향이","영업부","부장",6500));
		list.add(new Sawon(5,"손흥민","기획부","사원",3600));
		// 사원 목록
		System.out.println("=== 사원 목록 ===");
		System.out.println("사원 수:"+list.size());
		for(Sawon sa:list)
		{
			System.out.println(sa.getSabun()+" "+sa.getName()+" "+sa.getJob()+" "
					+sa.getDept()+" "+sa.getPay());
		}
		Sawon sa1=new Sawon(6,"박지성","개발부","팀장",5000);
		list.add(sa1);
		System.out.println("=== 사원 목록 ===");
		System.out.println("사원 수:"+list.size());
		for(Sawon sa:list)
		{
			System.out.println(sa.getSabun()+" "+sa.getName()+" "+sa.getJob()+" "+sa.getDept()+" "+sa.getPay());
		}
		
	}

}
