package lecture_15;

public class Student {
	
	static int serialNum = 10000 ;   // ���� ��
	
	int studentID ;
	String studentName ;
	
	public Student() {       // �л��� ������ ���� �����ڰ� ȣ���
		
		serialNum++ ;
		studentID = serialNum ;
		
	}

}
