//최대 최소
import java.util.Scanner;
public class 문제4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 3개 입력 (00 00 00)");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int total=(a+b+c);
		
		int max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		
		int min=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("합계 :"+total);
		System.out.println("평균:"+total/3);
	}

}
