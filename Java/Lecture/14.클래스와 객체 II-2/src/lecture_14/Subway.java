package lecture_14;

public class Subway {

	int SubwayNum ;
	int passengerCnt ;
	int money ;
	
	public Subway(int SubwayNum) {
		this.SubwayNum = SubwayNum ;
		
	}
	
	public void take(int money) {     // �°��� �¿�� �޼ҵ�
		this.money += money ;
		passengerCnt++;
	}
	
	public void showInfo() {          // ���� ���� �޼ҵ�
		System.out.println(SubwayNum + "�� ����ö�� �°��� " + passengerCnt + "���̰� ������ " + money + "���Դϴ�.") ;
	}
}
