/*
 *  Card
 *    = 숫자
 *    = 종류
 *    --------- 인스턴스
 *    = width
 *    = height
 *    ---------- static
 *    
 *    파일 1개
 *    ------
 *    class를 여러개 제작이 가능
 *    
 *    => 저장명
 *    class ClassName
 *    public class ClassName => public이 있는 클래스
 *    => public class
 *       ------ 한번만 사용 가능
 *    => main은 한번만 사용
 */
class Card
{
	int num;
	String type;
	static double width,height;
}
public class 클래스_변수종류_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1=new Card();
		card1.num=2;
		card1.type="♠";
		
		Card card2=new Card();
		card2.num=3;
		card2.type="◆";
		
		System.out.println(card1.num);
		System.out.println(card1.type);
		System.out.println();
		System.out.println(card2.num);
		System.out.println(card2.type);
		System.out.println();
		Card.width=350;
		Card.height=550;
		
		System.out.println(card1.width);
		System.out.println(card1.height);
		System.out.println();
		System.out.println(card2.width);
		System.out.println(card2.height);
		
		/*
		 *   static => 메모리 공간이 동일 => 공유 메모리
		 *     => 클래스명.변수명
		 *   instance => 객체 생성시마다 메모리 공간이 달라진다
		 *               -------- new
		 *       => 객체명.변수명
		 *          ----- 메모리 주소
		 */
	}

}
