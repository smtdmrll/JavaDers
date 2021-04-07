package day05_wrapperconcetenationoperators;

public class C5_ConditionalOperator {

	public static void main(String[] args) {
		
		// AND yani && iþareti, OR yani || 
		// && mükemmelliyetçidir ancak hepsi t iste yapar 
		// yani baboli senin anlayacaðýn bu matematikteki mantýk zaten adý conditional  mantýksal demek
		//|| bu or yani veya iþaretiyle ayný hepsi false olmadan fals göstermez 
		boolean isTrue = 5 > 4 && 7-3>0 ; // hepsi doðruysa sonuç doðru 
		
		System.out.println(isTrue); //t
		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2 && x*y>20 && x-y > 0 ); //t
		
		System.out.println(x+y<0 && x-y>0); // f
		
		System.out.println(x<y || x+y<0 || x*y>0 );//t
		
		

	}

}
