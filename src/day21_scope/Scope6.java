package day21_scope;

public class Scope6 {

	public int num1; //acces modpublic yap�l�nca her yerden ula��labilir 
	String name = "Ali"; // acces modifier yaz�lmad��� i�in default acces modifier ge�erli 
						//sadece package i�inde kullan�labilir 

	public static void main(String args) {
		add();
//	product (5);  // static olmayan bir ethod static olan main method i�erisinden �a�
	}

	public static void add() {
//	num1 ++; 	//instance num1 static bir metodun i�inde kullan�lamaz
		int num2 = 6;
		char letter;
		System.out.println("Do addition ");
	}

	public void product(int num3) {
		name = "Veli";

//	num2++; // num2 �stteki methodda olu�turulmu� lokal bir variabled�r  farkl� yerde kullan�lamaz 

		System.out.println(num3 * num3);
	}

}
