package day42_abstractclasses;

public abstract class Personel {
	/*
	  	bir class� abstract yapmak i�in class keywordundan �nce abstract yazmak yeterlidir 
	  	
	  	1-	abstract bir class�n i�inde variable olabilir mi 
	  			olabilir 
	  		
	  	abst variable olur mu 
	  			olmaz
	  			
	  	abstract class �n concrete childlar� abstract classdaki t�m dinamik �zellikler yani metodlar
	  		override etmek zorunday�z
	  		
	  	2- 	bir method abstract olabilir mi ve nas�l yaz�l�r  
	  			olur ve bodysiz yaz�l�r
	  	
	    3-	bir abs classta concretemethod yaz�labilir mi 
	  			bir abstract classda abstract ve concrete methodlar olabilir
	  			concrete child class lar abs methodlar� override ETMEK ZORUNDA d�r ama,
	  			concrete methodlar� override etmek �STE�E BA�LIDIR
	 */
	
	
	public String isim ="Samet";    //1
	
	public abstract void maasHesapla(); //2
	public abstract void mesaiBilgisi();
	
	public void ozelSigorta() { //3
		System.out.println("bu personel �zel sigorta kapsam�ndad�r ");
		
		
	}
}
























