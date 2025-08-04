/*
 *   => UpDown 게임
 *   => 난수 => 1~100사이
 *   => 사용자 입력
 *       => 힌트
 */
import java.util.Scanner;
/*
 *   반복문 => 제어 => 반복제어문
 *   1. 반복문 종료
 *      break
 *   2. 특정부분 제어
 *      continue
 *      
 *      for(int i=1;i<=10;1++)
 *      {
 *      	if(i==5) break;
 *      	System.out.println(i); 1 2 3 4
 *      }
 *      
 *      for(int i=1;i<=10;1++)
 *      {
 *      	if(i==5) continue;
 *      	System.out.println(i); 1 2 3 4 6 7 8  9 10
 *      }
 */
public class 제어문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println("\n========== break =========");
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5) break;
//			System.out.println(i+" ");
//		}
//		System.out.println("\n====== continue =======");
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5) continue;
//			System.out.println(i+" ");
//		}
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("1~100사이 정수 입력:");
		int com=(int)(Math.random()*100)+1; //1부터 100사이
		int count=0;
		for(;;)
		{
			int user=scan.nextInt();
			System.out.println("1~100사이 정수 입력:");
			// 입력이 잘못된 경우 continue
			// 정답 -> 종료 -> break
			// 게임 => 횟수지정X
			// 자동화
		
			if(user<1 || user>100)
		{
			System.out.println("1~100까지 정수만 사용 가능");
			continue;
			/*
			 *   continue
			 *   for => 증가식 (for에서 주로 사용)
			 *   while => 조건식
			 *   
			 *   => continue는 반드시 반복에서만 사용 가능
			 *   => if, switch에서는 사용 부가
			 */
		}
			count++; //정상 입력했을때
			//경우의 수=> if
			/*
			 *  1. com이 user보다 클때
			 *  2. com이 user보다 작을때
			 *  3. com=user
			 */
			if(com>user)
			{
				System.out.println("입력값 보다 큰 정수를 입력하세요");
			}
			else if(com<user)
			{
				System.out.println("입력값 보다 작은 정수를 입력하세요");
			}
			else
			{
				System.err.println("Game Over");
				System.out.println("입력횟수:"+count);
				break;
			}
	  }
		
	}

}
