package ch18_exception.exam;

public class ComputerSale implements Sale {

	private int price;
	private double percent;
	private String productName;

	public ComputerSale(String productName, int price, double percent) throws PriceException {
		if (price <= 0 || percent >= 50) {
			throw new PriceException("가격 또는 할인율이 잘못되었습니다.");
		}
		this.productName = productName;
		this.price = price;
		this.percent = percent;
	}

	public String toString() {
		return productName;

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public int calculatePrice() {
		return 0;
	}

}
