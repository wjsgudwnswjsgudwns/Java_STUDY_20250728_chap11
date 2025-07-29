package Ex;

public class Ex_03 {

	public static void main(String[] args) {
        String input = "banana";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // 결과 문자열에 해당 문자가 아직 없으면 추가
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        // 결과 출력
        System.out.println(result);  // 출력: ban
    }


}
