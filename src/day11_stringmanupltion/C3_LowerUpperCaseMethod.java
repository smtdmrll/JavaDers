package day11_stringmanupltion;

import java.util.Locale;

public class C3_LowerUpperCaseMethod {

	public static void main(String[] args) {
		/*
		 * str.toLowerCase()b�t�n verilen stringin tamam�n� k���k harfe �eviri 
		 * str.touppercase() verilenin tamam�n� b�y�k harfe �evirir
		 */
		
		String str= "Techproeducation";
		
		//b�y�k harfle yazd�rmak istersek
		System.out.println(str.toUpperCase());
		
		//str i b�y�k harfe �evirmek istersek nas�l yapar�z ��yle yapar�z 
		
		str=str.toUpperCase();
		
		//art�k 15. sat�rdan sonra str b�y�k harf oldu 
		System.out.println(str);
		//bu sat�rdan sonra str kal�c� olara b�y�k harflerden olu�an bir string oldu 
		
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));// forlanguage k�sm� listede dil yoksa se�ilip i�ine k�saltma yaz�l�r

		
		
		

	}

}
