
public class loopDemo {

	public static void main(String[] args) {
		
		//for 
		for (int i = 1; i<=10 ; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Sonlandı.");
		
		//while
		//verilen değer uygun değilse çalışmaz.
		int i = 1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti.");
		
		
		//do-while
		//şart uymasa bile do-while da döngü bir kere çalışır.
		int j = 1;
		do {
			//System.out.println("Loglandı.");
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("do-while döngüsü bitti.");
	
		
	}

}
