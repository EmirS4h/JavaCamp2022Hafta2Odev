
public class Main {

	public static void main(String[] args) {
		sayiBulma();
	}

	public static void sayiBulma() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		
		boolean sayiVar = false;
		
		for (int i : sayilar) {
			if (i == aranacak) {
				sayiVar = true;
				break;
			}
		}
		
		if(sayiVar) {
			System.out.println("Sayı Bulundu");
		}else {
			System.out.println("Sayı bulunamadı");
		}
	}

}
