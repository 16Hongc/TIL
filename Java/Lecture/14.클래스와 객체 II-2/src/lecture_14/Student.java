package lecture_14;

public class Student {
	
	String studentName ;
	int grade ;
	int money ;
	
	public Student(String studentName, int money) {
		this.studentName = studentName ;
		this.money = money ;
	}
	
	public void takeBus(Bus bus) {    // Bus는 객체
		bus.take(1000) ;              // 버스라는 객체의 메소드를 받아서 영향을 줌. 협업.
		money -= 1000 ;
	}
	
	public void takeSubway(Subway subway) {    // Bus는 객체
		subway.take(1500) ;              // 버스라는 객체의 메소드를 받아서 영향을 줌. 협업.
		money -= 1500 ;
	}
	
	public void showInfo() {
		System.out.println(studentName + "의 남은 돈은" + money + "입니다") ;
	}

}
