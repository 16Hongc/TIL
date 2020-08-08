package lecture_07;

public class If_Statement {

	public static void main(String[] args) {
		
		/////////////// if conditional statement 1 //////////////
		
		int age1 = 2 ;
		
		if(age1 >= 8 ) {
			System.out.println("학교에 다닙니다") ;    // 수행문 내부는 들여쓰기
		}                                          // 수행문이 하나일 경우 중괄호 안써도 가능
		else {
			System.out.println("학교에 안 다닙니다") ;
			System.out.println("그래서 좋습니다") ;
		}
		
		/////////////// if conditional statement 2 //////////////
		
		int age2 = 9 ;
		int charge = 0 ;
		
		if(age2 < 8 ) {
			charge = 1000 ;
			System.out.println("미취학 아동") ;
		}
		else if(age2 < 14 ) {               // if문만 있을 경우, if문 마다 조건을 확인하게 됨
			charge = 2000 ;                 // 따라서 if문만으로 처리하면 범위 설정을 다시해야함
			System.out.println("초등학생") ;
		}
		else if(age2 < 20 ) {
			charge = 2500 ;
			System.out.println("중고등학생") ;
		}
		else {
			charge = 3000 ;
			System.out.println("성인") ;
		}
		
		System.out.println("입장료는"+charge+"원입니다") ;
		
		
	}

}
