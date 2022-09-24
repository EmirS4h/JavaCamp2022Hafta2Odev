package recapDemo_classes;

public class DortIslem {
	public int topla(int num1, int num2) {
		return num1 + num2;
	}

	public int cikar(int num1, int num2) {
		return num1 - num2;
	}

	public int carp(int num1, int num2) {
		return num1 * num2;
	}

	public int bol(int num1, int num2) {
		if (num1 == 0 || num2 == 0) {
			System.out.println("0 ile bölünemez");
			return 0;
		}
		return num1 / num2;
	}
}
