package classes;

public class Main {

	public static void main(String[] args) {
		System.out.println("**** JAVA DERSI 27 - 28 - 29: Classlar ****");

		// Reference Type

		// 101
		CustomerManager customerManager = new CustomerManager();
		// 102
		CustomerManager customerManager2 = new CustomerManager();

		// 101 oldu 102
		// 101 çöpe gitti
		customerManager = customerManager2;

		// --STACK-- --HEAP--
		// 101 cm -------> adres yeri
		// 102 cm2 -------> adres yeri

		customerManager.add();
		customerManager.remove();
		customerManager.update();

		// Value Type

		// Stackde tutulur
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		// Reference Type
		int sayilar1[] = new int[] { 1, 2, 3 };
		int sayilar2[] = new int[] { 4, 5, 6 };
		
		sayilar2 = sayilar1;
		
		sayilar1[0] = 10;
		
		System.out.println(sayilar2[0]);
	}

}
