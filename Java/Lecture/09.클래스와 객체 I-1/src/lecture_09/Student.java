package lecture_09;

public class Student {
	int studentID ;
	String studentName ;
	int grade ;
	String address ;
	
	public void show_Student_Info() {                    // Ŭ���� �޼ҵ�
		System.out.println(studentName+" : "+address) ;
		
	}

	/* 
		public static void main(String[] args) {  // Ŭ������ ������ ���� ���� �޼ҵ�. 'run'�� �����ϸ� �� �κ��� ����.
		                                          // ���� �޼ҵ��� ������ �׻� ����. public static void main(String[] args)
		Student student_Lee = new Student() ;
		student_Lee.studentName = "�̼���" ;
		student_Lee.address = "����� ���Ǳ� �Ÿ���" ;
		
		student_Lee.show_Student_Info() ;     // ������ �����ڸ� ������ 'Ŭ������ �޼ҵ�'��� ���� ����. 
		                                      // �׳� �ڵ带 �����Ű�� ����
	} */
}
