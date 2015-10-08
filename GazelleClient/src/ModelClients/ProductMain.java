package ModelClients;

import org.gazelle.enums.ProductItemType;
import org.gazelle.models.Product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product testProduct = new Product();
		testProduct.setDescription("Stimutacs");
		testProduct.setPrice(99.99);
		testProduct.setItemType(0);
		testProduct.setCost(89.99);
		testProduct.setQuantity(500);
		testProduct.setReorderPoint(0);
		testProduct.setRestockLevel(0);
		testProduct.setParentItem(12345);
		testProduct.setExtendedDescription("must have stimutacs");
		testProduct.setActive(true);
		testProduct.setMsrp(95.99);
		
		testProduct.save();
	}

}
