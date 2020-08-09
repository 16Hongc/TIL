package lecture_08;

public class Loop_Statement {

	public static void main(String[] args) {
		
		/////////////// while statement ///////////////
		
		int num1 = 1 ;
		int sum1 = 0 ;        // �ݵ�� �ʱ�ȭ �ʿ�
		
		while( num1 <= 10 ) {
			
			sum1 += num1 ;
			num1++ ;          // num += 1 ;�� ����	
		}
		System.out.println(sum1) ;
		
		
		/////////////// do-while statement ///////////////
		
		int num2 = 1 ;
		int sum2 = 0 ;
		
		do {                      // do ���� ���� ����
			sum2 += num2 ;
			num2++ ;
		} while(num2 <= 10) ;     // ��/���� �Ǻ�       
		
		System.out.println(sum2) ;
		
		
		/////////////// for statement ////////////////
		
		int num3 ;
		for( num3 = 1 ; num3 <= 10 ; num3++ ) { // �ʱⰪ 1 ; 10 ���ϸ� �ݺ� ; 1�� �߰�
			System.out.println( num3 ) ;        // 10���� �ݺ� ���
		}
		
		
		
		/////////////// for nested loop statement ////////////////
		
		int f_Num1 ;
		int s_Num1 ;
		
		for( f_Num1 = 2 ; f_Num1 <= 9 ; f_Num1++ ) {
			for( s_Num1 = 1 ; s_Num1 <= 9 ; s_Num1++ ) {
				System.out.println("fs:"+f_Num1+"x"+s_Num1+"="+f_Num1*s_Num1) ;
			}
			System.out.println() ;  // �� �� ���� �� ����
		}
		
		
		/////////////// while nested loop statement ////////////////
		
		int f_Num2 = 2 ;
		int s_Num2 = 1 ;
		
		while( f_Num2 <= 9 ) {
			s_Num2 = 1 ;
			while( s_Num2 <= 9 ) {
				System.out.println("ws:"+f_Num2+"x"+s_Num2+"="+f_Num2*s_Num2) ;
				s_Num2++ ;
			} 
			f_Num2++ ;
			System.out.println() ; // �� �� ���� �� ����
		}

	}

}
