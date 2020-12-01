package p3;

public class LocalMemberMain {
	public static void main(String[] args) {
		LocalMemberOutter localMem = new LocalMemberOutter();
		localMem.innerMethod();
		localMem.iaMethod();
		localMem.innerMethod();
	}
}
