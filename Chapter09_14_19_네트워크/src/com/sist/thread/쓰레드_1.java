package com.sist.thread;
/*
 *   프로세스 : 실행중인 프로그램
 *   쓰레드 : 프로세스내에서 실행되는 작은 실행 단위
 *   ** 모든 프로세스는 한개 이상의 쓰레드를 가지고 있다
 *   자바에서 쓰레드 생성 방법
 *   ------------------
 *   => 게임 / 네트워크(서버 = 웹서버) => 자바 : 인트라넷
 *            ----- 흐름
 *   1. Thread 상속
 *      class AThread extends Thread
 *   2. 인터페이스 구현
 *      class BThread implements Runnable
 *   3. Thread Pool : 미리 생성 => 속도가 빠름 / 사용하지 않는 쓰레드가 존재(메모리 누수)
 *      ---------- Connection Pool : 데이터베이스 연동
 *                 --------------
 *   4. 크롤링에서 사용
 *   5. 나눠서 작업 => 속도가 빠르다
 *       단점 : 다른 쓰레드에 영향을 미친다(쓰레드 충돌 ex) 블루스크린)
 *       ------------------------------------------------
 *       프로세스는 독립적 => 
 *       ---------------
 *       밥을 먹는 일 => 프로세스
 *       -------- 밥을 짓는다, 반찬, 수저 -> 쓰레드
 *   6. 자바 프로그램
 *      --------- 프로세스
 *                ----- main(쓰레드) / gc => 멀티 쓰레드
 *   7. 쓰레드는 CPU의 시간을 분할
 *          수행
 *          NEW : 쓰레드 생성
 *           |=> start()
 *        Runnable : 준비 상태 => 자원을 확보
 *           |
 *        Running --- Blocked
 *        (run())
 *           |    ---    |=> sleep, join, wait
 *          Dead---------- interrupt()
 *            
 */
// => 한가지 일만 수행
class MyThread extends Thread
{
	public void run() // 어떻게 동작을 할건지 실행문 작성 => run() 안에서
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName()+":"+i);
			try
			{
				Thread.sleep(100);
			}catch(Exception ex) {}
		}
	}
}
public class 쓰레드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		MyThread m3=new MyThread();
		MyThread m4=new MyThread();
		MyThread m5=new MyThread();
		m1.setName("홍길동");
		m2.setName("심청이");
		m3.setName("춘향이");
		m4.setName("안중길");
		m5.setName("이순신");
		
		m1.setPriority(1);
		m2.setPriority(4);
		m3.setPriority(2);
		m4.setPriority(3);
		m5.setPriority(10);
		/*
		 *  NEW
		 *   = 이름 부여 ==> MAX => 10  // main
		 *     Thread-0 ,-1,-2
		 *     이름 변경 => setName()
		 *   = 우선 순위 ==> NORM_PRIORITY => 5
		 *             ==> MIN => 1  // gc
		 */
		// 시분할
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		
	}

}
