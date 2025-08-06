
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'B','C','E','F','K'};
		// 출력
		// String c="BCEFK" => char[]을 변경해서 사용
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println();
		// 검색, 페이징
		// 데이터가 묶인 경우
		// 배열, 컬렉션
		for(char c:ch)  // 실제 데이터값 읽어서 출력 => 항상된 for
		{
			System.out.print(c+" ");
		}
	}

}
