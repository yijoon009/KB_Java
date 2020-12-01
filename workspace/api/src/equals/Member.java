package equals;

public class Member {
	public String id;
	public Member() {;}
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			//�ڽĸ޼ҵ� �����ϱ� ���� �ٿ�ĳ����
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
}
