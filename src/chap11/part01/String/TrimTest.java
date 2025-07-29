package chap11.part01.String;

import java.util.Scanner;

public class TrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("좋아하는 인물을 입력하세요 : ");
		String str = scanner.nextLine();
		
		System.out.println(str.strip());  // 문자열 양쪽에 존재하는 공백 제거
		str = str.trim(); // 문자열 양쪽에 존재하는 공백 제거
		
		// 똑같이 공백을 제거하지만 trim 보다는 strip 쓰는걸 추천
		
		System.out.println(str.length());
	}

}
