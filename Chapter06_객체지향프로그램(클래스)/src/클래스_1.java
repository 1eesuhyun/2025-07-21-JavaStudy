/*
 *    클래스
 *     - 데이터 클래스 > 관련된 변수를 모아서 관리
 *       => 배열 대체
 *       => ~VO, ~DTO
 *     - 액션 클래스 > 기능을 모아서 관리
 *                  --- 메소드
 *       => ~DAO, ~Service, ~Manager
 *          =오라클  =브라우저   =크롤링
 *     - 혼합 클래스
 *       => 변수+메소드
 *       => ~Controller : 조립
 *       
 *       데이터 관리 클래스 => 사용자 정의 데이터 -데이터형을 제작
 *       class : 필요한 데이터를 모아서 사용
 *       ----------------------------
 *       |배열
 *       |클래스 배열 String[]
 *       학생 => 학생[]
 *       --------------------
 *       기본형
 *         int a=10;
 *       1. 메모리 할당 => 메모리 크기를 정해서 저장
 *          class 맛집
 *          {
 *          	int no;
 *          	String name;
 *          	--
 *          	--
 *          	--
 *          }
 *         맛집 a=new 맛집();
 *                   ----- 생성자 => 메모리에 초기값을 등록, 생략이 가능(컴파일러에 의해 자동 생성)
 *               --- 메모리를 맛집 크기에 만들어서 저장
 *         --- - 변수(객체)
 *         데이터형
 *         맛집 a1=new 맛집();
 *         맛집 a2=new 맛집();
 *         맛집 a3=new 맛집();
 *         
 *         **** 
 *         맛집 a=new 맛집();     주소. <- 저장된 주소에 접근하는 연산자
 *         int a=10;
 *     	   
 *     class ClassName
 *     {
 *     	1. 기본형
 *         번호 / 랭크 / 평점
 *      2. 클래스 => String 이름
 *      3. 배열 = 출연, 이미지... : 캡슐화(데이터 보호)
 *      
 *      => 메소드 : 기능 => 상속, 수정(오버라이딩), 추가(오버로딩)
 *                            -------------------------
 *                             다형성
 *     }
 *         
 */
class Student // class 블록 사이에 들어가는 변수는 초기값 설정을 안해도 '자동으로 0'으로 설정된다
{
	int hakbun;
	String name;
	int kor;
	int eng;
	int math;
}
/*
 *    'new'의 역할은 메모리 공간을 만들고 주소값을 넘겨주는 역할
 *    Student hong=new Student();
 *      Stack          Heap(실제 데이터 저장공간)
 *    ---hong---
 *     0x100       0x100--------------------
 *    ----------        -----hakbun-----   hong.hakbun(0) <- 호출 방법
 *    									   hong.hakbun=1
 *                      -----name-------
 *                      
 *                      -----kor--------
 *    
 *                      -----eng--------
 *                      
 *                      -----math-------
 *    
 *                      ----------------
 *    
 */
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		// 값 저장
		System.out.println("hong="+hong); //@1f32e575 <-실제 주소
		hong.hakbun=20;
		hong.name="홍길동";
		hong.kor=90;
		hong.eng=80;
		hong.math=70;
		System.out.println("이름:"+hong.name);
		System.out.println("학번:"+hong.hakbun);
		System.out.println("국어점수:"+hong.kor);
		System.out.println("영어점수:"+hong.eng);
		System.out.println("수학점수:"+hong.math);
		System.out.println();
		
		Student shim=new Student();
		shim.hakbun=19;
		shim.name="심청이";
		shim.kor=92;
		shim.eng=83;
		shim.math=74;
		System.out.println("이름:"+shim.name);
		System.out.println("학번:"+shim.hakbun);
		System.out.println("국어점수:"+shim.kor);
		System.out.println("영어점수:"+shim.eng);
		System.out.println("수학점수:"+shim.math);
		
	}

}
