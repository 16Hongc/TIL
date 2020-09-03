package lecture_14;

public class Trans {

	public static void main(String[] args) {
		
		Student Kim = new Student("Kim", 5000) ;
		Student Lee = new Student("Lee", 120000) ;
		
		Bus bus152 = new Bus(152) ;
		Kim.takeBus(bus152) ;
		Kim.showInfo() ;
		bus152.showInfo() ;
		
		Subway subway1234 = new Subway(1234) ;
		Lee.takeSubway(subway1234) ;
		Lee.showInfo() ;
		subway1234.showInfo() ;
		
	}

}
