package day11_stringmanupltion;

import java.util.Locale;

public class C3_LowerUpperCaseMethod {

	public static void main(String[] args) {
		/*
		 * str.toLowerCase()bütün verilen stringin tamamýný küçük harfe çeviri 
		 * str.touppercase() verilenin tamamýný büyük harfe çevirir
		 */
		
		String str= "Techproeducation";
		
		//büyük harfle yazdýrmak istersek
		System.out.println(str.toUpperCase());
		
		//str i büyük harfe çevirmek istersek nasýl yaparýz þöyle yaparýz 
		
		str=str.toUpperCase();
		
		//artýk 15. satýrdan sonra str büyük harf oldu 
		System.out.println(str);
		//bu satýrdan sonra str kalýcý olara bðyðk harflerden oluþan bir string oldu 
		
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));// forlanguage kýsmý listede dil yoksa seçilip içine kýsaltma yazýlýr

		
		
		

	}

}
