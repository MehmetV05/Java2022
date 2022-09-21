
public class recapDemo1 {

	public static void main(String[] args) {
		int sayi1 =26;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;
		
		/*if (sayi1>sayi2) {
			System.out.println("Birinci sayı ikinci sayıdan küçüktür.");
		}else if (sayi1==sayi2) {
			System.out.println("Birinci sayı ikinci sayı ile eşittir.");
		}else {
			System.out.println("İkinci sayı birinci sayıdan büyüktür.");
		}*/
		
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		System.out.println("En büyük sayı : "+enBuyuk);
		
	}

}
