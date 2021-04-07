package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		
		//verilen integerlardan ilki ariç tüm sayýlar toplayýn ve
		//bulduðunuz toplam ile ilk sayýyý çarpýp sonucu yazdýrýn
		toplama(2);
		toplama(2, 5);
		toplama(5, 10, 15);
		toplama(4, 5, 9, 7);
		toplama(5, 6, 8, 10, 45, 78, -12);

	}

	public static void toplama(int sayi, int... var) { //methodun içine bir tane daha parametre ekleyeceksek varargs mutlaka sonda olmalý
														//mutlaka ama mutlaka sonda olmalý 
														 //baþa int türünden parametre eklediðimiz için method callun içinden ilk int elemaný alacak  
														  //varargs ý FOR EACH LOOP dýþýnda bþka loopla çalýþtýramazsýn 
		
		System.out.println("varargs a dahil olmayan argument:"+ sayi+ "\n" ); 

		int toplam = 0;	
		for (int each : var) {
			toplam += each;
		}
		
		System.out.println("var la toplanan elemanlarýn toplamý : " + toplam +"\n"); 

		System.out.println("ilk sayýyla toplamýn çarpýmý: "+ toplam*sayi +" \n\n\n");
	}

}
