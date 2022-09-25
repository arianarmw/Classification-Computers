package Classification;

public class ProcessedData extends Computers {
	private String desc;
	private String procdata;
	private String example;
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getProcData() {
		return procdata;
	}
	
	public void setProcData(String procdata) {
		this.procdata = procdata;
	}
	
	public String getExample() {
		return example;
	}
	
	public void setExample(String example) {
		this.example = example;
	}
	
	public void toPrint() {
		super.toPrint();
		System.out.println("?> Type = " + this.procdata);
		System.out.println("?> Description = " + this.desc);
		System.out.println("?> Example = " + this.example);
	}
}
