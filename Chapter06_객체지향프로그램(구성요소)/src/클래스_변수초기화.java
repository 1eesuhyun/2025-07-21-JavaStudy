/*
 *  초기화 => 변수에 값을 첨부
 *  ----
 *   1. 명시적 초기화
 *      class ClassName
 *      {
 *      	변수
 *          ---
 *           기본형(int, double, boolean)
 *           배열
 *           클래스
 *      }
 *      
 *      // 기본형
 *      int a=100;
 *      int[] arr={1,2,3,4,5};
 *      A a=new A();
 *      
 *      int a; =0
 *      int[] arr=; = null
 *      A a; = null
 *      ---------------------- 선언만 가능
 *      
 *      
 *   2. 초기화 블록
 *      class ClassName
 *      {
 *      	int a;
 *      	static int b;
 *      	instance 블록 ==> 데이터베이스 드라이버 등록
 *     		 {           ==> 네트워크 서버 연결
 *      		a=100;
 *      		=> static변수 초기화 가능
 *     		 }
 *     		= static 블록
 *     	    static ======> MyBatis 연동, 설정
 *          {
 *          	b=200;
 *              => 인스턴스의 초기화는 불가능
 *          }
 *          ** 상속 제외
 *          ** 컴파일러에 의해 자동 호출
 *          ** 크롤링 / 파일 읽기 / 데이터베이스값 채우기
 *      }
 *      => 진화 => 생정자
 *   3. 생성자
 *   
 *   초기값 == 명시적 초기화 === 초기화 블록 === 생성자
 *              |                          |
 *              ---------------------------
 *                  | 한개 선택
 *              |static = 초기화블록
 *              |instance = 생성자
 *              저장 순서 기본값 0 -> 명시적 순서 -> 스태틱 -> 인스턴스
 */
class Sawon // 클래스문 괄호 안에서는 반복문 수행 불가
{
	int sabun=10;
	{
		sabun=(int)(Math.random()*100)+1;
	}
	static String comName="SIST"; // <- 명시적 초기화(기본값이 아닌 필요한 값을 초기화 시키는것)
	static 
	{
		comName="SIST2";
	}
}
public class 클래스_변수초기화 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		System.out.println(s1.sabun);
		System.out.println(s1.comName);
		Sawon s2=new Sawon();
		System.out.println(s2.sabun);
		System.out.println(s2.comName);
		Sawon s3=new Sawon();
		System.out.println(s3.sabun);
		System.out.println(s3.comName);
	}

}
