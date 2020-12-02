package studentScore_JOption;


public class WrongInputException {

	public void id_pwCheck(String str) throws AuthenticationException_mine{
		int cnt1=0,cnt2=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch <='Z')) cnt1++;
			else if(ch>='0' && ch<='9') cnt2++;
		}
		if(cnt1 == 0 || cnt2==0) throw new AuthenticationException_mine("아이디는 영문+숫자를 입력해야 합니다.");
	}
	
}
