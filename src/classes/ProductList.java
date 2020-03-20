package classes;

import java.util.ArrayList;

public class ProductList {
	

	private ArrayList<ProductList> products = new ArrayList<ProductList>();

	public ArrayList getProducts() {
		return products;
	}

	public void setProducts(ArrayList<ProductList> products) {
		this.products = products;
	}

	public void addProduct(ProductList producto) {
		products.add(producto);
	}

	public ProductList searchProduct(String productName) {
		for (int i = 0; i < products.size(); i++) {
			ProductList currentProduct = (ProductList) products.get(i);
			if (productName.equals(currentProduct.products)) {
				return currentProduct;
			}
		}
		return null;
	}
	
	public void removeProduct(String productName) {
		ProductList deleteProduct = searchProduct(productName);

		products.remove(deleteProduct);

	}


	public void addProduct(String productName, String productCode, String productPrice, String productCategory) {
		
		
	}

	

	


	

}
