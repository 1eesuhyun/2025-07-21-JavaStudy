// 1~4학년 1~3학년 60점이상 합격 4학년 70접이상 합격

import java.util.Scanner;
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1~4학년 입력:");
		int grade=scan.nextInt();
		System.out.print("점수 입력:");
		int score=scan.nextInt();
		
		if(score<0 || score>100)
		{
			System.out.println("잘못된 점수입니다");
		}
		else
		
		{
			if(grade>=1 && grade<=3 && score>=60)
			{
				System.out.println("합격");
			}
		else if(grade>=4 && score>=70)
		{
			System.out.println("합격");
		}
		else 
		{
			System.out.println("불합격");
		}
		
		}
	}
}
