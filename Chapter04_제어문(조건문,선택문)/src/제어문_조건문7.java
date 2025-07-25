/*
 *  점수 입력 0~100점사이
 *  =60점이상 합격
 *  =60점이하 불합격
 */
import java.util.Scanner;
public class 제어문_조건문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력:");
		int score=scan.nextInt();
		if(score>100)
			System.out.printf("?");
		if(score<60)
			System.out.printf("불합격");
		if(score>=60 && score<=100)
			System.out.printf("합격");
	}

}
