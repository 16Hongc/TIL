package lecture_14;

public class Bus {
	
	int busNum ;
	int passengerCnt ;
	int money ;
	
	public Bus(int busNum) {
		this.busNum = busNum ;
		
	}
	
	public void take(int money) {     // �°��� �¿�� �޼ҵ�
		this.money += money ;
		passengerCnt++;
	}
	
	public void showInfo() {          // ���� ���� �޼ҵ�
		System.out.println(busNum + "�� ������ �°��� " + passengerCnt + "���̰� ������ " + money + "���Դϴ�.") ;
	}

}
