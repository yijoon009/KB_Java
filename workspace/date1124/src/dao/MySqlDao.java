package dao;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySQL DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("MySQL DB���� ����");
		
	}

	@Override
	public void update() {
		System.out.println("MySQL DB���� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("MySQL DB���� ����");
		
	}

}
