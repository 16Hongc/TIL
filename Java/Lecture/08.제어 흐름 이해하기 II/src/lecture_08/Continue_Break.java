package lecture_08;

public class Continue_Break {

	public static void main(String[] args) {
		
		//////////////// continue /////////////////
		
		int total = 0 ;
		int num1 ;
		
		for( num1 = 1 ; num1 <= 100 ; num1++ ) {
			
			if( (num1 % 2) == 0 ) {
				continue ;
			}
			total += num1 ;
		}
		System.out.println(total) ;
		
		
		//////////////// break /////////////////
		
		int sum1 = 0 ;
		int num2 = 1 ;
		
		while( true ) {
			sum1 += num2 ;
			if(sum1 > 100 ) {
				break ;
			}
			num2++ ;
		}
		
		System.out.println(sum1) ;
		System.out.println(num2) ;
		
	}

}
