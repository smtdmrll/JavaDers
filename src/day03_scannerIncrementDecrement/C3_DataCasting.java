package day03_scannerIncrementDecrement;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		//byte veri türünde bir deðiþken oluþturup deðer atayýn 
		//sonra oluþturulan variable ý adým adým AUTO WIDENING geniþletip yazdýrýn 
		//önemli autowidening sadece pirimitive data tiplerinde olur ve sayý data tipleri için olur
		
		byte numByte=34;
		
		System.out.println("byte deðeri : "+ numByte);
		 //short yapalým. short türünden deðiþken oluþturmam lazým ömce 
		
		short numShort= numByte; // short byte dan büyük olduðu için java þikayet etmeyip auto widening ile
								// deðeri short variable a atýyor 
		
		
		
		
		System.out.println("short için : "+ numShort );
		
		int numInt= numShort; 
		
		System.out.println("integer deðeri için baboþ : "+ numInt);
		
		float numFloat= numInt;
		
		System.out.println("float için gakkoþ "+ numFloat);
		
		double numDouble= numFloat;
		
		System.out.println("dubbblee babbaaa "+ numDouble);
		
		
	}

}
