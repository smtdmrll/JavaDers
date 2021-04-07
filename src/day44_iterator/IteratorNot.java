package day44_iterator;

public class IteratorNot {

	/*
    - Iterator : Interface'dir. Collections'da elemanlar arasi gezinmeye ve elemanlar uzerinde degisiklikler yapmaya yarar.
    Ozellikler index yapisina sahip olmayan collections icin tum elemanlara ulasabilecegimiz forEach loop ile elemanlari 
    kalici olarak degistiremedigimizden iterator kullaniriz.
    - Iterator interface old. icin direkt obje olusturmamiz mumkun degildir.
    Bunun yerine kullanacagimiz collection ismini yazip "." kullanarak iterator method'unu cagirabiliriz.
    - Iterator elemanlar arasinda sadece ILERI yonlu hareketler yapabilir cunku next(), hasNext() ve remove() 
    isminde 3 islevsel method'a sahiptir.Bir de onemsiz olan (Mehmet Hoca'nin yalancisiyim ben bilmiyorum) forEachRemaining() vardir.
    - ListIterator, iterator'in child interface'idir ama hep iler hem de geri hareket saglayacak daha fazla method'a sahiptir.
    - Iterator ile calisirken imlecin nerede old. COK ONEMLIDIR . Dolayisiyla kodumuz calismadan once ve sonra imlec'in 
    konumunu dikkate almamiz gereklidir. (imlec = cursor = pointer)
   */
}
