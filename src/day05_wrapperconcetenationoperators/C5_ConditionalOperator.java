package day05_wrapperconcetenationoperators;

public class C5_ConditionalOperator {

	public static void main(String[] args) {
		
		// AND yani && i�areti, OR yani || 
		// && m�kemmelliyet�idir ancak hepsi t iste yapar 
		// yani baboli senin anlayaca��n bu matematikteki mant�k zaten ad� conditional  mant�ksal demek
		//|| bu or yani veya i�aretiyle ayn� hepsi false olmadan fals g�stermez 
		boolean isTrue = 5 > 4 && 7-3>0 ; // hepsi do�ruysa sonu� do�ru 
		
		System.out.println(isTrue); //t
		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2 && x*y>20 && x-y > 0 ); //t
		
		System.out.println(x+y<0 && x-y>0); // f
		
		System.out.println(x<y || x+y<0 || x*y>0 );//t
		
		

	}

}
