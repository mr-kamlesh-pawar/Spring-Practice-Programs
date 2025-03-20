package in.sp.beans;

public class Address {
	private String city;
	private int pincode;
	private int houseno;
	
	public Address(String city, int pincode, int houseno) {
		this.city=city;
		this.pincode= pincode;
		this.houseno= houseno;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+ houseno +" -> "+ city+ "->" + pincode;
		
	}

}
