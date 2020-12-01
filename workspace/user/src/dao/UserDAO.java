package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import vo.UserVO;

public class UserDAO {
	private final int KEY = 3;
	
	//2�� �̻��� �޼ҵ忡�� ���Ǵ� ������ ���������� �����Ѵ�.
	
	//DBMS�� ������ �� �ֵ��� ���� ��ü�� ��� ����
	Connection conn;
	
	//JAVA���� �ۼ��� sql���� ��ü�� ��� ����
	PreparedStatement pstm;
	
	//sql���� ������ �� ������ ������� ��� ����
	ResultSet rs;
	
	//Model
	UserVO user;
	
	public static String session_id;
	
	//���̵� �˻�
	public boolean checkId(String id) {
		//�ܺο��� ����ڰ� �Է��� id���� ���޹޴´�.
		
		//Flag
		boolean check = false;
		
		//���ڿ� �������� sql���� �ۼ��Ѵ�. ���� ������ ���� �Ѵٸ�
		//�� �ڸ��� ?�� ������ش�. �̷� sql�� ���� ������� �Ѵ�.
		//��, PreparedStatement ��ü�� ?�� Ȱ���� �� �ִ�.
		String query = "SELECT COUNT(*) FROM TBL_USER WHERE ID = ?";
		try {
			//DBConnection�� ������ ���� conn��ü�� �����´�.
			conn = DBConnection.getConnection();
			
			//�ۼ��� sql���� pstm�� ����ش�.
			pstm = conn.prepareStatement(query);
			
			//sql�� �ȿ� �ִ� ù��° ?�� id���� �־��ش�.
			pstm.setString(1, id);
			
			//sql���� ������ �� ����� rs�� ����ش�.
			rs = pstm.executeQuery();
			
			//����� �ִ� sql���̸� �ݵ�� next()�� ����ؾ� get...()�� ���ؼ�
			//���� ������ �� �ִ�.
			rs.next();
			
			//sql���� COUNT(*)�� ����̱� ������ �����̰�,
			//�ߺ����� ���� ���� �������� �־��� ������ ����� 0 �Ǵ� 1�̴�.
			//1�̸� �˻� ����� �ִٴ� ���̰�, 0�̸� ���ٴ� ���̴�.
			if(rs.getInt(1) == 1) {
				//flag�� true�� �����Ͽ� �ߺ��� ������ �˸�
				check = true;
			}
			
		} catch (SQLException sqle) {
			System.out.println("UserDAO.java:33, checkId()���� ���� " + sqle);
		} catch (Exception e) {
			System.out.println("UserDAO.java:35, checkId() ���� " + e);
		} finally {
			try {
				//������ �ݴ� ������ �ݾ��ش�.
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				//close�κп��� ���ܹ߻��� ���� ������ �߻��� �� �ֱ� ������
				//���� ���ܸ� ó������ �ʰ�, ���� ���ܸ� �߻����Ѽ� ���� ���� ��Ų��.
				throw new RuntimeException(
						"UserDAO.java:48, checkId() close ����" + sqle.getMessage());
			}
		}
		return check;
	}
	
	//ȸ������
	public boolean join(String id, String pw, String name, int age, String phone_number) {
		String query = "";
		boolean check = false;
		
		if(!checkId(id)) {
			query = "INSERT INTO TBL_USER (USER_NUMBER, ID, PW, NAME, AGE, PHONE_NUMBER)"
					+ "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?)";
			try {
				int idx = 0;
				conn = DBConnection.getConnection();
				pstm = conn.prepareStatement(query);
				pstm.setString(++idx, id);
				pstm.setString(++idx, encrypt(pw));
				pstm.setString(++idx, name);
				pstm.setInt(++idx, age);
				pstm.setString(++idx, phone_number);
				
				if(pstm.executeUpdate() == 1) {
					check = true;
				}
				
			} catch (SQLException sqle) {
				System.out.println("UserDAO.java:102, join() ���� ���� : " + sqle);
			} catch (Exception e) {
				System.out.println("UserDAO.java:104, join() ���� " + e);
			} finally {
				try {
					if(pstm != null) {
						pstm.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException sqle) {
					throw new RuntimeException(
							"UserDAO.java:115, join() close ����" + sqle.getMessage());
				}
			}
			
		}
		return check;
	}
	//��ȣȭ
	public String encrypt(String pw) {
		String en_pw = "";
		
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i) * KEY);
		}
		return en_pw;
	}
	//��ȣȭ
	public String decrypt(String en_pw) {
		String de_pw = "";
		
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i) / KEY);
		}
		return de_pw;
	}
	//�α���
	//�ܺο��� ����ڰ� �Է��� ���̵�� �н����带 ���޹޴´�.
	public boolean login(String id, String pw) {
		
		//���޹��� ���̵�� �н������ ��ġ�ϴ� ������ �ִ��� �˻� ��
		//��� �Ǽ��� COUNT(*)�� �˾Ƴ���.
		String query = "SELECT COUNT(*) FROM TBL_USER "
				+ "WHERE ID = ? AND PW = ?";
		
		//Flag
		boolean check = false;
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, id);
			//��й�ȣ�� ��ȣȭ�� ���·� DB�� ����Ǿ� �ֱ� ������
			//���� ������ ��ȣȭ�ؼ� �����Ѵ�.
			pstm.setString(2, encrypt(pw));
			
			rs = pstm.executeQuery();
			
			rs.next();	//�ߺ��� �����Ƿ� ��� ���� �� ���̱� ������ next()�� �ѹ��� ����Ѵ�.
			
			//COUNT(*)�� 1�̸� ��ϵ� ������̹Ƿ� �α��� ����
			if(rs.getInt(1) == 1) {
				check = true;
				//�α��� �� �ٸ� ������ �̵��� �α��� ���¸� id�� �Ǵ��� �� �ֵ���
				//static ������ session_id�� ����ش�.
				session_id = id;
			}
			
		} catch (SQLException sqle) {
			System.out.println("UserDAO.java:174, login() ����," + sqle);
		} catch (Exception e) {
			System.out.println("UserDAO.java:176, login() ���� " + e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				throw new RuntimeException(
						"UserDAO.java:190, login() close ����" + sqle.getMessage());
			}
		}
		return check;
	}
	
	//�α׾ƿ�
	public void logout() {
		//����Ǿ� �ִ� session_id���� �����ش�.
		session_id = null;
	}
	
	//����(��й�ȣ ����)
	//������ȣ��, �α����� �Ǿ����� ������ ��й�ȣ�� �� �� �� �Է¹޴´�.
	//���� ��й�ȣ�� ���Ӱ� ������ ��й�ȣ�� ���޹޴´�.
	public boolean update(String pw, String new_pw) {
	
		//�α��ε� id�� �Է��� pw�� �˻��� �� ã�Ҵٸ� �ش� �������
		//pw�� ���ο� pw�� �������ش�.
		String query = "UPDATE TBL_USER SET PW = ?"
				+ " WHERE ID = ? AND PW = ?";
		boolean check = false;
		
		if(session_id == null) {
			//���� �α��� ���°� �ƴ϶�� ���� ������ �������� �ʵ��� �ٷ� false�� �������ش�.
			return false;
		}
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, encrypt(new_pw));
			pstm.setString(2, session_id);
			pstm.setString(3, encrypt(pw));
			
			//SQL�� ��� �Ǽ��� 1�̶�� �ش� ������� ��й�ȣ ���� ����
			if(pstm.executeUpdate() == 1) {
				check = true;
			}
			
		} catch (SQLException sqle) {
			System.out.println("UserDAO.java:223, update() ���� ����, " + sqle);
		} catch (Exception e) {
			System.out.println("UserDAO.java:225, update() ���� " + e);
		} finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				throw new RuntimeException(
						"UserDAO.java:239, update() close ����" + sqle.getMessage());
			}
		}
		
		return check;
		
	}
	//����(���� ����)
	//ȸ�� Ż��� ������ȣ��, ������ ��й�ȣ�� �ٽ� �� �� �Է¹޴´�.
	//�ٽ� �Է��� ��й�ȣ�� ���޹޴´�.
	public boolean delete(String pw) {
		//�α��ε� id�� �Է��� pw�� �˻��� user_number������ �����ϱ� ���� ���������� ����Ѵ�.
		String query = "DELETE FROM TBL_USER WHERE"
				+ "(USER_NUMBER) = "
				+ "(SELECT USER_NUMBER FROM TBL_USER WHERE ID = ? AND PW = ?)";
		boolean check = false;
		
		if(session_id == null) {
			return false;
		}
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, session_id);
			pstm.setString(2, encrypt(pw));
			
			if(pstm.executeUpdate() == 1) {
				check = true;
			}
			
		} catch (SQLException sqle) {
			System.out.println("UserDAO.java:265, delete() ���� ����, " + sqle);
		} catch (Exception e) {
			System.out.println("UserDAO.java:267, delete() ���� " + e);
		} finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				throw new RuntimeException(
						"UserDAO.java:278, delete() close ����" + sqle.getMessage());
			}
		}
		return check;
	}
	//�˻�
	//�α��ε� ������� ������������ �����ϱ� ���� �ش� ������� ������ ��� �����´�.
	//���� session_id�� ����ϱ� ������ ���޹��� �Ű������� ����.
	//���� �������� ������ �ִٰ� �ؼ�, ArrayList�� ����Ѵٸ� �� �濡 �ִ� ����
	//� ���� �ǹ��ϴ��� �˱� ��Ʊ� ������, �� ���� �̸��� �ִ� UserVO(��)��ü�� ����Ͽ� �������ش�.
	public UserVO select(){
		String query = "SELECT * FROM TBL_USER WHERE ID = ?";
		UserVO user = null;
		
		if(session_id == null) {
			return null;
		}
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, session_id);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				user = new UserVO();
				user.setUser_number(rs.getInt("USER_NUMBER"));
				user.setId(rs.getString(2));
				user.setPw(decrypt(rs.getString(3)));
				user.setName(rs.getString(4));
				user.setAge(rs.getInt(5));
				user.setPhone_number(rs.getString(6));
			}
			
		} catch (SQLException sqle) {
			System.out.println("UserDAO.java:310, select() ���� ����, " + sqle);
		} catch (Exception e) {
			System.out.println("UserDAO.java:312, select() ���� " + e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				throw new RuntimeException(
						"UserDAO.java:323, select() close ����" + sqle.getMessage());
			}
		}
		return user;
	}
	
	//���
	//ȸ�� ��ü ����� �������� ���� �޼ҵ�
	//�˻��Ǵ� ���� 2�� �̻��� �� �����Ƿ�,
	//�� ���� UserVO�𵨿� ��� ���� �𵨰�ü����
	//�����ϰ� ������ ArrayList�� ����ش�.
	public ArrayList<UserVO> selectAll(){
		String query = "SELECT * FROM TBL_USER";
		ArrayList<UserVO> users = null;
		UserVO user = null;
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			//���� �˻� ����� ���ٸ� ArrayList�� �Ҵ��� �ʿ䰡 ���� ������
			//1���� ���� �� new ArrayList<>()�� ���� �Ҵ����ش�.
			if(rs != null) {users = new ArrayList<>();}
			
			//rs.next() �ϳ��� ���� �ҷ��´�.
			//rs.get....() : �ϳ��� ���� �ҷ��´�.
			while(rs.next()) {
				user = new UserVO();
				user.setUser_number(rs.getInt("USER_NUMBER"));
				user.setId(rs.getString(2));
				user.setPw(decrypt(rs.getString(3)));
				user.setName(rs.getString(4));
				user.setAge(rs.getInt(5));
				user.setPhone_number(rs.getString(6));
				
				users.add(user);
			}
			
		} catch (SQLException sqle) {
			System.out.println("UserDAO.java:361, selectAll() ���� " + sqle);
		} catch (Exception e) {
			System.out.println("UserDAO.java:363, selectAll() ���� " + e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				throw new RuntimeException(
						"UserDAO.java:377, selectAll() close ����" + sqle.getMessage());
			}
		}
		return users;
	}
	//���̵� ã��(��ȣ, ��й�ȣ)
	//����ڰ� ȸ�����Խ� �ۼ��� �ڵ��� ��ȣ�� ��й�ȣ�� �Է��Ѵ�.
	//���޹��� ������ ID�� �˻��Ͽ� �����Ѵ�.
	//��, ����� ���Ƿ� �� ���� ȸ�����Ը� �����ϴ�
	//(���� ���� �� ȸ�������� �����ϴٸ�, ���� Ÿ���� ArrayList<String>���� �����ؾ� �Ѵ�.
	public String findId(String phone_number, String pw) {
		String query = "SELECT ID FROM TBL_USER WHERE PHONE_NUMBER = ? AND PW = ?";
		
		String id = null;
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, phone_number);
			pstm.setString(2, pw);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				id = rs.getString(1);
			}
		} catch (SQLException sqle) {
			System.out.println("UserDAO.java:401, findId() ������ ����, " + sqle);
		} catch (Exception e) {
			System.out.println("UserDAO.java:401, findId() ���� " + e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				throw new RuntimeException(
						"UserDAO.java:415, findId() close ����" + sqle.getMessage());
			}
		}
		return id;
	}
	
	//���� ��й�ȣ�� �ӽ� ��й�ȣ�� ����
	/**
	 * ��й�ȣ ã�� �� ������� ��й�ȣ�� �ӽ� ��й�ȣ�� �������ִ� �޼ҵ�
	 * @param user_number
	 * @param temp_pw
	 * @return boolean
	 */
	public boolean update(int user_number, String temp_pw) {
		String query = "UPDATE TBL_USER SET PW = ? WHERE USER_NUMBER = ?";
		boolean check = false;
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, encrypt(temp_pw));
			pstm.setInt(2, user_number);
			
			if(pstm.executeUpdate() == 1) {
				check = true;
			}
			
		} catch (SQLException sqle) {
			System.out.println("UserDAO.java:480, update() ������ ����, " + sqle);
		} catch (Exception e) {
			System.out.println("UserDAO.java:482, update() ���� " + e);
		} finally {
			try {
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				throw new RuntimeException(
						"UserDAO.java:415, findId() close ����" + sqle.getMessage());
			}
		}
		return check;
	}
	
	//��� ã��
	public boolean findPw(String id, String phone_number) {
		//������ ������ �������� �ӽ� ��й�ȣ�� �����.
		String temp = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*()_+-=[] {};:/?";
		
		boolean check = false;
		
		Random r = new Random();
		
		String query = "SELECT USER_NUMBER FROM TBL_USER"
				+ "WHERE ID = ? AND PHONE_NUMBER = ?";
		
		String temp_pw = "";
		
		try {
			conn = DBConnection.getConnection();
			pstm = conn.prepareStatement(query);
			pstm.setString(1, id);
			pstm.setString(2, phone_number);
			rs = pstm.executeQuery();

			if(rs.next()) {
				//8�ڸ� �ӽ� ��й�ȣ ����
				for (int i = 0; i < 8; i++) {
					temp_pw += temp.charAt(r.nextInt(temp.length()));
				}
				if(update(rs.getInt(1), temp_pw)) {
					//�ӽ� ��й�ȣ ���� �� ���� �Ϸ�
					String api_key = "NCSBGR1K2TNLV4TT";
				    String api_secret = "MTT01YRNLW5HJ3LZHAR3ICNNLSU2SFMU";
				    Message coolsms = new Message(api_key, api_secret);

				    // 4 params(to, from, type, text) are mandatory. must be filled
				    HashMap<String, String> params = new HashMap<String, String>();
				    params.put("to", "01043825111");
				    params.put("from", "01043825111");
				    params.put("type", "SMS");
				    params.put("text", "[�׽�Ʈ]\n�ӽ� ��й�ȣ : " + temp_pw + "\n����� �� ������ �ݵ�� ��й�ȣ�� �������ּ���.");
				    params.put("app_version", "JAVA SDK v2.2"); // application name and version

				    try {
				      JSONObject obj = (JSONObject) coolsms.send(params);
				      System.out.println(obj.toString());
				    } catch (CoolsmsException e) {
				      System.out.println(e.getMessage());
				      System.out.println(e.getCode());
				    }
				    
				    check = true;
				}
			}
			
		} catch (SQLException sqle) {
			System.out.println("UserDAO.java:557, findPw() ������ ����, " + sqle);
		} catch (Exception e) {
			System.out.println("UserDAO.java:559, findPw() ���� " + e);
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException sqle) {
				throw new RuntimeException(
						"UserDAO.java:570, findPw() close ����" + sqle.getMessage());
			}
		}
				
		return check;
		
	}
}














