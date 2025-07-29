// 정수 3개 입력해서 총점, 평균, 학점 구하기
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 영어 수학(90 90 90):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int avg=(kor+eng+math)/3;
		int total=(kor+eng+math);
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
		System.out.println("학점:"+score);
		System.out.println("총점:"+total);
		System.out.println("평균:"+total/3.0);
	}

}
