package com.sist.ast;
// 기능 동일 => 구현이 다른 경우는 선언만
public abstract class MusicClass {
  private static Music[] musics=new Music[50];
  public abstract void musicAllData();
  // 추상메소드(기능은 같은데 내용이 다를때)
  // 목록 출력
  public void musicPrint()
  {
	  System.out.println("뮤직 목록 출력");
  }
  // 검색
  public void musicFind(String title)
  {
	  System.out.println(title+"로 검색 완료");
  }
}
