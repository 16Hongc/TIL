package lecture_05;

public class Operation {

	public static void main(String[] args) {
		
		///////////// assignment operator /////////////
		
		int age = 33 ;
		System.out.println(age) ;
		
		
		///////////// signed operator /////////////
		
		int num1 = 10 ;
		int num2 = -num1 ;
		System.out.println(num1) ;         // 부호 연산자 차제로 변하지 않음. 대입연산자 필요.
		System.out.println(num2) ;
		
		
		///////////// arithmetic operator /////////////
		
		System.out.println(num1 + num2) ;  // 10 + (-10) = 0
		
		
		///////////// increment decrement operator /////////////
		
		int num3 = 10 ;
		int num4 = 10 ;
		System.out.println(++num3) ;      // 11. 연산 후 num3에 저장.
		System.out.println(num3) ; 
		System.out.println(num4++) ;      // 10. 출력? 후 연산 및 저장.
		System.out.println(num4) ;        // 11. 이전 단계에서 이미 저장되었음.
		
		
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
		System.out.println(value1) ;     // 거짓 && 참(실행안됨) 이므로 거짓
		System.out.println(num7) ;      // 앞 조건이 실행되어 참. 20
		System.out.println(i) ;         // 참 조건만 실행되고 끝났으모로 2 
		
		int num8 = 10 ;
		int j =2 ;
		
		boolean value2 = (((num8 = num8 + 10) > 10) && ((j = j + 2) < 10)) ; 
		System.out.println(value2) ;     // 참 && 참(실행됨) 이므로 참
		System.out.println(num8) ;      // 앞 조건이 실행되어 참. 20
		System.out.println(j) ;         // 뒷 조건도 실행됐으므로 4 
		
	}

}
