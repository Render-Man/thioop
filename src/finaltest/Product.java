package finaltest;

public abstract class Product {
	private String id;
	private String name;
	private double price;
	private int total;
	
	public abstract double getTotalPrice();

	public Product(String id, String name, double price, int total) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.total = total;
	}

	public Product() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", total=" + total ;
	}
	
	
	
}
