package lecture_03;

public class Constant {

	public static void main(String[] args) {
		
		final float PI = 3.14F ;   // 상수는 보통 대문자로 표현
		
		//////////////////////////////////////////////////////////////
		
		// final int MAX_NUM = 30 ;   // 본래 값
		final int MAX_NUM = 100 ;     // 수정 값
		
		int num = 0 ;
		if ( num == 30) {}         // 상수 사용시, 전체 값을 일일히 바꿀 필요가 없음
		
		System.out.println(30) ;   // 상수 사용시, 전체 값을 일일히 바꿀 필요가 없음
		
	}

}
