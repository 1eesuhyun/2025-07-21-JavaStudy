/*
*  산술연산자
*  	=> 자동형변환
*  		1) 큰 데이터형으로 변경후 연산
*  			10+10.5
*  			--
*  			10.0
*  			-------- 20.5
*  			int + char
*  				  ---
*  				  int변환
*           -------- int
*           double +char
*                   ---
*                   double변환
*           ------------ double
*        2) int이하 데이터형 (byte,char,short)
*           연산시 결과값이 => int
*           char + char  = int
*           short + byte = int
*           byte + byte  = int
*      + : 덧셈, 문자열결합
*            ----- String
*            => 산술규칙
*            => 7+"7"+7 => "777"
*            => 7+7+"7"+7+7 => "14777"
*        3) +, - 보다 *, /, % 우선순위
*           3+5*2=13
*      - : 뺄셈
*      * : 곱셈
*      ------------- 7+"7"*10 => 오류
*      / : 나눗셈
*           1) 정수/정수 = 정수 ex) 5/2=2, 10/3=3
*           				    5/2.0=2.5, 10/3.0=3.3333
*              => 5/2=2.5 , 5//2=2(Python)
*           2) 0으로 나누면 오류
*              10/0=오류
*      % : 나누고 나머지 => 배수, 홀짝, 여러명 텀
*      	   5%2=1
*         -5%2=>-1
*         -5%-2=>1
*          5%-2=>1
*             => 결과값은 항상 왼쪽 부호화 동일
*      ------------- 문자열 연산X
*      
*      연산처리
*      ------ 자동형변환 / 복잡한 계산은 ()이용
*      ------ 오버플로우
*/ 
import java.util.Scanner;
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(10/);
//		int a=369;
//		System.out.println(a/100);
//		System.out.println((a%100)/10);
//		System.out.println((a%10));
//		Scanner scan=new Scanner(System.in);
//		System.out.print("첫번째 정수:");
//		int num1=scan.nextInt();
//		System.out.print("두번째 정수:");
//		int num2=scan.nextInt();
//		
//		System.out.println("===== 결과");
//		System.out.printf("%d+%d=%d\n", num1,num2, num1+num2);
//		System.out.printf("%d-%d=%d\n", num1,num2, num1-num2);
//		System.out.printf("%d*%d=%d\n", num1,num2, num1*num2);
//		System.out.printf("%d/%d=%d\n", num1,num2, num1/num2);
//		System.out.printf("%d%%%d=%d\n", num1,num2, num1%num2);
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("단어 입력:");
//		String s=scan.nextLine(); //엔터 쳤을때 한번에 받음
//		String s1=scan.next();
//		String s2=scan.next();
//	String s3=scan.next();
//
//		System.out.println("==== 결과 ====");
//		System.out.println(s);
		
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("첫번째 정수:");
//		int num1=scan.nextInt();
//		System.out.print("두번째 정수:");
//		int num2=scan.nextInt();
//		System.out.print("세번재 정수:");
//		int num3=scan.nextInt();
//		
//		System.out.println("==결과==");
//		System.out.printf("%d*%d+%d=%d\n", num1,num2,num3, num1*num2+num3);
		
		Scanner scan=new Scanner(System.in);
	    System.out.print("첫번째 정수:");
		 int num1=scan.nextInt();
		 System.out.print("두번째 정수:");
		 int num2=scan.nextInt();
		 
		 System.out.println("==결과==");
		 System.out.printf("%d%%%d=%d\n", num1,num2,num1%num2);
		
		
		
	}
}
