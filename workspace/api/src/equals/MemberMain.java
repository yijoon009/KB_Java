package equals;

public class MemberMain {
	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("green");
		Member m4 = new Member("");
		
		if(m1.equals(m2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		
	}
	
	
}
