package lecture_13;

class Person {
	String name ;
	int age ;
	
	public Person() {                        //1// ����Ʈ ������
		this("�̸�����", 0) ;                  //1//  this ����Ͽ� �ٸ� ������ ȣ��
	}
	
	public Person(String name, int age) {    //1// �ٸ� ������
		this.name = name ;
		this.age = age ;
	}
	
	public Person returnSelf() {  //2// ������ �ڷ���(Person) �޼ҵ��. �ڱ��ڽ� Ŭ���������� ��ȯ�� ����
		return this ;             //2// ���� �ν��Ͻ� �ּ�
	}
}
public class Call_AnotherConstructor {
	public static void main(String[] args) {
		Person p1 = new Person() ;            //1// ������ ȣ��
		System.out.println(p1.name) ;
		System.out.println(p1.age) ;
		
		System.out.println(p1.returnSelf()) ;    //2// this ���
		
	}
}
