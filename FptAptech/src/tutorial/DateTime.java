package tutorial;

import java.util.Date;

public class DateTime {
	public static void main(String args[]){
		Date now = new Date();
		System.out.println(now);
		
		// Dùng như getTime.
		long nowOther = System.currentTimeMillis();
		long nowInMs = now.getTime();
		System.out.println(nowInMs);
		System.out.println(nowOther);
		System.out.println("================================");
		Date tomorrow = new Date(nowOther + (24*60*60*1000));
		Date yesterday = new Date(nowOther - (24*60*60*1000));
		System.out.println(yesterday);
		System.out.println(now);
		System.out.println(tomorrow);
		System.out.println("================================");
		Date tomorrow_1000 = new Date(nowOther + (24*60*60*1000*1000l));
		Date yesterday_1000 = new Date(nowOther - (24*60*60*1000*1000l));
		System.out.println(yesterday_1000);
		System.out.println(now);
		System.out.println(tomorrow_1000);
		System.out.println("================================");
		// so sánh hiện tại với 1000 ngày sau
		System.out.println(now.before(tomorrow_1000));
	}
}
