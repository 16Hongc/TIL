package lecture_14;

public class Bus {
	
	int busNum ;
	int passengerCnt ;
	int money ;
	
	public Bus(int busNum) {
		this.busNum = busNum ;
		
	}
	
	public void take(int money) {     // 승객을 태우는 메소드
		this.money += money ;
		passengerCnt++;
	}
	
	public void showInfo() {          // 버스 정보 메소드
		System.out.println(busNum + "번 버스의 승객은 " + passengerCnt + "명이고 수입은 " + money + "원입니다.") ;
	}

}
