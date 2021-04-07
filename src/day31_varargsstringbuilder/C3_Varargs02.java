package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		// istedigimiz kadar sayi girdigimizde tum sayilari toplayan bir method yazalim
        // Var---- variety cesitlilik, 
		// args-- arguments
		// varargs arg�ment �e�itlili�i gibi gibi gibi 
        
		toplama(2, 5);
		toplama(5, 10, 15);
		toplama(4, 5, 9, 7);
		toplama(5, 6, 8, 10, 45, 78, -12);

	}

	public static void toplama(int... var) { // data turunden sonra yazdigimiz ... varags kullanacagimiz anlamina geliyor
											// var sadece isim istedi�ini yazabilirsin
		
		int toplam = 0;
		for (int each : var) {
			toplam += each;
		}
		System.out.println("toplam : " + toplam); 
        
    
	}

	
	
}


