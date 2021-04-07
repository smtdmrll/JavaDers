package day31_varargsstringbuilder;

public class C6_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb1= new StringBuilder();// bo� bir stringbuilder olu�turur 
		System.out.println("sb1: "+ sb1);
		
		StringBuilder sb2 = new StringBuilder("samet"); // i�inde samet de�eri olan bir string builder �retir 
		System.out.println("sb2: "+ sb2);
		
		StringBuilder sb3 = new StringBuilder(10); // 10 karakter kapasitesi olan bir sb �retir 
		System.out.println("sb3: "+ sb3);
		
		
		sb1.append(" hoca");
		System.out.println("sb1: "+ sb1); //  hoca
	
		sb2.append(" hoca");
		System.out.println("sb2: "+ sb2); //samet hoca
		
		sb3.append(" hoca");
		System.out.println("sb3: "+ sb3); // hoca
		
		
		
		System.out.println("sb1 uzunluk "+ sb1.length()); //5 " hoca"
		System.out.println("sb1 kapasite "+ sb1.capacity()); //16 hi� de�er yazmad���m�z i�in default kapasite 16
		
		
		System.out.println("sb2 uzunluk "+ sb2.length()); //10 "samet hoca"
		System.out.println("sb2 kapasite "+ sb2.capacity()); //21 ba�ta biz 5 olu�turduk(samet yazarak) 16 da defaulttan geldi
		
		
		System.out.println("sb3 uzunluk "+ sb3.length()); //5 " hoca"
		System.out.println("sb3 kapasite "+ sb3.capacity()); //10 ba�ta 10 kapasite verdi�imiz i�in dolana kadar 10 u kullan�r
		
		//capacity haf�za y�netimi i�in �ok �nemli 
		
		//kod yaz�l�rken sabit uzunluk veya maks uzunluk belli ise 
		// 3. metod ile oluiturarak HAFIZA KULLANIMINI optimize edebiliriz 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
