package chap11.part01.String;

public class toLowerUpperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "KOREA";
		String str2 = "japan";
		String str3 = "Russia";
		
		String str4 = str1.toLowerCase(); // 모두 소문자로 변경
		String str5 = str2.toUpperCase(); // 모두 대문자로 변경
		String str6 = str3.toUpperCase(); // 모두 대문자로 변경
		
		System.out.println(str1); // KOREA
		System.out.println(str2); // japan
		System.out.println(str3); // Russia
		System.out.println(str4); // korea
		System.out.println(str5); // JAPAN
		System.out.println(str6); // RUSSIA
	
		String str7 = "korea";
		String str8 = str7.toUpperCase(); // 모두 대문자로 변경
		
		if(str1.equals(str7)) {
			System.out.println("두 문자열은 같다."); 
		} else {
			System.out.println("두 문자열은 다르다.");
		}
		
		if(str1.equals(str8)) {
			System.out.println("두 문자열은 같다."); 
		} else {
			System.out.println("두 문자열은 다르다.");
		}
		
		if(str1.equalsIgnoreCase(str7)) { // 대소문자 구분 x
			System.out.println("두 문자열은 같다."); 
		} else {
			System.out.println("두 문자열은 다르다.");
		}
		
	}

}
