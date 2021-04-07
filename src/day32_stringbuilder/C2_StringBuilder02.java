package day32_stringbuilder;

import java.time.LocalTime;

public class C2_StringBuilder02 {

	public static void main(String[] args) {
		/*
		 
		 100.000 kere dönecek bir loop yazalým
		 loopda str ve stringbuilder kullanýp öncesinde ve sonrasýnda zaman alalým 
		 hýzlarýný karþýlaþtýralým
		 
		 */
		
		String str= "";
		StringBuilder sb = new StringBuilder("");
		
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1);
		
		
		for (int i = 0; i < 100000; i++) {
			str+=i;
		}
		
		LocalTime lt2 = LocalTime.now();
		System.out.println(lt2);
		
		System.out.println("======================================");
		
		LocalTime lt3 = LocalTime.now();
		System.out.println(lt3);
		
		
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		
		LocalTime lt4 = LocalTime.now();
		System.out.println(lt4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
