package chap11.part01;

import java.util.Date;

public class toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob = new Object();
		System.out.println(ob.toString());
		
		Member member1 = new Member("Tiger");
		System.out.println(member1.toString());
		
		Member member2 = new Member();
		System.out.println(member2.toString());
		
		Date date = new Date();
		System.out.println(date.toString());
	}

}
