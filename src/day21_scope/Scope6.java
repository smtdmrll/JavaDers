package day21_scope;

public class Scope6 {

	public int num1; //acces modpublic yapýlýnca her yerden ulaþýlabilir 
	String name = "Ali"; // acces modifier yazýlmadýðý için default acces modifier geçerli 
						//sadece package içinde kullanýlabilir 

	public static void main(String args) {
		add();
//	product (5);  // static olmayan bir ethod static olan main method içerisinden çað
	}

	public static void add() {
//	num1 ++; 	//instance num1 static bir metodun içinde kullanýlamaz
		int num2 = 6;
		char letter;
		System.out.println("Do addition ");
	}

	public void product(int num3) {
		name = "Veli";

//	num2++; // num2 üstteki methodda oluþturulmuþ lokal bir variabledýr  farklý yerde kullanýlamaz 

		System.out.println(num3 * num3);
	}

}
