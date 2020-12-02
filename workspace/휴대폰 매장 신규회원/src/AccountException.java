
import java.util.regex.Pattern;

public class AccountException {

	public void nameCheck(String name) throws AuthenException{
		boolean check = Pattern.matches("^[가-힣]*$",name);
		// 정규 표현식 regular 한글만 허용하기
		if(!check) {
			throw new AuthenException("이름은 한글로 적어야 합니다.");
		}
	}
	public void socialNumCheck(String number) throws AuthenException{
		boolean check = Pattern.matches("^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-2]{1}$", number);
		if(!check) throw new AuthenException("주민번호는 ******-1or2로만 입력 가능합니다.");
		
	}
	public void emailCheck(String email) throws AuthenException {
		boolean check = Pattern.matches("^[A-Za-z0-9]+@(.+)$", email);
		if(!check) throw new AuthenException("email은 xxxx@yyyy.com 형식으로 입력하세요");
	}
	
	public void phoneCheck(String phone) throws AuthenException{
		boolean check = Pattern.matches("(\\d{3})-(\\d{3,4})-(\\d{4})",phone);
		if(!check) throw new AuthenException("전화번호 입력은[010-****-****]로 입력하세요.");
	}
	
}
