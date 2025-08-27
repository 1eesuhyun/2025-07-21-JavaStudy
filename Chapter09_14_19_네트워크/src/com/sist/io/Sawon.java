package com.sist.io;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 파일제어 프로그램(데이터 관리 = 파일) => xml => 라이브러리가 별도
// XML파일이 무겁다(속도가 느림) => JSON => RestFul
// JSON => JavaScript : Java 호환
/*
 *   Serializable : 직렬화 => 역직렬화
 */
@Data
@NoArgsConstructor
@AllArgsConstructor // 데이터가 포함된 매개변수를 만든다
public class Sawon implements Serializable {
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private String loc;
	private int pay;
	
}
