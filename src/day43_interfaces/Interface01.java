package day43_interfaces;

public interface Interface01 {
	
	public void motor(); //interface içinde abstract methodlar ve ÖZEL concrete methodlar olabilir
	 
	/*
	 	bir abstract methodun bodysi olmadýðýndan o methodun
	 		istenen dinamik özelliði nasýl gerçekleþtireceði bilemmiz mümkün deðil sadece ne yapacaðýný biliriz
	 	
	 	bu method bize þunu anlatýr: 
	 		beni inherit eden her concrete class ýn dinamik motor özelliði olmalýdýr
	 */
	
	void vites(); //beni inherit eden her concrete class ýn dinamik vites özelliði olmalýdýr
	
	abstract void kasa(); //beni inherit eden her concrete class ýn dinamik kasa özelliði olmalýdýr
	
	//Interface de sadece ABSTRACT, PUBLÝC methodlar olur 
			// bu iki keyworduYAZSAK DA YAZMASAK DA java tüm methodlarý bu þekilde kabul eder 

	/*
	 	javada interface oluþturmak istiyorsak baþtan seçmeliyiz 
	 		bir class sonradan bazý keywordler yazýlarak interface yapýlamaz
	 */
	
	String ISIM="samet"; // java isim kelimesini italic ve bold yaptý 
								// demek ki tüm variable lar final ve static tir ve bu yüzden deðer atamak zorundayýz	

}














