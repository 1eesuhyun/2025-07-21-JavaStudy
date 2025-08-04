/*
 * 		자바에서 지원하는 제어문
 * 		조건문
 *       = **단일조건문
 *           if(조건문) => 조건문 : 비교연산자, 논리연산자, 부정연산자
 *                      true/false
 *           {
 *           	실행문
 *           }
 *           => 오류 방지 => 처리가 안되는 문장 : 예외처리
 *       = **선택조건문
 *       	 true / false일때 나눠서 작업
 *       	 if(조건문)
 *       	 {
 *       		 조건 true
 *           }
 *           else
 *           {
 *           	 조건 false
 *           }
 *       = 다중조건문 : 조건에 맞는 문장만 수행 => 한개의 조건만 수행
 *         -------- 간결하게 표현
 * 		선택문 : switch ~ case
 * 		반복문 : while -> 반복횟수가 지정이 안된 경우
 *                    => 네트워크 / 데이터베잇,
 * 			   do~while -> 반드시 1번이상 수행 => 버린다
 *             for -> 반복횟수 지정
 *                  => 화면 출력
 * 		반복제어문 : break : 종료
 *                continue : 특정부분 제외
 *                
 *                
 *     조건에 따라 다르게 동작 : if / switch y x x--
 *     반복 작업 수행 : while / for
 *     -----------
 *        => 효율적인 코드 작성 
 *     
 */
/*
 *  제어문
 *   => 단일 조건문
 *      형식)
 *           if(조건문) => 부정연산자, 논리연산자,
 *           {
 *           	조건 => true면 수행하는 문장
 *           }
 *           
 *            => 자바에서 사용하는 모든 제어문은 바로 밑에 있는 문장 한개만 수행
 *            
 *            if(조건문)
 *               문장 1 ==> 여기만 수행
 *               문장 2 ==> if와 관계없는 문장 => 무조건 수행하는 문장
 *            if(조건문)
 *            {
 *            
 *            }
 *   1. 정수 입력 => 짝수 / 홀수
 */
import java.util.Scanner;
public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		// 입력값을 저장
		int num=scan.nextInt();
		
		if(num%2==0)
			System.out.println(num+"는 짝수다");
		if(num%2!=0)
			System.out.println(num+"는 홀수다");
	}

}
