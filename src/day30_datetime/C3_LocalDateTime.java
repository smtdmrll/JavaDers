package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime tarihSaat = LocalDateTime.now();
		
		System.out.println(tarihSaat); //2021-03-19T23:04:48.286724800 formatýnda verir
		
		System.out.println(tarihSaat.toString()); // 2021-03-19T23:04:48.286724800 string olarak yazdýrýr 
	
		String t= tarihSaat.toString();
		
		System.out.println(t.startsWith("2021")); // true 
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
