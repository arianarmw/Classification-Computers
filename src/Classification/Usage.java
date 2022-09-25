package Classification;

public class Usage extends Computers{
	private String desc;
	private String usage;
	private String example;
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getUsage() {
		return usage;
	}
	
	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	public String getExample() {
		return example;
	}
	
	public void setExample(String example) {
		this.example = example;
	}
	
	public void toPrint() {
		super.toPrint();
		System.out.println("?> Type = " + this.usage);
		System.out.println("?> Description = " + this.desc);
		System.out.println("?> Example = " + this.example);
	}
}
