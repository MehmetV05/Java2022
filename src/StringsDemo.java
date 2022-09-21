
public class StringsDemo {

	public static void main(String[] args) {
		String mesaj= "  Bugün hava çok güzel.  ";
				System.out.println(mesaj);
				
//		System.out.println("Eleman Sayısı:"+mesaj.length());	//kaç eleman ollduğunu ulmak için 
//		System.out.println("5. eleman:"+mesaj.charAt(4));		//5 elemanda ne olduğunu bulmak için 
//		System.out.println(mesaj.concat(" Yaşasın!"));			//mesaja ekleme yapmak için concat kullandık.
//		System.out.println(mesaj.startsWith("B"));				//boolen'dır ne ile başladığını sorarız true veya false değeri alırız.
//		System.out.println(mesaj.endsWith("a"));				//aynı şekil üstteki gibidir. Ne ile bittiğini bulmak için yaparız.
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);					//mesajda sadece istenilen karakterleri yazdırmak için kullanılır.
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf('a'));					//istenilenin kaçıncı indexde olduğunu bulmak için yapılır ilk bulduğunu yazar ve bitirir.
//		System.out.println(mesaj.lastIndexOf("a"));				//sondan sayarak gelir ve istenileni bulur ve indexini yazar.
				
				String yeniMesaj = mesaj.replace(' ' , '-');	//bir ifadenin yerine başka bişey koymak için kullanırız.
				System.out.println(yeniMesaj);					
				System.out.println(mesaj.substring(2));			//hangi indexden başlamak istersek böyle yaparız.
				System.out.println(mesaj.substring(2, 5));		//nereden başlayıp nereden bittidğine dair yazarız indexlerini.
				for(String kelime:mesaj.split(" "))
					System.out.println(kelime);
				System.out.println(mesaj.toUpperCase());		//büyük yazar bütün karakterleri
				System.out.println(mesaj.toLowerCase());		//küçük yazar bütün karakterleri.
				System.out.println(mesaj.trim());				//boşlukları atar.
				
				
				
				
				
	}

}
