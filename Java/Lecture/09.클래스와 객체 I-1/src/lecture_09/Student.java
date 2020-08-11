package lecture_09;

public class Student {
	int studentID ;
	String studentName ;
	int grade ;
	String address ;
	
	public void show_Student_Info() {                    // 클래스 메소드
		System.out.println(studentName+" : "+address) ;
		
	}

	/* 
		public static void main(String[] args) {  // 클래스를 돌리기 위한 메인 메소드. 'run'을 실행하면 이 부분이 실행.
		                                          // 메인 메소드의 형식은 항상 같음. public static void main(String[] args)
		Student student_Lee = new Student() ;
		student_Lee.studentName = "이순신" ;
		student_Lee.address = "서울시 관악구 신림동" ;
		
		student_Lee.show_Student_Info() ;     // 엄밀히 말하자면 메인은 '클래스의 메소드'라고 하지 않음. 
		                                      // 그냥 코드를 실행시키는 역할
	} */
}
