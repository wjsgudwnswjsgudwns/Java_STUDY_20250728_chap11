package chap11.part01;

public class SystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<10000;i++) {
			System.out.println(i);
			if (i==5000)  {
				break;
//				System.exit(i); // break는 for문을 종료하지만 System.exit는 프로그램을 종료시켜버림 
			}
		} 
		System.out.println("******for문 종료*******");
		
		
		System.out.println("=======================");
		
		long time1 = System.nanoTime(); // 현재시간을 나노 초로 뽑음
		long time_m1 = System.currentTimeMillis(); // 현재시간을 밀리 초로 뽑음
		
		Long sum=0L;
		for(int i=1;i<=10000000;i++) {
			sum += i;
		}
		System.out.println(sum);
		long time2 = System.nanoTime(); // 끝난 시간을 나노초로 뽑음
		long time_m2 = System.currentTimeMillis(); // // 끝난 시간을 밀리 초로 뽑음
		
		System.out.println(time2 - time1); // 걸린 시간
		System.out.println(time_m2 - time_m1); // 걸린 시간. 밀리초 단위
		System.out.println("=======================");
	}

}
