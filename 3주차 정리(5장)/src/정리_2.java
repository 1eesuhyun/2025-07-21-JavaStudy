/*
 *   - 연산자
 *   
 *     증감 연산자(++,--) : 전치/후치 => 한개 증가/감소
 *        => for / while
 *       부정 연산자 (!) : boolean => if
 *       형변환 연산자 : (데이터형)
 *       제네릭스
 *       => 클래스 형변환 (상속 내린얘가 받는얘보다 커야함)
 *       class A
 *       {
 *       	int a,b;
 *       }
 *       class B extends A
 *       {       -------  A>B
 *       	int b;
 *       }
 *       -------------------- 실수 => 정수
 *       자바의 모든 클래스는 Object상속을 받는다
 *                       ------
 *       라이브러리는 리턴시 Object
 *       
 *       산술연산자(+,-,*,/,%)
 *               + : 산술, 문자열 결합
 *               / : 정수/정수=정수, 0으로 나눌 수 없다
 *               % : 부호는 왼쪽부호 따라감
 *       비교연산자(==,!=,<,>,<=,>=)
 *               결과값 : boolean
 *               오라클 =  <>
 *               JS  === !==
 *       논리연산자(&&(직렬[둘다 같을시]), ||(병렬[둘중 하나만 true면])
 *               => 효율적인 연산
 *           && -> (조건) && (조건)
 *                 false     X
 *           || -> (조건) || (조건)
 *                  true     X
 *            
 *            int a=10;
 *            int b=9;
 *             a<b && ++b=a
 *             
 *        대입 연산자 ( =, +=, -=)
 *                      -------
 *                       반복문 => 횟수
 *                       
 *       제어문
 *         if : 조건문
 *         if~else : 선택문
 *         => 오류 처리 => 건너뛰기
 *         
 *         for / while
 *         
 *         break;
 *         
 *         = 데이터 관리 : 여러개의 데이터를 묶어서 관리
 *           -------
 *           같은 데이터 : 배열
 *           다른 데이터(관련이 있는) : 클래스
 *           class => 사용자 정의 데이터형
 */
import java.util.*;
class A
{
	int a;
	void aaa() {}
}
public class 정리_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<A> list=new ArrayList<A>();
		list.add(new A());
		list.add(new A());
		list.add(new A());
		
		A aa=list.get(0);
		
	}

}
