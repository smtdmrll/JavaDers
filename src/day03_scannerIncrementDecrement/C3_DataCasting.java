package day03_scannerIncrementDecrement;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		//byte veri t�r�nde bir de�i�ken olu�turup de�er atay�n 
		//sonra olu�turulan variable � ad�m ad�m AUTO WIDENING geni�letip yazd�r�n 
		//�nemli autowidening sadece pirimitive data tiplerinde olur ve say� data tipleri i�in olur
		
		byte numByte=34;
		
		System.out.println("byte de�eri : "+ numByte);
		 //short yapal�m. short t�r�nden de�i�ken olu�turmam laz�m �mce 
		
		short numShort= numByte; // short byte dan b�y�k oldu�u i�in java �ikayet etmeyip auto widening ile
								// de�eri short variable a at�yor 
		
		
		
		
		System.out.println("short i�in : "+ numShort );
		
		int numInt= numShort; 
		
		System.out.println("integer de�eri i�in babo� : "+ numInt);
		
		float numFloat= numInt;
		
		System.out.println("float i�in gakko� "+ numFloat);
		
		double numDouble= numFloat;
		
		System.out.println("dubbblee babbaaa "+ numDouble);
		
		
	}

}
