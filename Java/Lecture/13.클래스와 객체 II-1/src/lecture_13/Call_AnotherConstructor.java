package lecture_13;

class Person {
	String name ;
	int age ;
	
	public Person() {                        //1// 디폴트 생성자
		this("이름없음", 0) ;                  //1//  this 사용하여 다른 생성자 호출
	}
	
	public Person(String name, int age) {    //1// 다른 생성자
		this.name = name ;
		this.age = age ;
	}
	
	public Person returnSelf() {  //2// 제어자 자료형(Person) 메소드명. 자기자신 클래스명으로 반환명 설정
		return this ;             //2// 현재 인스턴스 주소
	}
}
public class Call_AnotherConstructor {
	public static void main(String[] args) {
		Person p1 = new Person() ;            //1// 생성자 호출
		System.out.println(p1.name) ;
		System.out.println(p1.age) ;
		
		System.out.println(p1.returnSelf()) ;    //2// this 출력
		
	}
}
