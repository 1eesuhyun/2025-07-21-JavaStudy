/*
 *   1. 알파벳 입력 받고
 *      =대문자
 *      =소문자
 *      =알파벳이 아니다
 */
import java.util.Scanner;
public class 제어문_조건문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알바펫 입력:");
		String temp=scan.next();
		char c=temp.charAt(0);
		
		if(c>='A' && c<='Z')
			System.out.println(c+"는(은) 대문자입니다");
		if(c>='a' && c<='z')
			System.out.println(c+"는(은) 소문자입니다");
		
		if(!((c>='A' && c<='Z')||(c>='a' && c<='z')))
			System.out.println(c+"는(은) 알파벳이아니다");
		
		
	}

}
