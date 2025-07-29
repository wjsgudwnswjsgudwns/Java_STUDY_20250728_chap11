package chap11.part01;

public class Member {
	
	public String id;

	public Member() {
		super();
	}

	
	public Member(String id) {
		super();
		this.id = id;
	}
	
	// 객체를 인수로 받아서 그 객체가 Member 클래스로 만든 객체인지 확인하여
	// member 객체로 다운 캐스팅 하여 그 안에 있는 id 필드를 꺼내서
	// 본인 객체가 가지고 있는 id 값과 비교하여 맞으면 true 틀리면 false를 출력하는 메소드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}


	@Override
	public String toString() {
		return id;
	}

	

}
