package inheritence;

public class Student {
	String subname;
	int realScore;
	int mid;
	int final_test;
	int suhang;
	public Student(String subname, int mid, int final_test, int suhang, int realScore) {
		super();
		this.subname = subname;
		this.realScore = realScore;
		this.mid = mid;
		this.final_test = final_test;
		this.suhang = suhang;
	}
	
	public Student() {;}
	
}
