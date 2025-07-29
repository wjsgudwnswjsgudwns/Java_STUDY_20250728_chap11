package chap11.part02;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calNow = Calendar.getInstance(); // 추상 클래스라서 getInstance로 객체 호출
		
		int year = calNow.get(Calendar.YEAR); // 년
		int month = calNow.get(Calendar.MONTH) + 1; // 월 / 0부터 시작해서 +1
		int day = calNow.get(Calendar.DAY_OF_MONTH); // 일
		
		int hour = calNow.get(Calendar.HOUR); // 시
		int minute = calNow.get(Calendar.MINUTE); // 분
		int second = calNow.get(Calendar.SECOND); // 초
		
		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.println(hour + "시" + minute + "분" + second + "초");
		
		
		// 요일 출력
		
		int week = calNow.get(Calendar.DAY_OF_WEEK);
		if (week == Calendar.SUNDAY) {
			System.out.println("일요일");
		} else if ( week == Calendar.MONDAY) {
			System.out.println("월요일");
		} else if ( week == Calendar.TUESDAY) {
			System.out.println("화요일");
		} else if ( week == Calendar.WEDNESDAY) {
			System.out.println("수요일");
		} else if ( week == Calendar.THURSDAY) {
			System.out.println("목요일");
		} else if ( week == Calendar.FRIDAY) {
			System.out.println("금요일");
		} else {
			System.out.println("토요일");
		} 
	}

}
