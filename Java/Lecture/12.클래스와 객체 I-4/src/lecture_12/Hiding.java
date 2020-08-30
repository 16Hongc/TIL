package lecture_12;

class BirthDay {   // public, private ���� ���ϸ� ��Ű�� ���ο��� �� �� ����. ����Ʈ.
				   // private�� ���� Ŭ���� ���ο����� ����. �� BirthDay Ŭ���� �ۿ����� ����.
	private int day ;      // �׳� private �����ϸ� �����߻�.
	private int month ;
	private int year ;     // ������ ������, �޼��带 ���ؼ� ��밡��.
	
	////////////////////////////////
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if( day < 1 || day > 28 ) {
				System.out.println("��¥ ����") ;
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

public class Hiding {  // �ۺ� Ŭ������ �� �ϳ��� ����.
					   // Ŭ���� �̸� ������ alt + shift + R : Rename Compilation Unit
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay() ;
		////////////////////     // private�� �׳� ����.
		// day.month = 2 ;  
		day.setMonth(2);         // day�� ���� �����ϴ� ���ǽ��� �����Ƿ� day���� month�� ���� �;�.
		// day.year = 2020 ;
		day.setYear(2020);
		// day.day = 30 ;
		day.setDay(30);
		////////////////////
		
		
	}

}
