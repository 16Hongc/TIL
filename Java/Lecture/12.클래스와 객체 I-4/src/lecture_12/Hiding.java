package lecture_12;

class BirthDay {   // public, private 지정 안하면 패키지 내부에서 볼 수 있음. 디폴트.
				   // private는 같은 클래스 내부에서만 보임. 즉 BirthDay 클래스 밖에서는 못봄.
	private int day ;      // 그냥 private 지정하면 오류발생.
	private int month ;
	private int year ;     // 숨겨져 있지만, 메서드를 통해서 사용가능.
	
	////////////////////////////////
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if( day < 1 || day > 28 ) {
				System.out.println("날짜 오류") ;
			}
		}
		else {
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}

public class Hiding {  // 퍼블릭 클래스는 단 하나만 존재.
					   // 클래스 이름 변경은 alt + shift + R : Rename Compilation Unit
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay() ;
		////////////////////     // private라서 그냥 못씀.
		// day.month = 2 ;  
		day.setMonth(2);         // day에 달을 판정하는 조건식이 있으므로 day보다 month가 먼저 와야.
		// day.year = 2020 ;
		day.setYear(2020);
		// day.day = 30 ;
		day.setDay(30);
		////////////////////
		
		
	}

}
