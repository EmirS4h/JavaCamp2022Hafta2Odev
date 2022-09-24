package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		System.out.println("**** JAVA DERSI 31 - 32 - 33");

		Product product = new Product();
		product.setName("Laptop");
		product.setPrice(5000);
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setStockAmount(3);

		Product product2 = new Product(2,"Monitör","24' IPS Monitör",1200,2);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.add(product2);
		System.out.println(product.getKod());

	}

}
