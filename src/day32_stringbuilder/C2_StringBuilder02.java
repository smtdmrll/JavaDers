package day32_stringbuilder;

import java.time.LocalTime;

public class C2_StringBuilder02 {

	public static void main(String[] args) {
		/*
		 
		 100.000 kere d�necek bir loop yazal�m
		 loopda str ve stringbuilder kullan�p �ncesinde ve sonras�nda zaman alal�m 
		 h�zlar�n� kar��la�t�ral�m
		 
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
