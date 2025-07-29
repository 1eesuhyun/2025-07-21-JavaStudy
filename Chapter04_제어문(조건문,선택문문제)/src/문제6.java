// 임의의 숫자 추출 대문자 소문자 구분
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int change=(int)(Math.random()*2);
		char c=' ';
		if(change==0)
			c=(char)((Math.random()*26)+65); //대문자
		else
			c=(char)((Math.random()*26)+97); //소문자
		
		if(c>='A'&&c<='Z')
			System.out.println(c+"는 대문자입니다");
		else
			System.out.println(c+"는 소문자입니다");
	}

}
