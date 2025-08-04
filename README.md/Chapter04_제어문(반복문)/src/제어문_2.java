/*
 *      시작 어디까지 반복횟수
 *       1     2    4
 *  for(초기갑;조건식;증감식)
 *  {
 *  	반복 수행문장 3
 *  }
 *  
 *   => Front-End : for => Back-End : while
 *                         구구단 / 페이징
 */
public class 제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,even=0,odd=0;
		// 합 => 초기값은 0부터, 곱 => 초기값 1부터
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			
		}
		System.out.println("1~100까지 합:"+sum);
		System.out.println("1~100까지 짝수합:"+even);
		System.out.println("1~100까지 홀수합:"+odd);
		System.out.println("===================");
		

	    int a=0,b=0,c=0;
	    for(int i=1;i<=100;i++)
	    	// i변수는 for문에서만 사용 가능
	    {
	    	if(i%3==0)
	    		a+=i;
	    	if(i%5==0)
	    		b+=i;
	    	if(i%7==0)
	    		c+=i;
	    } // i는 메모리에서 사라짐 => 지역변수
	    System.out.println("3의 배수의 합:"+a);
	    System.out.println("5의 배수의 합:"+b);
	    System.out.println("7의 배수의 합:"+c);
	    
			
		
	
	}

}
