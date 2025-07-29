package chap11.part01.String;

public class CharAtTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Korea oop program";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2)); // 문자열 중에서 한 글자만 반환 해주는 메소드
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			if(str.charAt(i)=='o') {
				count++;
			}
		}
		
		System.out.println("문자열 내에 o가 "+ count +"번 포함 되어있습니다.");
	}

}
