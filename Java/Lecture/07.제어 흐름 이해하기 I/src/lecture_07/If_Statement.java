package lecture_07;

public class If_Statement {

	public static void main(String[] args) {
		
		/////////////// if conditional statement 1 //////////////
		
		int age1 = 2 ;
		
		if(age1 >= 8 ) {
			System.out.println("�б��� �ٴմϴ�") ;    // ���๮ ���δ� �鿩����
		}                                          // ���๮�� �ϳ��� ��� �߰�ȣ �Ƚᵵ ����
		else {
			System.out.println("�б��� �� �ٴմϴ�") ;
			System.out.println("�׷��� �����ϴ�") ;
		}
		
		/////////////// if conditional statement 2 //////////////
		
		int age2 = 9 ;
		int charge = 0 ;
		
		if(age2 < 8 ) {
			charge = 1000 ;
			System.out.println("������ �Ƶ�") ;
		}
		else if(age2 < 14 ) {               // if���� ���� ���, if�� ���� ������ Ȯ���ϰ� ��
			charge = 2000 ;                 // ���� if�������� ó���ϸ� ���� ������ �ٽ��ؾ���
			System.out.println("�ʵ��л�") ;
		}
		else if(age2 < 20 ) {
			charge = 2500 ;
			System.out.println("�߰���л�") ;
		}
		else {
			charge = 3000 ;
			System.out.println("����") ;
		}
		
		System.out.println("������"+charge+"���Դϴ�") ;
		
		
	}

}
