
public class 배열_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];
		int su=0; //난수 저장
		boolean bCheck=false;
		
		for(int i=0;i<lotto.length;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				su=(int)(Math.random()*45)+1;
				bCheck=false;
				for(int j=0;j<j;j++)
				{
					if(lotto[i]==lotto[j])
					{
						bCheck=true;
						break;
					}
				}
						
			}
			lotto[i]=su;
		}
		for(int i:lotto)
		{
			System.out.print(i+" ");
		}
	}

}
