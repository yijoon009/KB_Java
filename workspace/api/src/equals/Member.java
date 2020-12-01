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
			//자식메소드 접근하기 위해 다운캐스팅
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
}
