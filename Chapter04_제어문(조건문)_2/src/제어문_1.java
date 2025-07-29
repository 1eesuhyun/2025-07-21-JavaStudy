/*
 *    1. 식별자
 *       = 알바펫, 한글로 시작 (알파벳은 대소문자 구분)
 *       = 숫자 사용 가능 (앞에 사용 금지)
 *       = 키워드 사용 불가 (빨간색)
 *       = 공백 금지
 *       = 특수문자 사용 (_,$)
 *       ------------------------------------
 *       변수 /함수 
 *       클래스 / 인터페이스
 *       메소드
 *       => 구분(약속)
 *          1. 변수는 소문자 시작(두개이상 단어)
 *             file_name, fileName
 *          2. 상수는 모든 문자를 대문자로 사용
 *          3. 클래스는 대문자 시작
 *             FileName File_Name
 *          4. 인터페이스 => 클래스와 동일
 *          5. 메소드 => 변수와 동일
 *     2. 다중조건문 (115page)
 *        => 메뉴/ 네트워크 (내부 프로토콜) / 데이터베이스 => SQL
 *        => 게임 => 키값에 따라서 상황 변경
 *     형식)
 *           시작
 *       if(조건문)
 *       {   true
 *       	실행문 (true일때 문장 수행 => 종료
 *       }   false                                                                    
 *       else if(조건문)
 *       {
 *       	실행문
 *       }
 *       
 *       if(조건문)
 *       {
 *       	실행문
 *       }
 *       else if(조건문)
 *       {
 *       	실행문
 *       }
 *       
 *       else
 *       {
 *       	조건이 없는 경우 => default => 생략 가능
 *       }
 *       
 *       => 단일 조건문 여러개 차이점
 *       ----------- 모든 if을 검색
 *        다중 조건문은 한개만 수행
 *       
 *       if(score>=90)
 *       {
 *       }
 *       if(score>=80)
 *       {
 *       }
 *       if(score>=70)
 *       {
 *       }
 *       if(score>=60)
 *       {
 *       }
 *       if(score>=50)
 *       {
 *       }
 *       if(score>=90)
 *       {
 *       }
 *       
 *       
 */
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 영어 수학 점수 입력(90 90 90)");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int avg=((kor+eng+math)/3);
		System.out.println("결과");
		char score='A';
//		if(avg>=90 && avg<=100)
//			score='A';
//		if(avg>=80 && avg<90)
//			score='B';
//		if(avg>=70 && avg<80)
//			score='C';
//		if(avg>=60 && avg<70)
//			score='D';
//		if(avg<60)
//			score='F';
		if(avg>=90)
			score='A';
		else if(avg>=80)
			score='B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		else
			score='F';
		
		
		System.out.println("학점:"+score);
		
	}

}
