package lecture_06;

public class Operation_2 {

	public static void main(String[] args) {
		
		/////////////////// assignment operator  //////////////////
		
		int num1 = 10 ;
		System.out.println(num1 += 1) ;     // 11.
		System.out.println(num1) ;          // 11. �̹� ���ԵǾ��� ������ ���� ������
		
		int num2 = 9 ;
		System.out.println(num2 %= 2) ;     // 1.
		System.out.println(num2) ;          // 1. �̹� ���ԵǾ��� ������ ���� ������
		
		
		/////////////////// conditional operator  ////////////////////
		
		int num3 = (5 > 3) ? 12 : 33 ;      // 5 > 3�� ���̹Ƿ� 12�� num3�� ����
		System.out.println(num3) ;          // 12
		
		
		
		////////////////// bitwise operator ////////////////////
		
		int num4 = 15 ;                     // 1111.
		int num5 = 10 ;                     // 1010.
		
		int result1 = num4 & num5 ;
		System.out.println(result1) ;       // 10. 1010.
		
		int result2 = num4 ^ num5 ;
		System.out.println(result2) ;       // 5. 0101.
		
		
		///////////////// shift operator //////////////////
		
		int num6 = 5 ;                      // ���� �����ڿ� ���� ��밡��
		int result3 = num6 >> 3 ;
		int result4 = num6 << 3 ;
		System.out.println(result3) ;       // 0.  (5 / (2^3)) = 0.xxxx
		System.out.println(result4) ;       // 40. (5 * (2^3) = 40)
		
		
		int num7 = 25 ;                     // 00011001
		int result5 = num7 >>> 3 ;          // 3ĭ ���������� �̵�  00000011 001
		System.out.println(result5) ;       // 3. 00000011
		
	}

}
