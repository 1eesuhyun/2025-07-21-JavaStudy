// 세 수의 최대 최소 합계 평균

import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 3개 입력:");
		
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
//		
//		int a=(int)((Math.random()*100)+1);
//		int b=(int)((Math.random()*100)+1);
//		int c=(int)((Math.random()*100)+1);
//		System.out.println(a+","+b+","+c);
		
		System.out.printf("합계 :%d\n", a+b+c);
		System.out.printf("평균 :%.2f\n", (a+b+c)/3.0);
		
		int max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		
		int min=a;
		if(min>b)
			max=b;
		if(min>c)
			max=c;
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		
		
	}

}
