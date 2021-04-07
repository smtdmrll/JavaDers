package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kuldan bir cðnle ve bir harf isteyin. while loop kullanarak cümlede istenen
		// harf kaç kez kullanýlmýþ bulunuz.program case sensitive olsun
		
		Scanner scan=new Scanner (System.in);
		System.out.println("cümle gir");
		String str =scan.nextLine();
		System.out.println("lütfen saymak istediðiniz harfi giriniz");
		String harf=scan.next().substring(0, 1); //string olarak ilk harfi alýr 
		
		int count=0;
		
		int index=0;
		
		while (index<str.length()) {
			if (str.substring(index, index+1).equals(harf)) {//substringle cümledeki her harfi kontrol ediyoruz 
				count++;
					
			}
			index++;
			
		}
			System.out.println("cümlede "+ harf+ " harfi "+ count + " defa kullanýlmýþ ");
scan.close();	}


}
