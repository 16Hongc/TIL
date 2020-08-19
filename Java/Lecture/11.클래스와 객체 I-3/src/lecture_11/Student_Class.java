package lecture_11;

public class Student_Class {

	int studentID ;
	String studentName ;
	int grade ;
	String address ;
	
	
	/*
			public Student_Class() {}
	
	public Student_Class(int id, String name) { // 생성자에 id와 name 입력받음
		studentID = id ;                        // 해당
		studentName = name ;
	} 
	*/
	
	
	public void show_Student_Info() {                    // 클래스 메소드
		System.out.println(studentName+" : "+address) ;
		
	}

	public static void main(String[] args) {   // 클래스를 돌리기 위한 메인 메소드. 'run'을 실행하면 이 부분이 실행.
		                                         
	Student_Class student_Lee = new Student_Class() ;   // 클래스형 변수명 = new 생성자 (기본 생성자)
	                                                    // heap memory 내에 생성됨.
	student_Lee.studentName = "이순신" ;                  // 참조변수 뒤에 '.'을 찍으면 참조값이 나옴.
	student_Lee.studentID = 100 ;
	student_Lee.address = "서울시 관악구 신림동" ;
		
	
	Student_Class student_Kim = new Student_Class() ;   // student_Lee,student_Kim은 참조변수라 함
                                                       
	student_Kim.studentName = "김유신" ;                  
	student_Kim.studentID = 101 ;
	student_Kim.address = "서울시 관악구 대학동" ;
		
	student_Lee.show_Student_Info() ;
	student_Kim.show_Student_Info() ;     
	
	System.out.println(student_Lee) ;  // lecture_11.Student_Class@2ff4acd0  
	System.out.println(student_Kim) ;  // 클래스 풀네임 + @ + 주소 값((16진수 4바이트)*2개 =32비트 )
		                                  
	} 

}
