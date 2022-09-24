
public class Main {

	public static void main(String[] args) {
		sayiBulma();
	}

	public static void sayiBulma() {
		System.out.println("**** JAVA DERSI 24: Metodları Anlamak ****");
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;

		boolean sayiVar = false;

		for (int i : sayilar) {
			if (i == aranacak) {
				sayiVar = true;
				break;
			}
		}

		if (sayiVar) {
			mesajYaz("Sayı Bulundu : " + aranacak);
		} else {
			mesajYaz("Sayı bulunamadı : " + aranacak);
		}
	}

	public static void mesajYaz(String message) {
		System.out.println(message);
	}
}
