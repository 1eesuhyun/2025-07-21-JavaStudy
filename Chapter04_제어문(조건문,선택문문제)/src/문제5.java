// 양수냐 정수냐
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		if(num>-1)
		{
			System.out.println(num+"은 양수입니다");
			System.out.println("절대값:"+Math.abs(num));
		}
		else
		{
			System.out.println(num+"은 음수입니다");
			System.out.println("절대값:"+Math.abs(num));
		}
	}

}
