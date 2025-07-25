/*
 *  1. 12,1,2
 *     3,4,5
 *     6,7,8
 *     9,10,11
 */
import java.util.Scanner;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("월 입력:");
		int a=scan.nextInt();
		
		if(a==12||a==1||a==2)
		System.out.println(a+"월은 겨울 입니다");
		if(a>=3 && a<=5)
			System.out.println(a+"월은 봄 입니다");
		if(a>=6 && a<=8)
			System.out.println(a+"월은 여름 입니다");
		if(a>=9 && a<=11)
			System.out.println(a+" 월은 가을 입니다");
		
		
			

	}

}
