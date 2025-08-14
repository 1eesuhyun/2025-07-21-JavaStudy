package com.sist.main;
/*
 *    7장 => 캡슐화 / 상속 / 다형성 / this / super / this() / super()
 *    
 *    키워드
 *     => this : 자신의 객체
 *        class A => 설계
 *        {
 *           this를 사용하는 위치(생략 가능)
 *           => 생성자, 인스턴스 메소드에서만 사용 가능
 *           => static 메소드에서는 사용할 수 없다
 *           => 클래스 자신이 가지고 있는 것
 *              ---------------------
 *              인스턴스 변수 / 인스턴스 메소드 / 생성자
 *            public void aaa(A this)
 *            {               ------ 생략
 *               this. -> 생략 가능
 *               ------ 지역변수 / 매개변수와 인스턴스 변수가 동일할때
 *            }
 *            public A(A this)
 *            {        ------ 생략
 *            }
 *            => 지역변수 우선순위
 *               ------------- 지역변수가 없는 경우 인스턴스 변수
 *                             정적 변수 찾기
 *        {
 *        A a=new A(); => 사용법
 *        ---------
 *        JVM
 *         1) this 저장
 *            this=a
 *       => 웹 : this가 아니고 page
 *     => this() : 자신의 생성자를 호출 할 경우에 사용
 *     => super : 상위 클래스 객체
 *     => super() : 상위 클래스의 생성자 호출
 *        ------- 상속 받는 경우에는 무조건 호출 => 없는 경우 자동 추가
 *        
 *     => 접근 지정어(사용자 정의 없음)
 *        public : 모든 클래스에 접근 가능
 *        protected : 같은 패키지 + 상속 내린 클래스(패키지가 다른 경우)
 *        default : 같은 패키지
 *        private : 같은 클래스
 *        
 *        => 다른 클래스와 연결
 *           1. 클래스
 *           2. 메소드
 *           3. 생성자
 *           ----------- 반드시 public으로
 *           4. 멤버변수(인스턴스 변수) => private : 데이터 보호
 *        final : 상수
 *        
 *        static, 접근지정어, final
 *        ---------------------- 인스턴스변수, 정적변수 -> 3개 다 사용 가능
 *        지역변수는 final만 사용가능
 *        --------------------------------------------------------
 */
//class A
//{
//	int a;
//	public void display(int a)
//	{
//		this.a=a;
//	}
//}
/*
 *     상속 내린 클래스 = 상속 받은 클래스
 *         ------------- 사용	
 */
class A
{
	int a=100;
	public A()
	{
		System.out.println("상위 클래스 생성자 호출");
	}
}
class B extends A
{
	int a=200; // 변수 오버라이딩(덮어쓰기==수정하기)
	public B()
	{
		super(); // 매개변수가 없으면 생략 가능(없어도 자동으로 추가)
		System.out.println("this.a="+this.a); // 자신의 변수값을 가지고 올때는 'this.'
		System.out.println("super.a="+super.a); // 상위 클래스 변수값을 가지고 올때는 'super.'
	}
}
public class 정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		
	}

}
