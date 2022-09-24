package methods2;

public class Main {
	public static void main(String[] args) {
		System.out.println("**** JAVA DERSI 26: Variable Arguments ile Çalışmak ****");
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);

		int sayi = topla(5, 7);
		System.out.println(sayi);
		
		System.out.println("Toplam : " + topla2(5,4,1));
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int a, int b) {
		return a + b;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam += i;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}
