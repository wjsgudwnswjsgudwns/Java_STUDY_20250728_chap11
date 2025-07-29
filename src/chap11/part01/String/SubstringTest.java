package chap11.part01.String;

public class SubstringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "서울특별시 종로구 숭인동 111번지 306호 2층";
		
		String str2 = str.substring(6, 8); // index 6: 종 /index : 구 
		System.out.println(str2); // 출력 결과 : 종로
		// endindex에 해당하는 문자는 해당되지 않는다.
		
		String str3 = str.substring(6, 9); // index 6: 종 /index :  
		System.out.println(str3); // 출력 결과 : 종로구
		
		String str4 = str.substring(14); // 시작 인덱스부터 끝까지
		System.out.println(str4); // 출력 결과 : 111번지 306호 2층 
 }
}
