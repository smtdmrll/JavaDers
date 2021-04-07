package day34_Inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1 =  new Encapsulation();
		
		System.out.println(obj1.getOkulIsmi()); //Yýldýz Koleji
		System.out.println(obj1.getOkulHesapNo()); //12345
		System.out.println(obj1.isOkulAcikMi());//true
		
		obj1.setOkulIsmi("mehmet koleji");
		System.out.println(obj1.getOkulIsmi()); // mehmet koleji
		
		Encapsulation obj2 =  new Encapsulation();
		System.out.println(obj2.getOkulIsmi()); //Yýldýz Koleji 
		
		
	}

}
