import java.util.Scanner;
public class 메소드_2_변환 {
	//입력
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(0~32767): ");
		int num=scan.nextInt();
		return num;
	}
	//처리
	//데이터가 많은 경우 => 배열 / 클래스
	
	static void binary(int num,int[] bin)
	{
		
			//배열 => 
			int index=15;
		while(true) //반복횟수 지정X, for 반복횟수 지정
		{
			
			bin[index]=num%2;
			num/=2;
			if(num==0)
				break;
			index--;
		}
		//return bin;
	}
	static void print(int[] bin)
	{
		System.out.println("===== result =====");
		for(int i=0;i<bin.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(bin[i]);
		}
	}
	static void process()
	{
		int num=input();
		int[] bin=new int[16];
		binary(num, bin);
		print(bin);
//		int[] bin=binary(num);
//		print(bin);
	}
	//출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(); // 다른 클래스에서 가져오기?
	}

}
