package lecture_10;

public class Function {

	public static void main(String[] args) {

		int num1 = 10 ;
		int num2 = 14 ;
		int total = add_Function(num1, num2) ;
		
		System.out.println(total) ;   // �Լ� ȣ�� �� ����� ���
	}
	
	public static int add_Function(int number1, int number2) {    // �Լ� ����
		int result = number1 + number2 ;
		return result ;		
	}

}
