package com.sist.lang;
/* toString : 객체의 주소를 문자열로 바꾼다
 * (String)obj => obj.toString()
 * toString 생략가능
 */
class Food
{
	int fno=1;
	String title="맛집";
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "맛집 번호:"+fno+", 맛집명:"+title;
	}
	
}
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f=new Food();
		System.out.println(f);
	}

}
