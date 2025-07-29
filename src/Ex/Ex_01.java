package Ex;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcabcabc";
		
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b') {
				count++;
			}
		}
		System.out.println("ab가 나온 횟수 : " + count);
	}

}
