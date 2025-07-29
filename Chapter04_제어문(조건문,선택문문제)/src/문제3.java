import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		System.out.print(" 1~4학년 입력:");
		int grade=scan.nextInt();
		
		System.out.print("점수 입력:");
		int score=scan.nextInt();
		if(score<0||score>100)
		{
			System.out.println("잘못된 입력입니다");
		}
		else
		{
			if(grade==4&&score>=70)
			{
				if(score>=70)
					System.out.println("합격");
				else
					System.out.println("불합격");
			}
			else
			{
				if(grade==3)
				{
					if(score>60)
						System.out.println("합격");
					else
						System.out.println("불합격");
				}
				else
				{
					if(grade==2)
					{
						if(score>60)
							System.out.println("합격");
						else
							System.out.println("불합격");
			}
					else
					{
						if(grade==1)
						{
							if(score>60)
								System.out.println("합격");
							else
								System.out.println("불합격");
		}
	
	
		
	
	}
	}
				}
			}
		}
	
}
