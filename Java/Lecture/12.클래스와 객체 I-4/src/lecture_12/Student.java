package lecture_12;

public class Student {
	
	int studentID ;
	String studentName ;
	Subject korean ;
	Subject math ;
	
	public Student() {
		korean = new Subject() ;
		math = new Subject() ;
		
	} 
	
	public Student(int id, String name) {
		studentID = id ;
		studentName = name ;
		
		korean = new Subject() ;
		math = new Subject() ;
	}
	
	public void setKorean(String name, int score) {    // 메서드 호출
		korean.setSubjectName(name) ;                  // 맴버변수의 속성
		korean.setScore(score) ;
		
	}
	public void setMath(String name, int score) {      // 메서드 호출
		math.setSubjectName(name) ;                    // 맴버변수의 속성
		math.setScore(score) ;
		
	}
	
	public void showStudentInfo() {
		int total = korean.getScore() + math.getScore() ;
		System.out.println("총점은"+ total) ;
	}
}
