/*
 *   2차for문 => 형식 => 동작 순서
 *   
 *   형식)     1    2
 *       for(초기값;조건식;증감식)
 *       {        3   4
 *       	for(초기값;조건식;증감식)
 *       	{	
 *       		실행문장 5----↑
 *       	}
 *       }
 *       
 *       i=1 ==> j=1,j=2,j=3,j=4,j=5
 *       i=2 ==> j=1,j=2,j=3,j=4,j=5
 *       i=3 ==> j=1,j=2,j=3,j=4,j=5
 *       i=4 ==> j=1,j=2,j=3,j=4,j=5
 *       i=5 ==> j=1,j=2,j=3,j=4,j=5
 *       
 *      1차 for => 줄수
 *      2차 for => 실제 내용 출력
 *      
 *      구구단
 *      
 *      *****
 *      *****
 *      *****
 *      *****  => 1차 for -> 4
 *                2차 for -> 5
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== 구구단 =====");
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%d * %d =%d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
