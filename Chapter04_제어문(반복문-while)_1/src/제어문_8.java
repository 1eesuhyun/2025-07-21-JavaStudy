/*
 *   int i=1;
 *   while(i<=5)
 *   {
 *   	실행문장
 *   i++;
 *   }
 *                  false
 *   i=1 => i<5 =========> 실행문장 => i++
 *                  true 실행문장
 *   i=2 => i<=5 => 실행문장 => i++
 *   i=3 => i<=5 => 실행문장 => i++
 *   i=4 => i<=5 => 실행문장 => i++
 *   i=5 => i<=5 => 실행문장 => i++
 *   i=6 => i<=5 false
 *   
 *  int i=1;
 *  do
 *  {
 *  	실행문장 --> title(게임)
 *  	i++; 
 *  }while(i<=5);
 *  
 *  i=1 실행문장 => i++ => i=2 i<=5
 *  i=2 실행문장 => i++ => i=2 i<=5
 *  i=3 실행문장 => i++ => i=2 i<=5
 *  i=4 실행문장 => i++ => i=2 i<=5
 *  i=5 실행문장 => i++ => i=6 i<=5
 *                       종료
 */
public class 제어문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지 합
		// 지역변수 => scope => 범위
		int sum=0; //누적변수
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			//i는 메모리에서 사라짐
			
		}System.out.println("for문 :"+sum);
		
		int i=1;
		sum=0;
		while(i<=100)
		{
			sum+=i;
			i++;
			
		}System.out.println("while문 :"+sum);
		
		i=1;
		sum=0;
		
		do
		{
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println("do~while문 :"+sum);
			
		
	}

}
