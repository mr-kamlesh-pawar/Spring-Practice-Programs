package in.sp.beans;

public class Address {
	private String city;
	private int pincode;
	private int houseno;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+ houseno +" -> "+ city+ "->" + pincode;
		
	}

}
