package view;

import dao.UserDAO;
import vo.UserVO;

public class Index {
	public static void main(String[] args) {
		//아이디 검사 테스트
//		System.out.println(new UserDAO().checkId("user004"));
		
		//회원가입 검사 테스트
//		System.out.println(
//				new UserDAO().join("user010", "1234", "한동석", 19, "01043825111"));
		
		//세션 테스트
//		System.out.println(UserDAO.session_id);
		
		//로그인 테스트
//		System.out.println(new UserDAO().login("user009", "1234"));
//		UserVO user = new UserDAO().select();
//		if(user != null) {
//			System.out.println(user);
//		}
		
		//삭제 테스트
//		System.out.println(new UserDAO().delete("1111"));
		
		//로그아웃 테스트
//		new UserDAO().logout();
		
		//수정 테스트
//		System.out.println(new UserDAO().update("1234", "1111"));
//		System.out.println(new UserDAO().login("user005", "1111"));
//		System.out.println(UserDAO.session_id);
//		new UserDAO().logout();
//		System.out.println(UserDAO.session_id);
		
		//목록 테스트
										//선언부		사용부(문장이 여러개 일 때 중괄호를 사용)
//		new UserDAO().selectAll().forEach(value -> System.out.println(value));
		
		//아이디 찾기 테스트
//		System.out.println(new UserDAO().findId("01001010101", "1234"));
		
		//비밀번호 찾기 테스트
		System.out.println(new UserDAO().findPw("user010", "01043825111"));
	}
}










