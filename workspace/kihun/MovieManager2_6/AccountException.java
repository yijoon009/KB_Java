/*
 * version updated : exception - brand ++
 */
package MovieManager2_6;

import java.util.regex.Pattern;

public class AccountException {

	public void idFormat(String str) throws AuthenException{
		if(str.length() < 5 || str.length() > 12) {
			throw new AuthenException("5자~12자 이내의 아이디만 가능합니다.");
		}
		int cnt1=0,cnt2=0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) cnt1++;
			else if(ch>='0'&&ch<'9')cnt2++;
			// a부터 z (대소문자) , 0~9까지 
		}
		if(cnt1==0 || cnt2==0) {
			throw new AuthenException("아이디는 영문+숫자를 입력해야 합니다.");
		}
	}
	public void pwCheck(String pw1,String pw2) throws AuthenException{
		int cnt1=0,cnt2=0;
		
		for(int i = 0; i<pw1.length();i++) {
			char ch = pw1.charAt(i);
			if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) cnt1++;
			else if(ch>='0'&&ch<'9')cnt2++;
		}
		if(cnt1<=0 || cnt2 <=0) {
			throw new AuthenException("비밀번호는 영문+숫자를 입력해야 합니다.");
		}
		if(!pw1.equals(pw2)) throw new AuthenException("PW를 다시 확인하십시오.");
	}
	public void genderCheck(String gender) throws AuthenException{
		if(!gender.equals("남") && !gender.equals("여")) {
			throw new AuthenException("성별은 남/여 로만 지정 할 수 있습니다.");
		}
	}
	public void nameCheck(String name) throws AuthenException{
		boolean check = Pattern.matches("^[가-힣]*$",name);
		// 정규 표현식 regular 한글만 허용하기
		if(!check) {
			throw new AuthenException("이름은 한글로 적어야 합니다.");
		}
	}
	public void phoneCheck(String phone) throws AuthenException{
		boolean check = Pattern.matches("(\\d{3})-(\\d{3,4})-(\\d{4})",phone);
//		boolean check2 = Pattern.matches("KT|SKT|LG",brand);
		
		// java phone numbers regex,  휴대폰 정규 표현식
		if(!check) throw new AuthenException("전화번호 입력은[010-****-****]로 입력하세요.");
//		if(!check2) throw new AuthenException("통신사는 [KT,SKT,LG]만 입력 가능합니다.");
	}
	public void emailCheck(String email) throws AuthenException {
		boolean check = Pattern.matches("^[A-Za-z0-9]+@(.+)$", email);
		if(!check) throw new AuthenException("email은 xxxx@yyyy.com 형식으로 입력하세요");
	}

	
}
