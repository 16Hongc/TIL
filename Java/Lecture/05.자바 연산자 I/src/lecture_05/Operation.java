package lecture_05;

public class Operation {

	public static void main(String[] args) {
		
		///////////// assignment operator /////////////
		
		int age = 33 ;
		System.out.println(age) ;
		
		
		///////////// signed operator /////////////
		
		int num1 = 10 ;
		int num2 = -num1 ;
		System.out.println(num1) ;         // ��ȣ ������ ������ ������ ����. ���Կ����� �ʿ�.
		System.out.println(num2) ;
		
		
		///////////// arithmetic operator /////////////
		
		System.out.println(num1 + num2) ;  // 10 + (-10) = 0
		
		
		///////////// increment decrement operator /////////////
		
		int num3 = 10 ;
		int num4 = 10 ;
		System.out.println(++num3) ;      // 11. ���� �� num3�� ����.
		System.out.println(num3) ; 
		System.out.println(num4++) ;      // 10. ���? �� ���� �� ����.
		System.out.println(num4) ;        // 11. ���� �ܰ迡�� �̹� ����Ǿ���.
		
		
		///////////// relational operator /////////////
		
		System.out.println(3>5) ;         // false
		System.out.println(3<5) ;         // true
		int num5 = 10 ;
		int num6 = 4 ;
		boolean flag = (num5 > num6) ;
		System.out.println(flag) ;        // true
		
		
		///////////// logical operator /////////////
		
		int num7 = 10 ;
		int i =2 ;
		
		boolean value1 = (((num7 = num7 + 10) < 10) && ((i = i + 2) < 10)) ; 
		System.out.println(value1) ;     // ���� && ��(����ȵ�) �̹Ƿ� ����
		System.out.println(num7) ;      // �� ������ ����Ǿ� ��. 20
		System.out.println(i) ;         // �� ���Ǹ� ����ǰ� ��������� 2 
		
		int num8 = 10 ;
		int j =2 ;
		
		boolean value2 = (((num8 = num8 + 10) > 10) && ((j = j + 2) < 10)) ; 
		System.out.println(value2) ;     // �� && ��(�����) �̹Ƿ� ��
		System.out.println(num8) ;      // �� ������ ����Ǿ� ��. 20
		System.out.println(j) ;         // �� ���ǵ� ��������Ƿ� 4 
		
	}

}
