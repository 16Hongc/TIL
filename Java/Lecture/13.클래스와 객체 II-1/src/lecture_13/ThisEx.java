package lecture_13;


class BirthDay {
	int day ;
	int month ;
	int year ;
	
	public void setYear(int year) {
		this.year = year ;
		
		
		///////  this �̻��  ///// 
		// year = year ;       // �� ���, year�� ���� ����� 9������ year�� ��Ÿ���� ��. 
							   // �ᱹ �� �޾Ƽ� �� ���� ���� �� �ְԵ� 
		///// �޼ҵ��� �������� ������ ��� (public void setYear(int y))  //////
		// year = y ;          // ������ �ϳ�, set,get �޼ҵ� ���ÿ��� ���������� ������ ����. 
	}
	
	public void printThis() {
		System.out.println(this) ;
	}
}

public class ThisEx {
	
	public static void main(String[] args) {
		
		BirthDay b1 = new BirthDay() ;
		BirthDay b2 = new BirthDay() ;
		
		System.out.println(b1) ;
		b1.printThis() ;
		System.out.println(b2) ;
		b2.printThis() ;
	}

}
