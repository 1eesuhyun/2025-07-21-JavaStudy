/*
 *   for-each : 화면 출력용 반복문
 *   for(데이터 받는 변수 : 배열 또는 컬렉션) 
 *       // 바로 출력 또는 처리 가능
 *       
 *       1. 기본형
 *       2. 사용자 정의 데이터형 : class
 *   
 *   ** while(true) => 서버 / 데이터베이스
 *   
 *     기능 분리
 *     ------- 메소드 : 기능 구현
 *             ** 기능 구현
 *             ** 반복 제거
 *             ** 가독성
 *             ** 에러를 빨리 수정하기 
 *             
 *      형식)
 *          리턴형 메소드명(매개변수...)
 *          ----                                      ----   <- 클래스형이 동일해야한다?
 *          {
 *          	return 값; => 메소드 종료시점
 *                     -- 클래스 / 배열 / 기본형
 *                     => 기본형 : int / boolean 
 *          }
 *          
 *          매개변수 : 사용자 요청 값
 *                   ----------
 *                   목록 => 페이지
 *                   사원의 상세보기 => 사번
 *                   ------------------
 *                   사원 등록 => 사원 객체
 *                   ------------------
 *                   여러개 / 한개 / 없는 경우 / 알 수 없는 경우
 *          리턴형 : 결과값(화면출력 내용)
 *                 --------------- 서버에서 처리
 *          메소드명 => 식별자
 *          
 *          => 가변형 매개변수
 *   		   int... a
 *   		   char...b
 *             boolean...c
 *             ----------
 *             object...obj => 가장 큰 데이터형
 *             
 *             Object o=10
 *             o=10.0
 *             o=new Sawon()
 *             o='A'
 *             o=true
 *             
 *          클래스는 종류별로 데이터를 묶어서 사용
 */

class Sawon {
    int sabun;      // 사번
    String name;    // 이름
    String dept;    // 부서
    String job;     // 직위
    String loc;     // 근무지
    int pay;        // 연봉
// 배열 , 클래스
    // 생성자
    public Sawon(int sabun, String name, String dept, String job, String loc, int pay) {
        this.sabun = sabun;
        this.name = name;
        this.dept = dept;
        this.job = job;
        this.loc = loc;
        this.pay = pay;
    }
}

public class 메소드_정리 {

    public static void main(String[] args) {
        // Sawon 객체 5개 생성
        Sawon[] sawons = new Sawon[5];
        sawons[0] = new Sawon(1, "홍길동", "개발부", "대리", "서울", 4000);
        sawons[1] = new Sawon(2, "심청이", "영업부", "사원", "부산", 5000);
        sawons[2] = new Sawon(3, "이순신", "총무부", "과장", "대전", 6000);
        sawons[3] = new Sawon(4, "손흥민", "기획부", "사원", "강원", 7000);
        sawons[4] = new Sawon(5, "박지성", "자재부", "부장", "강원", 8000);

        // for-each 문을 이용한 출력
        for (Sawon s : sawons) {
            System.out.printf("%-5d %-6s %-6s %-4s %-4s %,6d\n",
                s.sabun, s.name, s.dept, s.job, s.loc, s.pay);
        }
        
    }
}
