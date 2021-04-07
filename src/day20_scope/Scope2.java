package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		//ben farklý classlardan da Scope1 classýna object oluþturarak ulaþabilirim 
		
		Scope1 obj4 = new Scope1 ();
		System.out.println(obj4.isim);
		System.out.println(obj4.soyisim);
		
		obj4.soyisim="can";
		obj4.isim="ahmet";
		
		System.out.println(obj4.isim+" "+ obj4.soyisim);
				
	}

}
