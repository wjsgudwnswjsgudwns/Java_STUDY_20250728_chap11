package chap11.part01.String;

public class JuminNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumin = "990729-1234567";
		
		char gender = jumin.charAt(7);
		switch (gender) {
			case '1' : // char 타입 문자와 비교
			case '3' : // char 타입 문자와 비교
				System.out.println("남자");
				break;
			case '2' : // char 타입 문자와 비교
			case '4' : // char 타입 문자와 비교
				System.out.println("여자");
				break;
			default :
				System.out.println("잘못된 주민번호입니다.");
				break;
		}
	}

}
