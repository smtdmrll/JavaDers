package day31_varargsstringbuilder;

public class C6_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb1= new StringBuilder();// boþ bir stringbuilder oluþturur 
		System.out.println("sb1: "+ sb1);
		
		StringBuilder sb2 = new StringBuilder("samet"); // içinde samet deðeri olan bir string builder üretir 
		System.out.println("sb2: "+ sb2);
		
		StringBuilder sb3 = new StringBuilder(10); // 10 karakter kapasitesi olan bir sb üretir 
		System.out.println("sb3: "+ sb3);
		
		
		sb1.append(" hoca");
		System.out.println("sb1: "+ sb1); //  hoca
	
		sb2.append(" hoca");
		System.out.println("sb2: "+ sb2); //samet hoca
		
		sb3.append(" hoca");
		System.out.println("sb3: "+ sb3); // hoca
		
		
		
		System.out.println("sb1 uzunluk "+ sb1.length()); //5 " hoca"
		System.out.println("sb1 kapasite "+ sb1.capacity()); //16 hiç deðer yazmadýðýmýz için default kapasite 16
		
		
		System.out.println("sb2 uzunluk "+ sb2.length()); //10 "samet hoca"
		System.out.println("sb2 kapasite "+ sb2.capacity()); //21 baþta biz 5 oluþturduk(samet yazarak) 16 da defaulttan geldi
		
		
		System.out.println("sb3 uzunluk "+ sb3.length()); //5 " hoca"
		System.out.println("sb3 kapasite "+ sb3.capacity()); //10 baþta 10 kapasite verdiðimiz için dolana kadar 10 u kullanýr
		
		//capacity hafýza yönetimi için çok önemli 
		
		//kod yazýlýrken sabit uzunluk veya maks uzunluk belli ise 
		// 3. metod ile oluiturarak HAFIZA KULLANIMINI optimize edebiliriz 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
