/*
 *   문자열 => String : 1,2,3,4 프로젝트
 *                    -------------- 사용하는 변수/배열/클래스
 *                                   여기에 사용되는 데이터형 85%
 *   - 문자 여러개를 동시에 저장
 *     String == char[]
 *      | ==> 쉽게 제어 가능
 *      
 *     인덱스가 존재 => 데이터값을 변경
 *     for-each => 값을 받는 변수만 이용 => 출력
 *     
 *     저장 방법
 *        String s="문자열" => 일반 데이터형
 *        String s=new String("문자열","문자코드")
 *                   -------------------------
 *                             ISO-8859_1 ASC
 *                             => UTF-8
 *                             
 *       new : 새로운 메모리 공간에 저장해라
 *       
 *       제어하는 기능
 *       ---------- 메소드는 반드시 결과값이 존재
 *       1. 변환
 *          String toUpperCase() : 대문자 변환
 *          String toLowerCase() : 소문자 변환
 *          ------------------------ 검색
 *          **valueOf()** : 모든 데이터 형을 문자열로 변환
 *          String valueOf(10) => "10"
 *       2. 제어
 *          문자 자르기
 *          String substring(int beginIndex)
 *          String substring(int beginIndex,int endInedex)
 *                                          --------------
 *                                          endIndex-1
 *          문자를 자르다 => 구분자별 문자별
 *                        " " , | ...
 *          green, blue, black
 *          String[] split(String del)
 *          
 *          공백문자 제거 => 유효성 검사
 *          String trim() => 좌우 공백 제거
 *          
 *          문자열 결합
 *          String concat(String s) => 빈도 거의 없음
 *          + "ABC" + "DEF"
 *            "ABC".concat("DEF") ==> MySQL
 *          
 *       3. 변경
 *       	replace(char c1,char c2)
 *       	replace(String s1,String s2)
 *       
 *          String ss="Hello Java";
 *          ss.replace('a','b')
 *              => Hello jbvb
 *          ss.replace("Java","Oracle")
 *            => Hello Oracle
 *            
 *          String replaceAll(바꿀문자(문자열),문자열)
 *       4. 찾기
 *          char charAt(int index) => 문자 한개 추출
 *          
 *          "Hello Java"
 *           0123456789 => charAt(7) => 'a'
 *           
 *           int indexOf(char)
 *           int lastIndexOf(char)
 *           
 *           intdexOf('l') => 2 => 크롤링
 *           lastindexOf('l') => 3 => 경로명 / URL , 확장자
 *           
 *       5. 비교
 *          boolean equals(String s)
 *           => 대소문자 구분
 *              로그인 처리 / 아이디 종복체크
 *              검색
 *          
 *          boolean s.equalsIgnoreCase(String s)
 *           => 대소문자 구분없이
 *           boolean startsWith(String s)
 *           => 시작 문자열이 같은지 확인 : 대소문자 구분
 *              자동완성기
 *              => 쿠키에 저장 => 시작문자열이 같은 경우
 *           boolean endsWith(String s)
 *            => 끝나는 문자열이 같은 경우 : 대소문자 구분
 *           compareTo(String s)
 *           
 *           "Hello".compartTo("Java") 양수 3
 *           "Hello".compartTo("Hello") 0
 *           "Java".compartTo("Hello") 음수 -3
 */
import java.util.Arrays;
public class 문자열배열_1 {

	public static void main(String[] args) {

		// TODO Auto-gener,ated method stub
//		char[] ch= {'a','b','c','D','K'};
//		// 대문자 출력import java.util.Arrays;
//
//
//
//		for(char c:ch)
//		{
//			if(c>='a' && c<='z')
//				c=(char)(c-32);
//			System.out.print(c+" ");
//		}
//		System.out.println(Arrays.toString(ch));
//		String s="aBcdEK";
//		System.out.println(s.toUpperCase());
		/*
		 *  char[] => String
		 *  int => Integer
		 *  long => Long
		 *  ----------------- Wrapper
		 */
		
		// 문자열은 자체가 메모리 주소다
		// 같은 문자열은 같은 주소를 가지고 있다
//		String s1="Hello";
//		String s2="Hello";
//		String s3=new String("Hello");
//		
//		if(s1==s3)
//			System.out.println("같다");
//		else
//			System.out.println("다르다");
		
		int[]arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		/*
		 *  arr:주소 => 1 2 3 4 5(힙)
		 */
		int[]arr2=arr;
		System.out.println(Arrays.toString(arr2));
		arr2[0]=100;
		arr2[1]=200;
		// 얕은 복사
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr);
		System.out.println(arr2);
		// 클래스에서 제외 => String => 일반 데이터형
		// 깊은 복사 .clone()
		int[] arr3=arr.clone();
		System.out.println(arr3);
		
		String s1="Hello";
		String s2="Java";
		int res=s2.compareTo(s1); // 문자 비교 => 정렬
		System.out.println(res);
		
		int aa=100;
		int bb=200;
		int tt=aa; // 임시변수 선언
		aa=bb;
		bb=tt;
		System.out.println(aa+" "+bb);
		
	}

}
