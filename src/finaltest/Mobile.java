package finaltest;

public class Mobile extends Product {
	private String manufacturer;
	private double ram;
	
	

	public Mobile(String id, String name, double price, int total, String manufacturer, double ram) {
		super(id, name, price, total);
		this.manufacturer = manufacturer;
		this.ram = ram;
	}

	public Mobile(String id, String name, double price, int total) {
		super(id, name, price, total);
	}
	
	public Mobile() {
		
	}
	


	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	@Override
	public double getTotalPrice() {
		return getPrice()*getTotal()*1.2f;
	}

	@Override
	public String toString() {
		return super.toString() + ", manufacturer=" + manufacturer +", ram=" + ram +"]" ;
	}

}
