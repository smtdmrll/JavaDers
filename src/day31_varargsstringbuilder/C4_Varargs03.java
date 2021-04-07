package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		
		//verilen integerlardan ilki ari� t�m say�lar toplay�n ve
		//buldu�unuz toplam ile ilk say�y� �arp�p sonucu yazd�r�n
		toplama(2);
		toplama(2, 5);
		toplama(5, 10, 15);
		toplama(4, 5, 9, 7);
		toplama(5, 6, 8, 10, 45, 78, -12);

	}

	public static void toplama(int sayi, int... var) { //methodun i�ine bir tane daha parametre ekleyeceksek varargs mutlaka sonda olmal�
														//mutlaka ama mutlaka sonda olmal� 
														 //ba�a int t�r�nden parametre ekledi�imiz i�in method callun i�inden ilk int eleman� alacak  
														  //varargs � FOR EACH LOOP d���nda b�ka loopla �al��t�ramazs�n 
		
		System.out.println("varargs a dahil olmayan argument:"+ sayi+ "\n" ); 

		int toplam = 0;	
		for (int each : var) {
			toplam += each;
		}
		
		System.out.println("var la toplanan elemanlar�n toplam� : " + toplam +"\n"); 

		System.out.println("ilk say�yla toplam�n �arp�m�: "+ toplam*sayi +" \n\n\n");
	}

}
