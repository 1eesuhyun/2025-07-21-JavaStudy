// 정수 3개 입력 총점, 평균, 학점
import java.util.Scanner;
public class 문제7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 영어 수학 00 00 00");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int total=(kor+eng+math);
		int avg=total/3;
		char score='A';
		
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
			
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+total/3);
		System.out.println("학점:"+score);
		
				
		
	}

}
