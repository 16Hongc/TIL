package lecture_11;

public class Student_Class {

	int studentID ;
	String studentName ;
	int grade ;
	String address ;
	
	
	/*
			public Student_Class() {}
	
	public Student_Class(int id, String name) { // �����ڿ� id�� name �Է¹���
		studentID = id ;                        // �ش�
		studentName = name ;
	} 
	*/
	
	
	public void show_Student_Info() {                    // Ŭ���� �޼ҵ�
		System.out.println(studentName+" : "+address) ;
		
	}

	public static void main(String[] args) {   // Ŭ������ ������ ���� ���� �޼ҵ�. 'run'�� �����ϸ� �� �κ��� ����.
		                                         
	Student_Class student_Lee = new Student_Class() ;   // Ŭ������ ������ = new ������ (�⺻ ������)
	                                                    // heap memory ���� ������.
	student_Lee.studentName = "�̼���" ;                  // �������� �ڿ� '.'�� ������ �������� ����.
	student_Lee.studentID = 100 ;
	student_Lee.address = "����� ���Ǳ� �Ÿ���" ;
		
	
	Student_Class student_Kim = new Student_Class() ;   // student_Lee,student_Kim�� ���������� ��
                                                       
	student_Kim.studentName = "������" ;                  
	student_Kim.studentID = 101 ;
	student_Kim.address = "����� ���Ǳ� ���е�" ;
		
	student_Lee.show_Student_Info() ;
	student_Kim.show_Student_Info() ;     
	
	System.out.println(student_Lee) ;  // lecture_11.Student_Class@2ff4acd0  
	System.out.println(student_Kim) ;  // Ŭ���� Ǯ���� + @ + �ּ� ��((16���� 4����Ʈ)*2�� =32��Ʈ )
		                                  
	} 

}
