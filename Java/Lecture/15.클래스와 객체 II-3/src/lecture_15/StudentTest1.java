package lecture_15;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentKim = new Student() ;       // �����ڰ� ȣ��� �� +1 ( 10000 + 1)
		System.out.println(studentKim.studentID) ; // static������ �ν��Ͻ� ������ �����
		
		Student studentChoi = new Student() ;      // �����ڰ� ȣ��� �� +1 ( 10001 + 1)
		System.out.println(studentChoi.studentID) ;// static������ �ν��Ͻ� ������ �����
		

	}

}
