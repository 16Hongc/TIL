package lecture_14;

public class Student {
	
	String studentName ;
	int grade ;
	int money ;
	
	public Student(String studentName, int money) {
		this.studentName = studentName ;
		this.money = money ;
	}
	
	public void takeBus(Bus bus) {    // Bus�� ��ü
		bus.take(1000) ;              // ������� ��ü�� �޼ҵ带 �޾Ƽ� ������ ��. ����.
		money -= 1000 ;
	}
	
	public void takeSubway(Subway subway) {    // Bus�� ��ü
		subway.take(1500) ;              // ������� ��ü�� �޼ҵ带 �޾Ƽ� ������ ��. ����.
		money -= 1500 ;
	}
	
	public void showInfo() {
		System.out.println(studentName + "�� ���� ����" + money + "�Դϴ�") ;
	}

}
