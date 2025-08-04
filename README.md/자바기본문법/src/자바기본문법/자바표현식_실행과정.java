package 자바기본문법;
/*
 * 숫자 
 *  = 정수 
 *   - 2진법  : 1000(앞에0b)
 *   - 8진법  : 111 = 0111(앞에0) 
 *   - 10진법 : 1000, 345 ...
 *   - 16진법 : 0x111(앞에0x)
 *   - 21억 4천정도 까지 인식 이상을 넘어가면 : ~L(소문자 l)
 *  = 실수
 *   - 10.5...
 * 문자
 *  = 문자 한개 저장
 *   'A', '홍', '삼'... => 모든 국가 언어 사용 가능
 *    = Unicode : 한 글자 2바이트 => 멀티바이트
 * 문자열
 *  = 문자 여려개 저장
 *    - "홍길동"
 * 논리형
 *  = true / false
 * 특수문자
 *  = \t : tab 일정 간격
 *  = \n : new line : 줄바꿈
 *  = \" : " 출력
 *  = \\ : \ 출력 : 경로명
 *  
 *  실행 과정
 *  -------
 *  프로그램 구동
 *  ----------
 *  컴파일    : Java / C#, C++ => 컴퓨터 인식언어로 변경
 *  인터프리터 : 한 줄씩 읽어서 출력
 *  		  HTML / JavaScript / Python
 *             javac
 *             컴파일
 *  A.java ==================> 컴퓨터 인식언어로 변경 
 *  원시 소스(프로그래머만 아는 언어)  | 0101010101
 *  						     101010110
 *                                A.class(바이트 코드)
 *                                 |
 *                                 | java (인터프리터)
 *                                한 줄씩 읽어서 출력
 * => 문법       : 컴파일 에러
 * => 실행 시 에러 : 인터프리터 에러
 * --
 * C/C++      : 저급 언어 => 하드웨어
 * Python     : 고급 언어 => 소프트웨어
 * Java       : 고급 언어 
 * 코볼 / 포트란 : 고급 언어                                
 */
public class 자바표현식_실행과정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0b1000);
		System.out.println(0111);
		System.out.println(0x111);
		System.out.println(2500000000L);
		System.out.println(10.5);
		System.out.println('홍');
		System.out.println('길');
		System.out.println('동');
		System.out.println("홍길동");
		System.out.println(true);
		System.out.println(false);
		System.out.print("Hello\nJava!!");
		System.out.print("\nHello Java!!");
		System.out.println("\n\"홍길동\""); //"홍길동"
		System.out.println("C:\\javaDev\\javaStudy\\자바기본문법\\src\\자바기본문법\\자바표현식_실행과정.java");
	}

}
