package day13_stringmanupltion;

public class C6_ReplaceFirst {

	public static void main(String[] args) {
		/*
		 * sadece ilkini de�i�tirecek di�erlerini bir �ey yapmyacak
		 * 
		 */
		
		
		String str = " samet demirel";
		
		System.out.println(str.replaceFirst("\\w", "a"));
	}

}
