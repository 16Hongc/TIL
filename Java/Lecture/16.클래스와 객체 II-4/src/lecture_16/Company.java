package lecture_16;

public class Company {
	
	private static Company instance = new Company() ; 
	// ��ü���� �����ϰ� ���� �ν��Ͻ��̹Ƿ� static
	private Company(){}                               
	// ����Ʈ ������ ����. �ܺο��� �����ڸ� ȣ������ ���ϵ��� private ����
	
	public static Company getInstance() {     
	// �ܺο��� instance�� ������ �������� �޼ҵ�. ��ü�� �������� �ʰ� �θ��� ���� static ����
		if(instance == null) ;
			instance = new Company() ;
		return instance ;
	}

}

