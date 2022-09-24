package methodOverloading;

public class Main {
	public static void main(String[] args) {
		System.out.println("**** JAVA DERSI 35: Methhod Overloading ****");

		DortIslem dortIslem = new DortIslem();

		System.out.println(dortIslem.topla(5, 5));
		System.out.println(dortIslem.topla(5, 5, 5));
	}
}
