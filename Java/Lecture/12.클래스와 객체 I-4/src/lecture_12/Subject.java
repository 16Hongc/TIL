package lecture_12;

public class Subject {
	
	String subjectName ;
	int score ;
	
	
	public void setSubjectName(String name) {   // 직접 만들어도 됨
		subjectName = name ;
	}


	public int getScore() {     // 제너레이터 제공. 우클릭->source->generate getters and setters
		return score;
	}

	public void setScore(int score) {
		this.score = score;                  // this는 차후 설명
	}


	public String getSubjectName() {
		return subjectName;
	}
}