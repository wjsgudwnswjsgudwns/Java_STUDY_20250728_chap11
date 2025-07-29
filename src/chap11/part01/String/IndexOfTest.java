package chap11.part01.String;

public class IndexOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "대한민국 일본";
		int index = str.indexOf("일본");
		System.out.println(index);
		
		if(str.indexOf("민국") != -1) { // 특정 단어가 존재하는지 찾을때 사용
			System.out.println("존재하는 단어입니다.");
		} else {
			System.out.println("없는 단어입니다.");
		}
	}

}