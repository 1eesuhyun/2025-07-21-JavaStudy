// 10번 가위바위보 승패무 출력
import java.util.Scanner;
/*
 *    com 0
 *      user 0
 *      user 1
 *      user 2
 *      
 *    com 1
 *    	user 0
 *      user 1
 *      user 2
 *   
 *   com 2
 *   	user 0
 *      user 1
 *      user 2
 */
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int win=0;
		int lose=0;
		int same=0;
		
		for(int i=1;i<=10;i++)
		{
			// 1. compute => 난수
			int com=(int)(Math.random()*3); // 가위 0 바위 1 보 2
			System.out.print("가위(0),바위(1),보(2): ");
			int user=scan.nextInt();
			
			if(user<0 || user >2)
			{
				System.err.println("가위바위보를 입력하세요");
				i--;
				continue;
			}
			// 정상 입력
			int res=com-user;
			if(res==-1||res==-2)
			{
				
			}
			else if(res==2 || res==-1)
			{
				
			}
			else
			{
				
			}
			if(res==-2||res==1)
			{
				lose++;
				System.out.println("컴퓨터 win");
			}
			else if(res==2 || res==-1)
			{
				win++;
				System.out.println("유저 win");
			}
			else
			{
				same++;
				System.out.println("비김");
			}
		}
		System.out.println("=== 결과 === ");
		System.out.printf("%d승 %d무 %d패\n",win,same,lose);
		
		// 모든 프로그램 => 가정
		// 게임 => 숫자로 가정
	}

}
