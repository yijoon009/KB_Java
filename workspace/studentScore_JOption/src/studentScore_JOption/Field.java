package studentScore_JOption;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Field {
	ArrayList<Account> acList = new ArrayList<>();
	WrongInputException wi = new WrongInputException();
	Account ac;
	Student st = new Student();
	
	Matcher m;
	int cnt;
	
	//회원가입
	public void setUser() throws AuthenticationException_mine{
		
		boolean id = true, pw = true, data = true;
		
		//회원가입id
		do {
//			
			String input = JOptionPane.showInputDialog("아이디를 입력해주세요. (8자 이내, 영문 + 숫자 조합  가능)");
			if(input.length()==0) {
				JOptionPane.showMessageDialog(null, "아이디를 입력해주시길 바랍니다.");
				continue;
			}
			if(input.length()>=8) {
				JOptionPane.showMessageDialog(null, "8자 이내로 입력해주시길 바랍니다.");
				continue;
			}
			if(input.matches("^[a-zA-Z]{1}[a-zA-Z0-9]+$")) {
				//첫 회원가입일 경우, 중복검사 필요 없음
				if(acList.size()==0) {
					ac = new Account();
					ac.setId(input);
					id = false;
				}else {
					//id중복검사
					for(Account alid : acList) {
						if((input.equals(alid.getId()))){
							//					if((user.getId()).equals(input)){
							JOptionPane.showMessageDialog(null, "이미 존재하는 ID입니다.");
						}else {
							ac = new Account();
							ac.setId(input);
							id = false;
						}
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "아이디는 영문 (숫자 가능)으로만 입력해야 합니다.");
			}
		}while(id);
		
		//회원가입pw
		do {
			String input = JOptionPane.showInputDialog("비밀먼호를 입력해주세요. (숫자만 가능)");
			if(input.length()==0) {
				JOptionPane.showMessageDialog(null, "비밀번호를 입력해주시길 바랍니다.");
				continue;
			}
			Pattern p = Pattern.compile("[A-Z,a-z,&%$#@!()*^]");
			m = p.matcher(input);
			if(m.find()) {
				JOptionPane.showMessageDialog(null, "비밀번호는 숫자로만 입력해야 합니다.");
			}else {
				ac.setPw(input);
				pw = false;
			}
		}while(pw);
		
		//첫화면 학교,학년,반 입력
		do {
			//아직 학교명 유효성검사 안함.
			ac.setSchool(JOptionPane.showInputDialog("학교 이름을 입력하세요."));
			ac.setClass_name(JOptionPane.showInputDialog("반을 입력하세요."));
			ac.setGrade(JOptionPane.showInputDialog("학년을 입력하세요."));
			data = false;
		}while(data);
		
		acList.add(ac);
		
	}//end setUser
	
	//로그인
	public void login() {
		String id = JOptionPane.showInputDialog("아이디를 입력하세요.");
		for(Account data : acList) {
			if(id.equals(data.getId())) {
				String pw = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
				if(pw.equals(data.getPw())) {
					input();
				}
			}
		}
	}//end login
	
	//학생성적입력
	public void input() {
		String name = JOptionPane.showInputDialog("학생 이름을 입력하세요");
		if(name.length()==0) {
			JOptionPane.showMessageDialog(null, "이름을 입력해 주시길 바랍니다.");
		}
		if(name.matches("^[가-힣]{2,4}$")) {
			
		}
	}//end input
}
















