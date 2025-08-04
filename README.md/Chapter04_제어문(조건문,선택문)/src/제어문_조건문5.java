/*
 *    국어  영어  수학  점수입력
 */
import java.util.Scanner;
public class 제어문_조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수 입력:");
		int kor=scan.nextInt();
		System.out.print("영어점수 입력:");
		int eng=scan.nextInt();
		System.out.print("수학점수 입력:");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("평균:"+avg);
		System.out.println("총점:"+total);
		
		
		int temp=(total/3)/10;
		if(temp==10||temp==9)
			System.out.println("A학점");
		if(temp==8)
			System.out.println("B학점");
		if(temp==7)
			System.out.println("C학점");
		if(temp==6)
			System.out.println("D학점");
		if(temp<6)
			System.out.println("F학점");
		
		
	}

}
