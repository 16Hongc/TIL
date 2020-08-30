package lecture_13;


class BirthDay {
	int day ;
	int month ;
	int year ;
	
	public void setYear(int year) {
		this.year = year ;
		
		
		///////  this 미사용  ///// 
		// year = year ;       // 이 경우, year는 가장 가까운 9라인의 year를 나타내게 됨. 
							   // 결국 값 받아서 그 값에 같은 값 넣게됨 
		///// 메소드의 변수명을 변경할 경우 (public void setYear(int y))  //////
		// year = y ;          // 가능은 하나, set,get 메소드 사용시에는 보편적으로 사용되지 않음. 
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
