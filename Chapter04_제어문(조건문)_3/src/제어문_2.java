// 문자 1개입력 => 대문자, 소문자, 숫자
// 0, '0'(48)

/*
 *  package
 *  import
 *  import
 *  import...
 *  class ClassName
 */
import java.util.Scanner;
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.print("문자 1개 입력:");
		String s=scan.next();
		char c=s.charAt(0);
		 if(c>='A' && c<= 'Z')
		 {
			 System.out.println(c+"는 대문자입니다");
		 }
		 else if(c>='a' && c<='z')
		 {
			 System.out.println(c+"는 소문자입니다");
		 }
		 else if(c>='0' && c<='9')
		 {
			 System.out.println(c+"는 숫자입니다");
		 }
		 else
		 {
			 System.out.println(c+"알파벳이나 줏자가 아닌 문자입니다");
		 }
	}

}
