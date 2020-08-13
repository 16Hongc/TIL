package lecture_10;

public class Function {

	public static void main(String[] args) {

		int num1 = 10 ;
		int num2 = 14 ;
		int total = add_Function(num1, num2) ;
		
		System.out.println(total) ;   // 함수 호출 및 결과값 출력
	}
	
	public static int add_Function(int number1, int number2) {    // 함수 선언
		int result = number1 + number2 ;
		return result ;		
	}

}
