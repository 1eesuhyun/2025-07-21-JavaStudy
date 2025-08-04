/*
 *   1.실행
 *                            | 프로젝트 (.class) => jar
 *                              => 라이브러리 파일
 *                            | JSP : war / ThymLeef : jar
 *     A.java ======= A.class======== 실행
 *              |               |
 *           java.c            java => JVM <=> 운영체제
 *                             인터프리터 (번역된 문서를 한줄씩 읽어서 출력)
 *           컴파일(0,1) => 컴퓨터 인식 언어
 *   2.들여쓰기
 *     자바
 *     class A{
 *     }
 *     C/C++
 *     class A
 *     {
 *     }
 *   3.가독성 / 최적화
 *             ㄴ--- 속도 +, StringBuffer
 *     ㄴ--- 수정 / 추가
 *       => 주석
 *   4.변수
 *     : 데이터 한개만 저장되는 메모리 주소의 이름
 *       1) 변수 추출 => 웹사이트
 *       2) 데이터형 종류 => 문자열 / 실수 / 정수
 *          기본형 : 자바 제공
 *                 1) 정수 : byte(1byte) => -127~128                     8bit -> 1byte
 *                          int(4byte=32bit) => -21억4천7백~21억4천7백 [컴퓨터는 모든 정수를 int로 인식{범위를 벗어나면 오류}]
 *                          long(8byte)
 *                          ------------ 구분 (int/long) => 1(L)
 *                          => 오버플로우 / 언더플로우
 *                             -------   -------
 *                                        Min이하면 => Max값으로 변경
 *                             Max이상이면 => Min값을 변경
 *                             int => long으로 변경
 *                    실수 
 *                      평균 / 별점 / 표준편차 / 확률 / 통계
 *                        : float(4byte)
 *                          double(8byte)[디폴트] => 정밀도 15자리
 *                 2) 문자 : 문자 한개 저장
 *                          char(2byte) => 0~65535 unicode => UTF-8
 *                          => '' => null(값이 없음) -> 오류
 *                             ' '=> 공백문자 추가
 *                 3) 논리 :true/false 만 저장
 *                         boolean(1byte) => 조건문 / 반복문  
 *          참조형 : 사용자 정의(배열[같은 크기의 데이터형을 여러개 모아서 관리], 클래스[다른 데이터형 여러개를 모아서 관리])
 *                 String(클래스) : 문자열 저장할때
 *                                일반 문자열 데이터
 *                                필요시에는 클래스형으로 사용 가능
 *                                => 문자열과 관련된 기능 (메소드)
 *                                문자열 비교는 ==/!= 를 사용하지 않는다
 *       3) 초기값
 *          ------ 변수는 반드시 초기값이 있어야 함(필요시 변경 가능)
 *          # 명시적 초기화
 *            int no=1
 *          # 사용자 입력값을 받아서 초기화
 *            Scanner / BufferedReader
 *            일반 => 입력창
 *          # 임의로 지정 : 난수
 *            Math.random()=> 0.0~0.99
 *            Random r=new Random()
 *            r.nextInt(10) => 0~9
 *     ------------------------------------
 *     
 *     1. 변수 활용  => 연산자
 *        연산 처리를 위해 -> 데이터 저장 -> 다시 사용
 *     2. 연산자 활용 => 제어문
 *     3. 제어문 활용 => 메소드
 *     4. 메소드 활용 => 객체지향
 *     ----------------------
 *     => 설계 / 기능별 분리 => 조립
 *     => 라이브러리 (자료구조 / IO / 네트워크 / 오라클 연동)
 *     오류 방지 => 예외처리
 *     
 *     자바에서 제공하는 연산자
 *     ------------------
 *     피연산자 연산자
 *     5 + 6
 *     5, 6 = 피연산자
 *     +    = 연산자
 *     피연산자 => 연산자
 *     -----
 *     1개일때 : 단항연산자
 *     2개일때 : 이항연산자
 *     3개일때 : 삼항연산자
 *     ---------------
 *       웹 => 2진법으로 계산하는 내용이 없다
 *      단항연산자
 *         : 부정연산자 => ! (반대효과)
 *              예약일이 아닌 날
 *              결과값 : boolean(true/false)
 *              if / for
 *              ex) boolean bCheck=false;
 *                  !bCheck => true
 *         : 부호연산자 => 음수 / 양수
 *              ex) int a=-10;
 *                  a=-a=10
 *         : 증감연산자 : ++(1개 증가), --(1개 감소)
 *                     전치연산자(++a), 후치연산자(a++)
 *                     int a=10;
 *                     System.out.println(a++); 
 *         : 반전연산자 : ~(양수<=>음수)
 *         : 형변환연산자
 *           형식) (데이터형) => (int) (byte) (double) (char)
 *           
 *           데이터형의 크기
 *           byte < short < int,char < long < float < double
 *           
 *           <=============================== DownCasting
 *           1. 자동형변환 : 데이터형을 크게 만드는 경우
 *              1) 값 대입
 *                 int a='A'-> 자동으로 int로 변환 a=65
 *                 long a=10 -> 자동으로 long형으로 변환 a=10L
 *                 double d=10 -> 자동으로 double => a=10.0
 *              2) 연산처리 => 같은 데이터형 크기로 변경
 *                  10+10.5 = 20.5
 *           2. 강제형변환 : 데이터형을 작게 만드는 경우
 *                10+(int)10.5 = 20
 *                10/(double)3=3
 *       ---------------------------------------
 *       이항연산자
 *        산술연산자 (+, -, *, /, %)
 *        비트이동연산자 (<<, >>)
 *        => 쉬프트연산자
 *        비트연산자 (&, |, ^)
 *        비교연산자 (==, !=, <, >, <=, >=) 숫자, 문자만 사용 가능
 *        boolean은 (==, !=)만 사용 가능
 *        => 모든 결과값은 boolean(true/false)
 *           조건문 / 반복문
 *        논리연산자 (&&, ||)
 *                (조건)&&(조건) 결과값 추출 => 조건 둘다 true일때만 true
 *                 => 직렬연산자(효율적인 연산)
 *                (조건)||(조건) 결과값 추출 => 둘중 하나라도 true면 true
 *                 ex) int x=10;
 *                     int y=9;
 *                     x<y && ++y==x
 *        대입연산자 => 연산순위가 마지막
 *              <= 오른쪽에서 왼쪽
 *              
 *              10+20+30
 *              => 왼쪽에서 오른쪽
 *              
 *             int a=10
 *             a=a+1
 *              ----- a=11
 *              
 *              연산 => 출력
 *              입력값 받기
 *               => Scanner => 키보드 입력값 받기
 *                1. Scanner 읽기 => 메모리에 저장
 *                   Scanner scan=new Scanner(System.in);
 *                    ㄴ데이터형   ㄴ변수   ㄴ메모리 할당   ㄴ키보드입력값
 *                    =nextInt(); : 정수값
 *                    =next(); : 문자열 읽기
 *                    ------------------- 공백
 *                    =nextLing(); : enter시 전체 문자열
 *               => 입력창
 *                2. JOptionPane.showinputDialog
 *                   --------------------------
 *                    | 단점 : 문자열
 *                    문자열 => 정수 변경 : Integer.parseInt()
 *                    문자열 => 실수 변경 : Double.parseDouble()
 *                    => 모든 데이터형을 String 변경
 *                                   ------ valueOf()
 *                    
 *              출력
 *                System.out.prinln(); : 줄바꿈
 *                System.out.print(); : 줄바꿈 X => 특수문자를 이용해 줄바꿈 가능
 *                System.out.pfintf(); : 출력 형식을 만들어서 출력
 *                    => 정수 출력 : %d
 *                    => 실수 출력 : %f => 가장 많이 사용
 *                                      소수점을 원하는 방식으로 출력
 *                                      %.1f, %.2f, %.3f
 *                    => 문자 출력 : %c
 *                    => 문자열 출력 : %s
 *                    => 명령프롬포트에서만 사용 => 웹X, 윈도우X
 *                JOptionPane.showMessageDialog()
 *                -------------------------------
 *               산술연산자
 *                1) 데이터형이 다른 경우
 *                   큰 데이터형으로 변경이 된다
 *                   10 + 10.5 => double
 *                   --- 자동 형변환
 *                   int + char = int
 *                   int + double = double
 *                   char + double = double
 *                   int + long = long
 *                   int + long + char + double = double
 *                2) int 이하 데이터형 (byte, char, short)
 *                   => 연산시 int취급
 *                   byte + byte = int
 *               + : 덧셈 + 문자열 결합
 *                   문자열이 있는 경우에는 붙인다
 *                   "7"+7="77"
 *               - : 뺄셈
 *               * : 곱셈
 *               / : 나눗셈
 *                   1) 0으로 나누면 오류 => infinity(무한대)
 *                   2) 정수/정수=정수
 *               % : 나누고 나머지
 *                   1) 결과값의 부호는 왼쪽을 따라감
 *                      ex)  5%2=1
 *                          -5%2=-1
 *                          -5%2=-1
 *                           5%-2=1
 *                  2) 5%0 => NaN => 연산결과가 없는 경우
 */
import javax.swing.*;
public class 산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오버플로우
//		long max=Integer.MAX_VALUE;
//		System.out.println(max);
//		System.out.println(max+1);
//		
//		//언더플로두
//		long min=Integer.MIN_VALUE;
//		System.out.println(min);
//		System.out.println(min-1);
//		
//		float f=10.5f;
//		char a=' ';
//		int a=10;
//		System.out.println(a++);
//		int b=10;
//		System.out.println(++b);
		
		//정수 두개를 받아서 산술 연산 차리
		String num1=JOptionPane.showInputDialog("첫번째 정수 입력:");
		String num2=JOptionPane.showInputDialog("두번째 정수 입력:");
		
		//정수로 변경
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		String result=n1+"+"+n2+"="+(n1+n2)+"\n"
				    + n1+"-"+n2+"="+(n1-n2)+"\n"
				    + n1+"*"+n2+"="+(n1*n2)+"\n"
				    + n1+"/"+n2+"="+(n1/n2)+"\n"
				    + n1+"%"+n2+"="+(n1%n2);
		
		JOptionPane.showMessageDialog(null, result);
				
		
		
	}

}
