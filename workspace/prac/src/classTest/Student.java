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
		
		stu.setMajor("�濵�а�");
		stu.setNum(17);
		
		
		System.out.println("��: "+stu.getMajor());
		System.out.println("�й�: "+stu.getNum());
		
		
		
		
		
		
		
		
	}
	
	
	
}
