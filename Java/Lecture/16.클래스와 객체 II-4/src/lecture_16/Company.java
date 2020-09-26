package lecture_16;

public class Company {
	
	private static Company instance = new Company() ; 
	// 전체에서 유일하게 사용될 인스턴스이므로 static
	private Company(){}                               
	// 디폴트 생성자 정의. 외부에서 생성자를 호출하지 못하도록 private 지정
	
	public static Company getInstance() {     
	// 외부에서 instance를 가져다 쓰기위한 메소드. 객체를 생성하지 않고 부르기 위해 static 지정
		if(instance == null) ;
			instance = new Company() ;
		return instance ;
	}

}

