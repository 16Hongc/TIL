package lecture_16;
/*
import java.util.Calendar;     // 자바 유틸에서 제공하는 날짜시간 관련 클래스
*/
public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance() ;
		Company company2 = Company.getInstance() ;
		
		System.out.println(company1);
		System.out.println(company2);
		
		/*
		Calendar cal = Calendar.getInstance() ;  // 시간은 항상 동일해야함.(생성자 없음)
		     									 // 대표적인 싱글톤 패턴 예시
		*/
	}

}
