package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {
	public static void main(String[] args) {
		/*
		 * javada saat ile i�lem yapmak i�in LocalTime class�nda obje kullan�r�z
		 */

		LocalTime saat = LocalTime.now();
		System.out.println(saat); // 22:38:13.236187700 . dan sonras� nanosaniye // run edilen saati verir

		for (int i = 0; i < 1000000; i++) {
			i += 1;
		}
		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2); // saat le saat2 aras�nda yani for loop bilmem ka� milisaniyede �al��t�
		
		System.out.println(saat.plusHours(15)); // 15 saat sonras� 
		
		System.out.println(saat.getSecond()); //hangi saniyedeyiz
		
		System.out.println(saat.minusSeconds(1545447854)); //bilmem �u kadar saniye �nce saat bu 
	
		
		System.out.println(saat.now(ZoneId.of("Japan")));
		
		System.out.println(saat.plusHours(12).plusMinutes(26));
		
		
		
	}
}
