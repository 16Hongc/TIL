package lecture_12;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student_Hong = new Student(0, "Hong") ;
		student_Hong.setKorean("국어", 100) ;
		student_Hong.setMath("수학", 100) ;
		
		Student student_Kim = new Student(1, "Kim") ;
		student_Kim.setKorean("국어", 70) ;
		student_Kim.setMath("수학", 40) ;
		
		student_Hong.showStudentInfo() ;
		student_Kim.showStudentInfo() ;
	}

}
