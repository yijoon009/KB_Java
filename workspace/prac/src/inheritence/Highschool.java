package inheritence;

public class Highschool extends Student{
	String teacher;
	int attend;
	int service;
	double pyojun;
	
	public Highschool() {
		// TODO Auto-generated constructor stub
	}

	public Highschool(String subname, String teacher, int mid, int final_test, int suhang, int realScore, int attend,
			int service, double pyojun) {
		super(subname, mid, final_test, suhang, realScore);
		this.teacher = teacher;
		this.attend = attend;
		this.service = service;
		this.pyojun = pyojun;
	}

	
	
}
