package day42_abstractclasses;


public class C1_Final {

	final static int SAY�=10;
	// instance bir variable � final ve static yaparsan java kal�n harfe �eviri
	 	// biz de enel kullan�m ad�na b�y�k harflerle yazar�z 
	
	String isim; 
	//Instance variable lara ilk de�er atamas� yapmak zorunda de�il�z data t�r�ne g�re java default de�er atayabilir 
	
	//ama final variable lar�n de�eri sonra de�i�meyece�i i�in tan�mlarken ilk atamay� yapmak zorunday�m yoksacte verir 
	public static void main(String[] args) {
		
		System.out.println(SAY�);
		
		System.out.println(Integer.MAX_VALUE);//final static
	}
	public void deneme () {
		System.out.println("deneme yap�yoruz");
	}
	public final void deneme2() {
		System.out.println("deneme yap�yoruz 2222 ");
	}
		
	
}
