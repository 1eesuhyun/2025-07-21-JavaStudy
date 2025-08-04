/*
 *    선택문
 *      형식)
 *         switch(정수, 문자, 문자열)
 *         {
 *         		정수
 *         		case 1:
 *         			처리문장
 *              break;
 *              case 2:
 *              	처리문장
 *              break;
 *              
 *              default:
 *                 처리문장
 *         }
 *         => break없이 사용
 *         switch(문자,문자열,정수)
 *         {
 *           case 1 -> {
 *                  --- 람다 => break없이 사용
 *           }
 *           case 2 -> {
 *           
 *           }
 *           case 3 -> {
 *           
 *           }
 *         }
 *         
 *         switch(문자,문자열,정수)
 *         {
 *         	case1,2 -> {
 *         
 *         }
 *          case3,4 -> {
 *          
 *          }
 *         }
 *         
 *         => 값 한개 선택 => 다중 조건문을 간결하게
 *         => 메뉴, 게임 키를 누르는 경우
 *         => 게임 / 네트워크
 *         => 1개만 사용 가능
 *         => 웹에서는 많이 사용하지 않는다
 *         => 데이터형 : short, float
 *                     byte => 파일업로드 / 파일 다운로드
 *                     => int / long / double / String
 *         => 연산자 : !, ++, --, ()
 *                   산술, 비교, 논리, 대입
 *         => 제어문 : if, if~else
 *                   for, while
 *                   break
 *         ---------------------------------------------
 *         
 *         정수 => 1
 *         int a=1;
 *         switch(a)
 *         {
 *         	case 1:
 *            System.out.println(1)
 *            case 2:
 *            System.out.println(2)
 *            case 3:
 *            System.out.println(3)
 *            case 4:
 *            System.out.println(4)
 *            case 5:
 *            System.out.println(5)
 *            default:
 *            System.out.println("없는 번호")
 *         }
 *         
 *         switch(avg)
 *         {
 *         	case 10:
 *          case 9:
 *          System.out.pringln('A');
 *          break;
 *          -------- 사용하지 않는 경우 => 람다식
 *          case 10,9 ->{
 *          
 *          }
 *         }
 */
import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int num1=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		String op=scan.next();
		
		System.out.print("두번째 정수:");
		int num2=scan.nextInt();
		
//		switch(op)
//		{
//		case"+":
//			System.out.printf("%d %s %d=%d\n", num1,op,num2,num1+num2);
//			break;
//		case"-":
//			System.out.printf("%d %s %d=%d\n", num1,op,num2,num1-num2);
//			break;
//		case"*":
//			System.out.printf("%d %s %d=%d\n", num1,op,num2,num1*num2);
//			break;
//		case"/":
//			if(num2==0)
//				System.out.println("0으로 나눌 수 없음");
//			else System.out.printf("%d %s %d=%d\n", num1,op,num2,num1/num2);
//			break;
//		default:
//			System.out.println("잘못된 연산");
//		}
		
		switch(op)
		{
		case"+" -> {
			System.out.printf("%d %s %d=%d\n", num1,op,num2,num1+num2);
		}
		case"-" -> {
			System.out.printf("%d %s %d=%d\n", num1,op,num2,num1-num2);
		}
		case"*" ->{
			System.out.printf("%d %s %d=%d\n", num1,op,num2,num1*num2);
		}
		case"/" ->{
			if(num2==0)
				System.out.println("0으로 나눌 수 없음");
			else System.out.printf("%d %s %d= %d\n", num1,op,num2,num1/num2);
			break;
		}
		default ->{
			System.out.println("잘못된 연산");
	  }
	 }
	}
}
