package view;

import dao.UserDAO;
import vo.UserVO;

public class Index {
	public static void main(String[] args) {
		//���̵� �˻� �׽�Ʈ
//		System.out.println(new UserDAO().checkId("user004"));
		
		//ȸ������ �˻� �׽�Ʈ
//		System.out.println(
//				new UserDAO().join("user010", "1234", "�ѵ���", 19, "01043825111"));
		
		//���� �׽�Ʈ
//		System.out.println(UserDAO.session_id);
		
		//�α��� �׽�Ʈ
//		System.out.println(new UserDAO().login("user009", "1234"));
//		UserVO user = new UserDAO().select();
//		if(user != null) {
//			System.out.println(user);
//		}
		
		//���� �׽�Ʈ
//		System.out.println(new UserDAO().delete("1111"));
		
		//�α׾ƿ� �׽�Ʈ
//		new UserDAO().logout();
		
		//���� �׽�Ʈ
//		System.out.println(new UserDAO().update("1234", "1111"));
//		System.out.println(new UserDAO().login("user005", "1111"));
//		System.out.println(UserDAO.session_id);
//		new UserDAO().logout();
//		System.out.println(UserDAO.session_id);
		
		//��� �׽�Ʈ
										//�����		����(������ ������ �� �� �߰�ȣ�� ���)
//		new UserDAO().selectAll().forEach(value -> System.out.println(value));
		
		//���̵� ã�� �׽�Ʈ
//		System.out.println(new UserDAO().findId("01001010101", "1234"));
		
		//��й�ȣ ã�� �׽�Ʈ
		System.out.println(new UserDAO().findPw("user010", "01043825111"));
	}
}










