package day42_abstractclasses;

public abstract class Personel {
	/*
	  	bir classý abstract yapmak için class keywordundan önce abstract yazmak yeterlidir 
	  	
	  	1-	abstract bir classýn içinde variable olabilir mi 
	  			olabilir 
	  		
	  	abst variable olur mu 
	  			olmaz
	  			
	  	abstract class ýn concrete childlarý abstract classdaki tüm dinamik özellikler yani metodlar
	  		override etmek zorundayýz
	  		
	  	2- 	bir method abstract olabilir mi ve nasýl yazýlýr  
	  			olur ve bodysiz yazýlýr
	  	
	    3-	bir abs classta concretemethod yazýlabilir mi 
	  			bir abstract classda abstract ve concrete methodlar olabilir
	  			concrete child class lar abs methodlarý override ETMEK ZORUNDA dýr ama,
	  			concrete methodlarý override etmek ÝSTEÐE BAÐLIDIR
	 */
	
	
	public String isim ="Samet";    //1
	
	public abstract void maasHesapla(); //2
	public abstract void mesaiBilgisi();
	
	public void ozelSigorta() { //3
		System.out.println("bu personel özel sigorta kapsamýndadýr ");
		
		
	}
}
























