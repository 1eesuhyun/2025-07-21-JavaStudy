/*
 *    변수 / 연산자 / 제어문
 *    
 *    
 *    변수 => 데이터를 저장 => 연산 처리
 *                         응용 : 제어문
 *    변수 + 연산자 + 제어문
 *    ------------------ 메소드
 *    메소드 여러개 묶음
 *    ------------------ 클래스
 *    클래스 여러개 묵음
 *    ------------------ 패키지 => .jar
 *    
 *    연산자
 *    	= 단항연산자
 *        증감연산자 (++, --)
 *          전치연산자 : 먼저 증가 ==> ++a
 *          후치연산자 : 나중에 증가 ==> a++
 *          ------------------------------- 공통점 : 1증가, 감소
 *          int a=10;
 *          int b= ++a; : 수행 후 대입
 *          
 *          int a=10;
 *          int b= a++; : 대입 후 수행
 *          
 *        부정연산자 (!) : 부정
 *                       boolean에서 사용 가능
 *                       true <=> false
 *                       => 조건문
 *                          ---- 1) 삼항연산자
 *                               2) if문
 *        형변환연산자 (데이터형)
 *      = 이항연산자
 *        산술연산자 (+,-,*,/,%)
 *         => 자동형변환
 *           => 큰데이터형으로 변경후 연산
 *           ---------------------- # 연산은 같은 데이터형끼리만 가능
 *             ex) double + int
 *                          ---- double로 변경
 *                 int이하는 연산지 결과값이 int
 *                 char+char=int
 *                 short+short=int
 *                 char+short+int
 *        비교연산자 (==, !=, <=, >=, <, >)
 *         => 숫자만 비교가 가능 (실수, 정수, 문자(숫자취급))
 *         => 예외 (boolean ==, !=)
 *         => 조건문 / 반복문에서 주로 사용
 *           ---- 삼항연산자
 *           <= 작거나 같다
 *           >= 크거나 같다
 *         => 결과값은 boolean (true/false)
 *         => 문자열 비교
 *          => equals 사용한다
 *        논리연산자 (&&, ||)
 *          (조건) && (조건) = true/false (두 개의 조건이 true일때만 true)
 *          효율적인 연산 => 왼쪽에 있는 조건이 false면 오른쪽 조건은 실행X
 *          => 사용 : 범위(페이징, 점수), 기간(예약가능) 포함 여부 확인
 *                   오라클 : Between ~ AND
 *           (조건) || (조건) => true/false 1개 이상의 true가 있으면 true
 *           왼쪽 조건값이 true면 오른쪽 수행X
 *           사용 => 범위, 기간외... 잘못된 입력
 *           
 *           알파벳 => 소문자
 *           c>='a' && c<'z'
 *           c>='A' && c<'Z'
 *           
 *                   
 *        대입연산자 (=, +=, -=)
 *        	= 대입 +=, -= : 복합대입연산자
 *        a+=1 -> a=a+1
 *        a+=2 -> a=a+2
 *        -------------- 여러개 증가
 *        -=
 *        a-=1 => a=a-1
 *        a-=2 => a=a-2
 *        
 *         => 결과값 (연산자), 초기값 대입, 변경된 값
 *         
 *         
 *        삼항연산자 ((조건)?값1 : 값2)
 *                   |true  => 값1
 *                    false => 값2
 *             => 소스가 간결 : 게임 / 웹 => 삼항연산자
 *             
 *             if(curpage>1)
 *             {
 *             %>
 *             <a href="lst.jsp?page=<curpage-1%>이전</a>
 *             <%
 *             {
 *              else
 *             }
 *             %>
 *             <a href="lst.jsp?page=<curpage-1%>이전</a>
 *             <%
 *             
 *              
 *             
 *                    
 *        연산자 종류
 *        + : plus / 문자열 결합
 *            6+7=13 --------
 *                    "Hello"+"Java" => "HelloJava"
 *            연산방향
 *            ===> 왼쪽에서 오른쪽
 *            6+7+9=22
 *        / : 0으로 나누면 오류 발생
 *            정수/정수=정수 => 정수/실수=실수
 *        & : 나머지는 반드시 왼쪽 부호
 */
public class 정리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=10;
		int z;
		
		x++;
        ++x;
        System.out.println("x="+x);
        System.out.println("====");
        
        y--;
        --y;
        System.out.println("y="+y);
        System.out.println("====");
        
        z=x++;
        System.out.println("z="+z);
        System.out.println("====");
        z=++x;
        System.out.println("z="+z);
        System.out.println("x="+x);
        
        z= ++x + y++;
        System.out.println("z="+z);
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        System.out.println("=====");
        boolean bCheck=false;
        System.out.println(bCheck);
        System.out.println(!bCheck);
        
        System.out.println("=====");
        System.out.println(65.0);
        System.out.println((int)65.0);
        System.out.println((char)65.0);
        System.out.println((double)'A');
        System.out.println((double)65);
        
        char c1='A';
        char c2='B';
        int c3=c1+c2;
        
        byte b1=10;
        byte b2=20;
        int b3=b1+b2;
        

	}

}
