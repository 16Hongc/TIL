package lecture_14;

public class Subway {

	int SubwayNum ;
	int passengerCnt ;
	int money ;
	
	public Subway(int SubwayNum) {
		this.SubwayNum = SubwayNum ;
		
	}
	
	public void take(int money) {     // 승객을 태우는 메소드
		this.money += money ;
		passengerCnt++;
	}
	
	public void showInfo() {          // 버스 정보 메소드
		System.out.println(SubwayNum + "번 지하철의 승객은 " + passengerCnt + "명이고 수입은 " + money + "원입니다.") ;
	}
}
