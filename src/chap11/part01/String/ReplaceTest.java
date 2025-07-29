package chap11.part01.String;

public class ReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "길동이는 순신이보다 키가 큽니다. 하지만 순신이 길동이보다 말을 잘합니다."; // 길동 -> 유신으로 바꿔라.
		String str2 = str.replace("길동", "유신"); // 바꿀 단어 , 집어 넣을 단어
		
		System.out.println(str); // 원본을 수정하지는 않는다.
		System.out.println(str2);
		

	}

}
