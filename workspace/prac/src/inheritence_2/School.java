package inheritence_2;


public class School {
	School s;		//�ʵ��̳� �ߵ��̳� ����̳�
	String subName;
	String teacher;
	int mid, fin, suhang;
	int attend, service;
	int score;
	double pyojun;
	
	public School() {;}

	public School(School s, String subName, String teacher, int mid, int fin, int suhang, int attend, int service, int score,
			double pyojun) {
		super();
		this.s = s;
		this.subName = subName;
		this.teacher = teacher;
		this.mid = mid;
		this.fin = fin;
		this.suhang = suhang;
		this.attend = attend;
		this.service = service;
		this.score = score;
		this.pyojun = pyojun;
	}
}

class Elementary extends School{
	public Elementary() {}
	public Elementary(School s, String subject, String teacher, int mid,int last,int evaluation,int check,int volunteer,int score,double deviation) {
		super(s, subject, teacher, mid, last, evaluation, check,volunteer,score,deviation);
	}
	@Override
	public String toString() {
		return "[�ʵ��]";
	}
}

class Middle extends School{
	public Middle() {;}

	public Middle(School s, String subName, String teacher, int mid, int fin, int suhang, int attend, int service,
			int score, double pyojun) {
		super(s, subName, teacher, mid, fin, suhang, attend, service, score, pyojun);
	}
	@Override
	public String toString() {
		return "[�ߵ��]";
	}
}

class High extends School{
	public High() {;}

	public High(School s, String subName, String teacher, int mid, int fin, int suhang, int attend, int service,
			int score, double pyojun) {
		super(s, subName, teacher, mid, fin, suhang, attend, service, score, pyojun);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[����]";
	}
	
}















