package Ex;

public class Ex_03 {

	public static void main(String[] args) {
        String input = "banana";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }


}
