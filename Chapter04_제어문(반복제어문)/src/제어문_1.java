/*
 *  break=> 반복을 종료할 때 사용
 *   | => for, while, do~while, switch
 *     => if문에서는 사용 불가
 *     
 *    종료 => break, return, System.exit(0)
 *    
 *    특정 부분을  제외하고 프로그램 유지
 *     continue : for, while , do~while
 *     => for => 증가식이동
 *     => while => 조건식으로 이동 : 무한루프일 경우가 많다
 *     
 *     ** break와 continue는 '자신'의 반복문에서만 가능
 *          |      | 문장 안의 조건을 제외 ex) if(i==2) -> i가 2일때를 제외하고 수행
 *          | 문장의 조건까지 수행 ex) if(i<=2) -> i가 2보다 크거나 같을때까지만 수행
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=3;i++)
//		{
//			for(int j=1;j<=3;j++)
//			{
//				if(j==2) continue;
//				System.out.println("i="+i+" j="+j);
//			}
//			
//		}
		
		for(int i=1;i<=5;i++)
		{
			if(i==3)
				break; // <- 문장 안의 조건을 제외
			System.out.println(i);
		}
	}

}
