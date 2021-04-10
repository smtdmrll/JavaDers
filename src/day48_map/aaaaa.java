package day48_map;

public class aaaaa {

	// Method olusturmam gerekirse sunlari dusunmeliyim
    // > 1. Ben methoda ne gonderecegim > map'i ve java(string) kelimesini yollayacagim
    // > 2. Method bana ne dondurecek > list olarak isimleri donecek
    // 1) Value'lari birer birer almam lazim
    
    // Maps komplex bir yapidadir Key ve value'lardan olusur. 
    // Elemanlari bana tek tek getir diyemeyiz
    // {101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
    // Map yapisindan benim handle edebilecegm bir yapiya gecmem lazim.
    // Bunun icin de map1.values() ile komplex map yapisindan cikarak 
    // multidimensional array'e donusuyr gibi dusunebiliriz  
    // >> {{Ali, Can, Java}, { Veli, Yan, Java},{Ali, Yan, C#}} 
    // komplex yapida ki map'im collectiona donmus oldu
    // Collection'dan bahsedince artik for-each kullanabiliriz
    // For-each ile collection'da ki her bir elemani tek tek ele alabilirim
    // 1. Eleman > Ali, Can, Java 
    // String arr[] = each.split(", "); >> stringi ", " ile ayirarak array'e cevirdi 
    // maptan collectiona ordan da stringe ve kelimeleri tek tek kullanabilecegm array'a donmus oldum
    // if ile Array'in 2. indexi "Java" ise isim olan 1. indexi olusturdugum listeme ekle diyoruz
    // 2. ve 3. elemanlar icin de ayn islemi yapacak ve donguden cikarak istendigi sekilde listeyi return edecek
}
