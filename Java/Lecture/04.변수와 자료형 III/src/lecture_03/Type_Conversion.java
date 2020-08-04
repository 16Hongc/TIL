package lecture_03;

public class Type_Conversion {

	public static void main(String[] args) {
		
		//////////// implicit type conversion ////////////
		
		byte b_Num1 = 10 ;      // 1 byte
		int num1 = b_Num1 ;      // 4 byte
		System.out.println(num1) ;
		
		
		long l_Num = 10 ;      // 10�� ��� Ǯ�� 4 byte ���������, �ڵ����� �� ��ȯ (8 byte) �Ͼ
		float f_Num1 = l_Num ;  // ����Ʈ�� ������ �������� �Ǽ��� �� ������ ���̹Ƿ� ������ �� ��ȯ �Ͼ
		System.out.println(f_Num1) ;
		
		
		double d_Num1 = f_Num1 + num1 ;  // 1.num1�� float���� ����   2.���� ���� double�� ����  
		System.out.println(d_Num1) ;
		
		
		////////////explicit type conversion ////////////
		
		int i_Num1 = 1000 ;
		//byte b_Num2 = i_Num1 ;       // Error (type mismatch : cannot convert from int to byte)
		byte b_Num2 = (byte)i_Num1 ;
		System.out.println(i_Num1) ;   // i_Num ��ü�� ���� ���� ���� �ƴ϶�,  
		System.out.println(b_Num2) ;   // b_Num2�� ������ ���� �� ��ȯ�� ���� �Ƹ���?. 
									   // -24�� ���� ������ �Ѱ�(-128 ~ 127)�� �Ѿ 4����Ʈ �� �Ϻθ� �ݿ��Ǿ��� ����
		
		int i_Num2 = 1 ;
		double d_Num2 = 3.14 ;
		i_Num2 = (int)d_Num2 ;
		System.out.println(i_Num2) ;   // 3
		
		
		float f_Num2 = 0.9F ;
		int num2 = (int)d_Num2 + (int)f_Num2 ;
		int num3 = (int)(d_Num2 + f_Num2) ;
		System.out.println(num2) ;   // 3. 3+0=3
		System.out.println(num3) ;   // 4. 3.14+0.9=4.04
		
	}

}
