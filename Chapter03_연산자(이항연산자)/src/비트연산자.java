/*
 *  	&, |, ^ => 회로
 *  
 *  	&(*) |    ^
 *  00  0    0    0
 *  01  0    1    1
 *  10  0    1    1
 *  11  1    1    0
 *  
 *  1100
 *  0101
 *  ----&
 *  0101 =>4
 *  ----|
 *  1101 => 13
 *  ----^ => 다른비트1 같은비트0
 *  1001 => 9
 *  
 *  27 & 13
 *  0001 1011
 *  0000 1101
 *  0000 1001 = 9
 *  
 *  27 | 13
 *  
 *  0001 1011
 *  0000 1101
 *  0001 1111 = 31
 *  
 *  27 ^ 13
 *  0001 1011
 *  0000 1101
 *  0001 0110 = 22
 *  
 *  35 & 17
 *  10 0011
 *  01 0001
 *  00 0001 = 1
 *  
 *  35 | 17
 *  10 0011
 *  01 0001
 *  11 0011 = 51
 *  
 *  35 ^ 17
 *  10 0011
 *  01 0001
 *  11 1110 =50
 *  
 *  
 */
public class 비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(35));
		System.out.println(Integer.toBinaryString(17));
		System.out.println(35&17);
		System.out.println(35|17);
		System.out.println(35^17);
		
	}

}
