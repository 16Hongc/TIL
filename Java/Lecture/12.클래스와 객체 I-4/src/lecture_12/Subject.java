package lecture_12;

public class Subject {
	
	String subjectName ;
	int score ;
	
	
	public void setSubjectName(String name) {   // ���� ���� ��
		subjectName = name ;
	}


	public int getScore() {     // ���ʷ����� ����. ��Ŭ��->source->generate getters and setters
		return score;
	}

	public void setScore(int score) {
		this.score = score;                  // this�� ���� ����
	}


	public String getSubjectName() {
		return subjectName;
	}
}