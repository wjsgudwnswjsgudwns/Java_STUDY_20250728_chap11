package Ex;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello123, Java456";
		
		byte[] bytes = str.getBytes();
		
		int count=0;
		
		for(int i=0; i<str.length();i++) {
			if (bytes[i]>=65 && bytes[i]<=90) {
				count++;
			} else if (bytes[i]>=97 && bytes[i]<=122) {
				count++;
			} 
		}
		System.out.println("문장의 알파벳 갯수는 : " + count);
		
		
	}

}
