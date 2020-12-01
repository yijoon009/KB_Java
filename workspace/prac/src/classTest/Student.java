package classTest;

public class Student {
	private String major;
	private int num;
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.setMajor("경영학과");
		stu.setNum(17);
		
		
		System.out.println("과: "+stu.getMajor());
		System.out.println("학번: "+stu.getNum());
		
		
		
		
		
		
		
		
	}
	
	
	
}
