package day42_abstractclasses;


public class C1_Final {

	final static int SAYÝ=10;
	// instance bir variable ý final ve static yaparsan java kalýn harfe çeviri
	 	// biz de enel kullaným adýna büyük harflerle yazarýz 
	
	String isim; 
	//Instance variable lara ilk deðer atamasý yapmak zorunda deðilüz data türüne göre java default deðer atayabilir 
	
	//ama final variable larýn deðeri sonra deðiþmeyeceði için tanýmlarken ilk atamayý yapmak zorundayým yoksacte verir 
	public static void main(String[] args) {
		
		System.out.println(SAYÝ);
		
		System.out.println(Integer.MAX_VALUE);//final static
	}
	public void deneme () {
		System.out.println("deneme yapýyoruz");
	}
	public final void deneme2() {
		System.out.println("deneme yapýyoruz 2222 ");
	}
		
	
}
