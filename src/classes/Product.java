package classes;

public class Product {
	String productName;
	String productCode;
	String productPrice;
	String productCategory;
	
	public Product(String productName, String productCode, String productPrice, String productCategory) {
		this.productName = productName;
		this.productCode = productCode;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

}
