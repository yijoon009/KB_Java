package MovieManager2_6;

public class AuthenException extends Exception{
	private static final long serialVerisonUID = 1L;
	// 우선 직렬화 API의 일부 , 5.0부터 필요한 변수, 속도 및 보안 문제 해결 목적
	// JVM에서 UID생성
	public AuthenException(String message) {super(message);}
	
	
}
