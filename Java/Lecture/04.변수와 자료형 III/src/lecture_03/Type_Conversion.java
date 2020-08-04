package lecture_03;

public class Type_Conversion {

	public static void main(String[] args) {
		
		//////////// implicit type conversion ////////////
		
		byte b_Num1 = 10 ;      // 1 byte
		int num1 = b_Num1 ;      // 4 byte
		System.out.println(num1) ;
		
		
		long l_Num = 10 ;      // 10은 상수 풀에 4 byte 저장었으나, 자동으로 형 변환 (8 byte) 일어남
		float f_Num1 = l_Num ;  // 바이트는 작지만 정수보다 실수가 더 정밀한 값이므로 묵시적 형 변환 일어남
		System.out.println(f_Num1) ;
		
		
		double d_Num1 = f_Num1 + num1 ;  // 1.num1이 float으로 변형   2.더한 값이 double로 변형  
		System.out.println(d_Num1) ;
		
		
		////////////explicit type conversion ////////////
		
		int i_Num1 = 1000 ;
		//byte b_Num2 = i_Num1 ;       // Error (type mismatch : cannot convert from int to byte)
		byte b_Num2 = (byte)i_Num1 ;
		System.out.println(i_Num1) ;   // i_Num 자체의 값이 변한 것이 아니라,  
		System.out.println(b_Num2) ;   // b_Num2에 대입한 값이 형 변환된 것임 아마도?. 
									   // -24가 나온 이유는 한계(-128 ~ 127)를 넘어서 4바이트 중 일부만 반영되었기 때문
		
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
