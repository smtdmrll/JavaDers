package day41_errors_garbagecollector;

import java.time.LocalTime;

public class Errors {
	public static void main(String[] args) {
	//	System.out.println(20/0);// RTE de�il RunTimeException bundan sonra 
		
//		String str="asd; // CTE dur .. ���nk� �iftt�rna�� tamamlamad�k�a kod �al��maz 
			//bu t�r yaz�mdan kaynaklanan hatalar kolayca d�zeltilebilir 
			
		
		//javada error dendi�inde �n�ne ge�ilemeyen kod ile ��z�lemeyen sistemden kaynakl� 
		//		b�y�k hatalar kastedilir
		
		//Errorlar UNCHECKED dir ve java bunlar� �ng�remez ancak ger�ekle�ti�inde kodun �al��mas� durdurulur sistem ��ker baba
		
		String str ="";
		for (int i = 0; i <100000 ; i++) {
				str+=i;
			}
	}
}
