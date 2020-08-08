package lecture_07;

public class Switch_Case {

	public static void main(String[] args) {
		
		/////////////////// switch-case /////////////////////
		
		int rank = 1 ;
		char medalColor ;
		
		switch(rank) {
			case 1 : medalColor = 'G' ;
					break ;                 // break가 없으면 나올떄까지 수행함
			case 2 : medalColor = 'S' ;
					break ;
			case 4 : medalColor = 'B' ;
					break ;
			default : medalColor = 'N' ;
		}
		System.out.println(rank+"등 메달 색깔은 "+medalColor+"입니다.") ;
		
		
		
		int month = 11 ;
		int day = 0 ;      // 초기값 설정하거나, switch문 내부에 default값 설정해줘야함.
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day = 31 ;
			break ;
		case 2 :
			day = 28 ;
			break ;
		case 4 : case 6 : case 9 : case 11 :
			day = 30 ;
			break ;
		}
		System.out.println(month+"월의 날짜 수는 "+day+"입니다.") ;
		
		
		
		/////////////////// java7 switch-case //////////////////
		
		String medal = "none" ;
		
		switch(medal) {
		case "Gold" : 
			System.out.println("금메달!!!") ;
			break ;
		case "Silver" :
			System.out.println("은메달!!") ;
			break ;
		case "Bronze" : 
			System.out.println("동메달!") ;
			break ;
		default :
			System.out.println("그런건 없습니다.") ;
		}

	}

}
