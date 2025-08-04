
// for=> 시작점, 끝점, 증가식

/*
 *  밑에 있는 묹장 1개만 수행
 *  for()
 *   문장 => 여기까지만 for문 소속
 *   문장
 *   
 *   for()
 *   {
 *   	2개이상 문장은 블록 안으로
 *   }
 *   
 *   for(int i=1...) i-> for문 안에서만 사용가능
 */
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=10;i++)
//		{
//			if(i%3==0)
//				continue;
//			System.out.print(i+" ");
//			
//		
//		}
		String[] arr= {"aaa","bbb","ccc","ddd","eee","fff","nnn","uuu","iii","mmm"};
//		System.out.println(arr[0]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);
//		System.out.println(arr[9]);
		
		for(int i=0;i<9;i++)
		{
			System.out.println(arr[i]);
		}
		}
	}

