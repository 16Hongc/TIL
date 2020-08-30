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
	
	public void setKorean(String name, int score) {    // �޼��� ȣ��
		korean.setSubjectName(name) ;                  // �ɹ������� �Ӽ�
		korean.setScore(score) ;
		
	}
	public void setMath(String name, int score) {      // �޼��� ȣ��
		math.setSubjectName(name) ;                    // �ɹ������� �Ӽ�
		math.setScore(score) ;
		
	}
	
	public void showStudentInfo() {
		int total = korean.getScore() + math.getScore() ;
		System.out.println("������"+ total) ;
	}
}
