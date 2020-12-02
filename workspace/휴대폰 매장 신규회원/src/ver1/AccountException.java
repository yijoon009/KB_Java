package ver1;
import java.util.regex.Pattern;

public class AccountException {

	public void nameCheck(String name) throws AuthenException{
		boolean check = Pattern.matches("^[가-힣]*$",name);
		// 정규 표현식 regular 한글만 허용하기
		if(!check) {
			throw new AuthenException("이름은 한글로 적어야 합니다.");
		}
	}
	public void emailCheck(String email) throws AuthenException {
		boolean check = Pattern.matches("^[A-Za-z0-9]+@(.+)$", email);
		if(!check) throw new AuthenException("email은 xxxx@yyyy.com 형식으로 입력하세요");
	}
	
}
