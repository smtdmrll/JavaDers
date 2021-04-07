package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		/*
		  javada sadece tarih kullanmak istiyorsak 
		  LocalDate class ýndan bir obje üretrizi 
		 */
		
		LocalDate tarih=LocalDate.now();
		System.out.println(tarih); //2021-03-19
		
		System.out.println(tarih.plusWeeks(20)); //2021-08-06
		System.out.println(tarih.plusDays(500)); //2022-08-01
		System.out.println(tarih.plusYears(3).plusDays(12).plusMonths(5)); //2024-08-31
		
		System.out.println(tarih.minusMonths(19)); //2019-08-19
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10)); //2017-11-09

		
		System.out.println(tarih.getDayOfYear());// 78
		System.out.println(tarih.getMonthValue()); // int olarak 3 girmek 
		System.out.println(tarih.getDayOfWeek()); //cuma
		
		LocalDate dogumGunu =LocalDate.of(1996, 4, 8);
		System.out.println("ddoðum gününüzü yazýn");
		System.out.println(dogumGunu.getDayOfWeek()); //monday
		
		System.out.println(tarih.getMonth()); //march  
		
		
		System.out.println(tarih.isLeapYear()); //false ARTIK YIL MI :D
		
		//þu an deðil de eski br tarih ile iþlem yapacaksak LocalDate.of metodunu kullanýyoruz
		LocalDate tarih1 = LocalDate.of(1995,12,15);
		LocalDate tarih2= LocalDate.of(1995, 12, 10);
		
		System.out.println(tarih1.isAfter(tarih2)); // tarih1 2 den sonra mý true
		System.out.println(tarih1.isBefore(tarih2));// false
		
		System.out.println(tarih.getDayOfYear());
		
		
	}

}
