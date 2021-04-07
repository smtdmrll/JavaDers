package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {
	public static void main(String[] args) {
		/*
		 * javada saat ile iþlem yapmak için LocalTime classýnda obje kullanýrýz
		 */

		LocalTime saat = LocalTime.now();
		System.out.println(saat); // 22:38:13.236187700 . dan sonrasý nanosaniye // run edilen saati verir

		for (int i = 0; i < 1000000; i++) {
			i += 1;
		}
		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2); // saat le saat2 arasýnda yani for loop bilmem kaç milisaniyede çalýþtý
		
		System.out.println(saat.plusHours(15)); // 15 saat sonrasý 
		
		System.out.println(saat.getSecond()); //hangi saniyedeyiz
		
		System.out.println(saat.minusSeconds(1545447854)); //bilmem þu kadar saniye önce saat bu 
	
		
		System.out.println(saat.now(ZoneId.of("Japan")));
		
		System.out.println(saat.plusHours(12).plusMinutes(26));
		
		
		
	}
}
