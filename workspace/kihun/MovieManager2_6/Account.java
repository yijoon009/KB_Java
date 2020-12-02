package MovieManager2_6;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner (System.in);
	AccountDAO dao = new AccountDAO();
	AccountException ae = new AccountException();

	// sign up
	public void insert() throws AuthenException{
		String pw2 = null;
		boolean id = true;
		boolean pw = true;
		boolean name=true,gender=true,tel=true;
		System.out.println("\t회원가입");
		System.out.println("-------------");

		try {
			AccountDTO dto = new AccountDTO();
			do {
				try {
					System.out.print("id 입력 >");
					dto.setId(sc.next());
					ae.idFormat(dto.getId());
					id=false;
					
				}catch (Exception e) {
					System.out.println(e.toString());
				}
			} while (id);
			do {
				try {
					System.out.print("pw 입력 >");
					dto.setPw(sc.next());
					System.out.print("pw 다시 확인 >");
					pw2 = sc.next();
					ae.pwCheck(dto.getPw(), pw2);
					pw=false;
				}catch (AuthenException e) {
					System.out.println(e.toString());
				}
			} while(pw);
			do {
				try {
					System.out.print("이름 입력 >");
					dto.setName(sc.next());
					ae.nameCheck(dto.getName());
					name = false;
				} catch (AuthenException e) {
					System.out.println(e.toString());
				} 
			} while(name);
			do {
				try {
					System.out.print("성별 *남/여) 입력>");
					dto.setGender(sc.next());
					ae.genderCheck(dto.getGender());
					gender = false;
				} catch (AuthenException e) {
					System.out.println(e.toString());
				}
			} while (gender);

			System.out.print("생일[yyyy-mm-dd] >");
			dto.setBirth(sc.next());
			System.out.print("이메일[xxxx@gmail.com] >");
			dto.setEmail(sc.next());
			
			do {
				try {
//					System.out.print("통신사[KT/SKT/LG] >");
//					dto.setBrand(sc.next());
					System.out.print("전화번호[010-xxxx-xxxx] >");
					dto.setTel(sc.next());
					ae.phoneCheck(dto.getTel());
					tel = false;
				} catch (AuthenException e) {
					System.out.println(e.toString());
				} // 왜 ,,, 
			} while(tel); // brand 제거
			int result = dao.insertData(dto);
			if(result != 0) {
				System.out.println("\n***회원가입을 축하드립니다!!***\n");
				System.out.println("----[회원가입 정보 확인]----");
				System.out.println(dto.toString());
			} else System.out.println("회원가입 실패, 제대로 입력 하였는지"
					+ "다시 확인 하십시오.");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public void update() {
		try {
			AccountDTO dto = new AccountDTO();
			
			System.out.println("수정 할 id >");
			dto.setId(sc.next());
			
			System.out.print("pw 확인 >");
			dto.setPw(sc.next());
			
			System.out.print("이메일 확인[xxxx@gmail.com] >");
			dto.setEmail(sc.next());
			System.out.print("전화번호 [010-xxxx-xxxx] >");
			dto.setTel(sc.next());
			int result = dao.updateData(dto);
		if(result!=0) System.out.println("회원 정보 수정 완료");
		else System.out.println("회원 정보 수정 실패");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void delete() {
		try {
			String id,pw;
			
			System.out.print("탈퇴 할 ID >");
			id = sc.next();
			System.out.print("PW 입력 >");
			pw = sc.next();
			int result = dao.deleteData(id,pw);
			
			if(result != 0) System.out.println("탈퇴 성공");
			else System.out.println("탈퇴 실패..");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void selectAll() {
		List<AccountDTO> lists = dao.getList();
		Iterator<AccountDTO> iter = lists.iterator();
		int i=1;
		
		while(iter.hasNext()) {
			AccountDTO dto = iter.next();
			System.out.println("[회원 "+i+"]");
			System.out.println(dto.toString());
			i++;
		}
	}
	public void searchId() {
		System.out.print("검색 할 id 입력 >");
		List<AccountDTO> lists = dao.getList(sc.next());
		Iterator<AccountDTO> iter = lists.iterator();
		if(!iter.hasNext()) {
			System.out.println("ID가 존재하지 않습니다.");
		} 
		while(iter.hasNext()) {
			AccountDTO dto = iter.next();
			System.out.println(dto.toString());
		}
	}
	
	
}
