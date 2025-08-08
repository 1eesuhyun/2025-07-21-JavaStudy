/*
 *  1. 기본
 *     --- 변수(데이터형) / 연산자 / 제어문
 *     1) 변수 / 상수
 *              |여러개=> 열거형(생성자)
 *         | 여러개 => 배열
 *         = 변수 : 수정이 가능, 한개의 데이터를 저장하는 메모리 공간
 *          - 메모리 크기 결정(데이터형)
 *         = 상수 : 수정이 불가능 => final
 *     2) 데이터형
 *        - 기본형 : 메모리에 데이터형
 *          - 정수 저장
 *            = byte -> 8bit(네트워크 송수신 / 웹)
 *            = int -> 32bit(일반 정수[default])
 *            = long -> 64bit(금융권 / 증권)
 *          - 실수 저장
 *            = double -> 64bit(소수점 15자리까지 / 일반 실수 / 건축[정밀도가 좋음])
 *          - 논리 저장
 *            = boolean -> 8bit(조건 / 반복)
 *          - 문자 저장
 *            = char -> 16bit(양수만 저장[0~65535])
 *   -----------------------------------------------------------········· 
 *        - 참조형 : 여러개의 데이터를 저장하는 경우 => 주소
 *                 -----------------
 *                 배열 / 클래스
 *                       ---- String 문자열
 *             - String : 문자열 여러개 저장
 *               클래스형 -> 메소드 지원
 *               = 비교
 *                *1)equals : 대소문자 비교 구분
 *                   ex) 로그인 / 회원가입
 *                    · boolean equals(String s)
 *                     --------        --------
 *                      리턴형          비교대상 문자
 *                *2) contains : 대소문자 구분 => 포함여부
 *                    · 검색
 *                      boolean contains(String fd)
 *                                       ---------
 *                                       포함 문자
 *                *3) startsWith : 대소문자 구분 => 시작문자열
 *                   · 자동 완성기 / 쿠키 찾기
 *                     boolean startsWith(String s)
 *                                        ---------
 *                                        시작 문자열(s로 시작했냐)
 *                4) endsWith : 대소문자 구분 => 끝 문자열
 *                   · 이미지 확장자
 *                     boolean endsWith(String s)
 *                                      --------
 *                                      끝 문자열(끝에서 s찾기)
 *                                      
 *           = 제어
 *              1) substring : 자르기
 *                 => CSS
 *                 => 우편번호 / 주소 / 생성AI
 *                 => 오버로딩
 *                    같은 이름의 메소드가 여러개 존재
 *                    ** 메소드명이 동일
 *                    ** 리턴형은 관계없음
 *                    ** 매개변수의 갯수가 다르다
 *                    ** 매개변수의 데이터형이 다른 경우
 *                    ** 비슷한 기능
 *                    
 *                ** 원형
 *                   String substring(int beginIndex)
 *                   => 지정된 위치에서 마지막 문자까지 자르기
 *                   => 웹 => 필요(MVC)
 *                   => 브라우저에서 서버연결 : URL주소
 *                      login.jsp?id=aaa&pwd=1234
 *                ** String substring(int beginIndex,int endIndex)
 *                                    -------------  ------------
 *                                         포함           포함X
 *                                                      endIndex-1(마지막거 제외)
 *                                                      
 *              ** 문자열의 원형은 변형되지 않는다
 *            = 찾기
 *              indexOf     : 지정된 문자, 문자열의 인덱스번호 확인
 *                            => 앞에서 부터(포함)
 *              int indexOf(char c)
 *              int indexOf(String s)
 *              lastIndexOf : 지정된 문자, 문자열의 인덱스번호 확인
 *                            => 뒤에서 부터
 *              int lastindexOf(char c)
 *              int lastindexOf(String s)
 *              https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUqBggAEEUYOzIGCAAQRRg7MgYIARBFGDsyBggCEEUYOzIGCAMQRRg7MgYIBBBFGD0yBggFEEUYPDIGCAYQRRg80gEHMzQ0ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8
 *           = 변환
 *             replace : 문자/문자열
 *             String replace(char c,char c1)
 *                             ----- -------
 *                           찾는 문자  변경할 문자
 *                           Hello Java
 *                           ('a','b')=> Hello Jbvb
 *             String replace(String s,String s1)
 *                            Hello Java
 *                            ("Java","Oracle") => Hello Oracle
 *             => 오라클에 데이터를 추가
 *                ----------------
 *                & => 입력 => 크롤링 오라클에 첨부
 *                => 네트워크 채팅
 *                   
 *             replaceAll : 문자/문자열 => 정규식
 *             =>
 *             		String replaceAll(String regex,String s)
 *                                           -----
 *                                           정규식
 *             trim : 공백문자
 *             => 좌우 공백문자만 제거 가능(중간에 있는 공백은 제거 불가능)
 *             => String trim()
 *             => 로그인 / 회원가입 / 글쓰기/ 검색
 *             valueOf : 모든 데이터형을 문자열로 변환
 *             
 *             192.168.10.1 [0-9]{1,3}\\
 *             192.168.10.2
 *             192.168.10.3
 *             192.168.10.4
 *             192.168.10.5
 *             192.168.10.6
 *             192.168.10.7
 *             1111-1111
 *             555.555.555
 *             666.666.1
 *             
 *             맛있는 맛있고
 *             
 *             맛있+
 */
public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://localhose:8080/member/login.jsp?id=aaa&pwd=1234";
		String s=url.substring(url.lastIndexOf("/")+1,url.indexOf("?"));
		System.out.println(s);
		s=url.substring(url.indexOf("=")+1,url.lastIndexOf("&"));
		System.out.println(s);
		s=url.substring(url.lastIndexOf("=")+1);
		System.out.println(s);
		String ss="bile|black|yellow|pink|green";
		String[] data=ss.split("\\|");
		for(String sss:data)
		{
			System.out.println(sss);
		}
	}

}
