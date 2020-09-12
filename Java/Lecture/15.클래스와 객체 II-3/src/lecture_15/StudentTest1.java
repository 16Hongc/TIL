package lecture_15;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentKim = new Student() ;       // 생성자가 호출될 때 +1 ( 10000 + 1)
		System.out.println(studentKim.studentID) ; // static변수가 인스턴스 변수로 저장됨
		
		Student studentChoi = new Student() ;      // 생성자가 호출될 때 +1 ( 10001 + 1)
		System.out.println(studentChoi.studentID) ;// static변수가 인스턴스 변수로 저장됨
		

	}

}
