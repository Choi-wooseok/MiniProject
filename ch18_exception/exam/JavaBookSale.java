package ch18_exception.exam;

public class JavaBookSale implements Sale {
	
	private int price;
	private double percent;
	private String title;
	
	public JavaBookSale(String title, int price, double percent) throws PriceException {
		if (price <= 0 || percent >= 50) {
			throw new PriceException("가격 또는 할인율이 잘못되었습니다.");
		}

		this.title = title;
		this.price = price;
		this.percent = percent;
	}

	public String toString() {
		return title;
		
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
