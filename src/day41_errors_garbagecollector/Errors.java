package day41_errors_garbagecollector;

import java.time.LocalTime;

public class Errors {
	public static void main(String[] args) {
	//	System.out.println(20/0);// RTE deðil RunTimeException bundan sonra 
		
//		String str="asd; // CTE dur .. çüðnkü çifttýrnaðý tamamlamadýkça kod çalýþmaz 
			//bu tür yazýmdan kaynaklanan hatalar kolayca düzeltilebilir 
			
		
		//javada error dendiðinde önüne geçilemeyen kod ile çözülemeyen sistemden kaynaklý 
		//		büyük hatalar kastedilir
		
		//Errorlar UNCHECKED dir ve java bunlarý öngöremez ancak gerçekleþtiðinde kodun çalýþmasý durdurulur sistem çöker baba
		
		String str ="";
		for (int i = 0; i <100000 ; i++) {
				str+=i;
			}
	}
}
