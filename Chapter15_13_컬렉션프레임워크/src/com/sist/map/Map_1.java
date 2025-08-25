package com.sist.map;
/*
 *    Map ==> 인터페이스
 *     |
 *   ---------------
 *   |             |
 *  HashMap    Hashtable
 *   = 비동기     = 동기    => Hashtable을 보완한개 HashMap
 *  
 *  => List : ArrayList
 *  => Set : HashSet
 *  => Map : HashMap
 *  --------------------
 *  
 *  => 특징
 *      - 두개를 동시에 저장(key, value)
 *        => 웹 / MyBatis / Spring
 *               |            | 키 값
 *               |                 클래스 주소값
 *               |              임의로 지정
 *               | 키 / 값
 *                 id  SQL
 *           | request / response / session / cookie
 *       => key : 중복 불가(오류는 없음[덮어쓴다])
 *       => value : 중복 가능
 *          
 *           ("id","hong")
 *           ("id","shim") => 사용 불가
 *             => id값을 가지고 온다 shim
 *                why? 덮어썼기 때문에
 *       
 */
import java.util.*;
// => 저장(put) / 읽기(get[key])
public class Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hashtable(동기) => 쓰레드, HashMap(비동기) => 일반
		/*
		 *   ArrayList  : 비동기 => 데이터베이스 값을 가져올때
		 *   Vector     : 동기 => 쓰레드 => 네트워크
		 *   LinkedList : 파일 입출력 
		 */
		Map map=new HashMap();
		map.put("id","admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", 25);
		map.put("id", "hong"); // key중복 => 덮어쓴다
		System.out.println("ID:"+map.get("id"));
		System.out.println("PASSWORD:"+map.get("password"));
		System.out.println("NAME:"+map.get("name"));
		System.out.println("SEX:"+map.get("sex"));
		System.out.println("AGE:"+map.get("age"));
		System.out.println();
		// 키는 대소문자 구분 => 문자로 시작
		
		// key만 받기
		Set set=map.keySet();
		for(Object obj:set)
		{
			String key=(String) obj;
			System.out.println(obj+":"+map.get(key));
		}
		System.out.println();
		/*
		 *   clear() : 전체 삭제
		 *   get(String key) : 값 읽기
		 *   put() : 저장(데이터 추가)
		 *   isEmpty() : 데이터 있는지 여부
		 *   size() : 저장 갯수
		 *   keySet() : key전체를 읽는 경우
		 *   values() : 실제 저장된 값만
		 */
		
		//  values() 값만 읽기
		for(Object obj:map.values())
		{
			System.out.println(obj);
		}
	}

}
