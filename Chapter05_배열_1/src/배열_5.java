// 10개의 임의의 정수 저장 => 총합, 평균
// 전체 데이터 for => 요청값 추출 => if => 제어문
// 데이터저장 => 제어 (제어문)
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10]; // 변수의 갯수 10개
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100)+1;
			System.out.print(a[i]+" ");
		}
		int sum=0;
		
		for(int i:a)
		{
			sum+=i;
			
		}	
			System.out.println("\n총합:"+sum);
			System.out.printf("평군:%.2f\n",sum/10.0);
	}

}