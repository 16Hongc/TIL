package lecture_02;

public class Negative {

	public static void main(String[] args) {

		int positive = 0B00000000000000000000000000000101 ;   // 32비트, 이진수 +5
		int negative = 0B11111111111111111111111111111011 ;   // 32비트, 이진수 -5
	
		int sum = positive + negative ;
		
		System.out.println(positive);
		System.out.println(negative);
		System.out.println(sum);
	}

}
