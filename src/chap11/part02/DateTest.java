package chap11.part02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date nowTime = new Date();
		System.out.println(nowTime.toString());
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String date2 = dateformat.format(nowTime);
		System.out.println(date2);
		
		System.out.println(nowTime.getTime() + (2*60*60*1000)); // 현재시간 기준으로 2시간 뒤
		long newTime = nowTime.getTime() + (2*60*60*1000);
		nowTime.setTime(newTime);
		System.out.println("지금부터 2시간 후 : " + newTime);
	}

}
