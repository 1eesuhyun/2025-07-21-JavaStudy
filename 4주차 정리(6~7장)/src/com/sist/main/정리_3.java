package com.sist.main;
/*
 *   상속 / 오버라이딩 / 형변환
 *                   자동 형변환 / 강제 형변환
 *                   ** 자바 라이브러리 클래스 리턴 => Object 
 *   ** 클래스는 크기 비교
 *      ------------- 상속관계 / 포함관계
 *                    ------
 *                    논리적 => 상속 내리는 클래스 > 상속 받는 클래스
 *                    포함하고 있는 클래스가 크다
 *                    
 *   - 상속
 *      정의 : 이미 만들어진 클래스의 변수/메소드를 받아서 새로운 클래스를 만들어서 사용
 *                       --------------
 *                       예외) static / 생성자 / 초기화 블록 -> 상속 불가
 *                       ** private은 상속은 되는데 접근은 불가능
 *                          => getter/setter 사용하며 접근 가능
 *      1) 형식
 *         class Parent
 *         {
 *            int a=10;
 *            int b=20;
 *            public void aaa(){}
 *         }
 *         class Child extends Parent
 *         {           -------
 *             int c=30;
 *             int d=40;
 *             public void bbb(){}
 *         }
 *                     class => class
 *                     interface => class implements
 *                     
 *        Parent p=new Parent()
 *               p=> a,b,aaa()
 *        Child c=new Chile()
 *              c=> a,b,c,d,aaa(),bbb()
 *        Parent p2=new Child()
 *               p2=> a,b,Child:aaa()
 *        --------
 *          Parent p=new Child()
 *                   주소가 변경 => 메소드의 주소를 변경
 *          -------- -----------
 *                     Parent가 가지고 있는 메소드 호출 => 메소드의 주소 변경
 *                     Child가 오버라이딩 메소드 호출
 *         Parent가 가지고 있는 변수
 *         
 *         
 *      2) 특징
 *      3) 메소드 재정의(오버라이딩)
 *      4) 형변환
 *         
 */
class Parent
{
	int a=10;
	int b=20;
	// 메소드는 주소 => aaa => 변경
	public void aaa()
	{
		System.out.println("Parent:aaa() Call");
	}
}
class Child extends Parent
{
	int c=30;
	int d=40;
	public void bbb()
	{
		System.out.println("Child:bbb() Call");
	}
	public void aaa()
	{
		System.out.println("Parent:aaa() Call qrt");
	}
}
public class 정리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent(); // a,b,aaa()
		// 사용빈도 거의 없음 상속을 내려주는 부모클래스
		Child c=new Child(); // a,b,c,d,aaa(),bbb()
		// 거의 대부분 사용 자식클래스가 부모클래스를 가지고 와서 추가로 더 사용
		Parent pp=new Child();
		// 관련된 클래스를 모아서 관리 => 추상클래스 / 인터페이스
		//Child cc=new Parent(); -> 오류 --> Child cc=(Child)pp; (이렇게 써야 오류안남)
		// 자동 형변환
		// Parent => double Chile => int   int를 double에 대입하기때문에 자동으로 형변환 int보다 double가 크기때문
		// 변수는 Parent가 가지고 있는 변수 호출
		// 메소드는 Child가 가지고 있는 오버라이딩된 메소드 호출
		pp.aaa();
		System.out.println();
		
	}

}
