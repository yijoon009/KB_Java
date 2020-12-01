package inheritence;

public class Middleschool extends Student{
	String teacher;
	int attend;
	int service;
	public Middleschool() {
		// TODO Auto-generated constructor stub
	}
	public Middleschool(String subname, String teacher, int mid, int final_test, int suhang, int realScore, int attend,
			int service) {
		super(subname, mid, final_test, suhang, realScore);
		this.teacher = teacher;
		this.attend = attend;
		this.service = service;
	}
	
	
}
