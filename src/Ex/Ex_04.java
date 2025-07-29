package Ex;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   
	     String str = "i like chopin";
	     String sum = "";
	     String sentence = "";
	     

	        for (int i = 0; i <= str.length(); i++) {
	            if (i == str.length() || str.charAt(i) == ' ') {
	                if (sentence.length() > 0) {
	                    String capitalized = Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);
	                    sum = sum + capitalized;
	                    if (i < str.length()) {
	                        sum = sum + " ";
	                    }
	                    sentence = "";
	                }
	            } 
	            else {
	            	sentence = sentence + str.charAt(i);
	            }
	        }

	        System.out.println(sum);
	}

}
