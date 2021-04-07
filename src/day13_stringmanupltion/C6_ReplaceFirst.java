package day13_stringmanupltion;

public class C6_ReplaceFirst {

	public static void main(String[] args) {
		/*
		 * sadece ilkini deðiþtirecek diðerlerini bir þey yapmyacak
		 * 
		 */
		
		
		String str = " samet demirel";
		
		System.out.println(str.replaceFirst("\\w", "a"));
	}

}
