package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kuldan bir c�nle ve bir harf isteyin. while loop kullanarak c�mlede istenen
		// harf ka� kez kullan�lm�� bulunuz.program case sensitive olsun
		
		Scanner scan=new Scanner (System.in);
		System.out.println("c�mle gir");
		String str =scan.nextLine();
		System.out.println("l�tfen saymak istedi�iniz harfi giriniz");
		String harf=scan.next().substring(0, 1); //string olarak ilk harfi al�r 
		
		int count=0;
		
		int index=0;
		
		while (index<str.length()) {
			if (str.substring(index, index+1).equals(harf)) {//substringle c�mledeki her harfi kontrol ediyoruz 
				count++;
					
			}
			index++;
			
		}
			System.out.println("c�mlede "+ harf+ " harfi "+ count + " defa kullan�lm�� ");
scan.close();	}


}
