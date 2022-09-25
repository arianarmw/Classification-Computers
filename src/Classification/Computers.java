package Classification;

public class Computers {
	private String basedon;
	
	public String getBasedOn() {
		return basedon;
	}
	
	public void setBasedOn(String basedon) {
		this.basedon = basedon;
	}
	
	public void toPrint() {
		System.out.println("?> Classified based on = " + this.basedon);
	}
}
