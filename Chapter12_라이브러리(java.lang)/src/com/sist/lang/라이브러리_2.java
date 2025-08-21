package com.sist.lang;
class Student
{
	int hakbun=1;
	String name="홍길동";
	public Student()
	{
		System.out.println("객체 생성");
	}
	public void print()
	{
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
	}
	@Override
	protected void finalize() throws Throwable { // <- 상위 클래스
		// TODO Auto-generated method stub
		System.out.println("객체 소멸");
	}
	// 자동 호출 해야 객체가 소멸된다
}
public class 라이브러리_2 {

	public static void main(String[] args) throws Throwable{ // Exception보다 Throwable가 상위클래스이기 때문에 Exception을 쓰면 오류 발생
		// TODO Auto-generated method stub
		Student s=new Student();
		//s.finalize();
		s.hakbun=2;
		s.name="이순신";
		s.print();
		
		s=null; // 주소를 없앨때 'null'을 사용
		System.gc(); // garbage collection
		//s.hakbun=3;
		//s.name="세종대왕";
		//s.print();
	}

}
