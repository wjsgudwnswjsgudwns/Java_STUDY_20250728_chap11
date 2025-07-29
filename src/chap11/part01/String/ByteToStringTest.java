package chap11.part01.String;

public class ByteToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; // Hello Java의 아스키 코드 값 배열
		String str = new String(bytes);
		System.out.println(str);
	}

}
