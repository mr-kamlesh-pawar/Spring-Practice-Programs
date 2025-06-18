package in.kp.code;

public class PizzaBase {
	private String type;
	private int cost;
	
	
	public PizzaBase( String type, int cost) {
		// TODO Auto-generated constructor stub
	
	this.type= type;
	this.cost= cost;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}

}
