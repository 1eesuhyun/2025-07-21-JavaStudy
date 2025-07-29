// 다중 조건문 => 중첩 조건문 사용
/*
 *   A => A+, A0, A-
 *   B => B+, B0, B-
 */
import java.util.Scanner;
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 영어 수학 점수 입력:(90 90 90)");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int avg=(kor+eng+math)/3;
		
		char score=' ';
		char op=' ';
		
		if(avg>=90)
		{
			score='A';
			if(avg>=97)
				op='+';
			else if(avg>=94)
				op='0';
			else
				op='-';
		}
		else if(avg>=80)
		{
			score='B';
			if(avg>=87)
				op='+';
			else if(avg>=84)
				op='0';
			else
				op='-';
		}
		else if(avg>=70)
		{
			score='C';
			if(avg>=77)
				op='+';
			else if(avg>=74)
				op='0';
			else
				op='-';
		}
		else if(avg>=60)
		{
			score='D';
			if(avg>=67)
				op='+';
			else if(avg>=64)
				op='0';
			else
				op='-';
			
		}
		else
		{
			score='F';
		}
		System.out.println("결과:"+score+op);
		
	}

}
