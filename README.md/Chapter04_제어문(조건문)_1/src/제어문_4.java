// 입력을 받아서 로그인
import java.util.Scanner;
// if~else : 114page
// 결과값 2개인 경우 => if~else
public class 제어문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의로 ID, PWD 설정
		final String ID="admin";
		final String PWD="1234";
		// final : 상수(변경 불가) => 변수와 구분 => 모든 키워드 대문자
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=scan.next();
		
		System.out.print("비밀번호 입력:");
		String pwd=scan.next();
		
		System.out.println("결과");
		if(id.equals(ID)&& pwd.equals(PWD))
			System.out.println("로그인 완료");
		else
			System.out.println("아이디나 비밀번호가 틀립니다");
		if(id.equals(null)&& pwd.equals(null))
			System.out.println("아이디 또는 비밀번호를 입력하세요");
		/*
		 *  scan.nextInt() : 정수 int에 저장
		 *  scan.nextDouble() : 실수 double에 저장
		 *  scan.nextBoolean() : true / false boolean에 저장
		 *  scan.next() : String에 저장
		 *  scan.nextLing() : String에 저장
		 */ 
		
	}

}
