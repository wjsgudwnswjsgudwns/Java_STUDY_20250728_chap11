package Ex;

public class Ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "banana";
		String str1 = "";
		
		byte[] bytes = str.getBytes();
		byte[] bytes1 = str1.getBytes();
		
		for (int i =0; i<str.length();i++) {
			for(int j=0;j<str1.length();j++) {
				if (bytes[i] != bytes1[j]) {
					System.out.println(bytes[i]);
			}
		}
		
			
		}
		
		
	}

}
