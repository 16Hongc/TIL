package lecture_11;

public class Student_Class {

	int studentID ;
	String studentName ;
	int grade ;
	String address ;
	
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
		                                  
	} 

}
