package lecture_15;

public class Student {
	
	static int serialNum = 10000 ;   // 기준 값
	
	int studentID ;
	String studentName ;
	
	public Student() {       // 학생이 증가할 때는 생성자가 호출됨
		
		serialNum++ ;
		studentID = serialNum ;
		
	}

}
