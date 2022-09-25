package Classification;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessedData x = new ProcessedData();
		System.out.println("\t\t\t\t--- COMPUTERS ---\n");
		System.out.println("====================================================================================");
		x.setBasedOn("Processed Data");
		x.setProcData("Analog");
		x.setDesc("Analog computers can only be used to process analog data. \n\t\t This computer processes data continuously and there is no pause.");
		x.setExample("Seismometer, Voltmeter\n");
		x.toPrint();
		
		Usage y = new Usage();
		System.out.println("====================================================================================");
		y.setBasedOn("Usage");
		y.setUsage("Special Purpose Computer");
		y.setDesc("Used to complete specific jobs or applications.");
		y.setExample("Cashier Machine\n");
		y.toPrint();
		
		Abilities z = new Abilities();
		System.out.println("====================================================================================");
		z.setBasedOn("The Ability Scale");
		z.setAbility("Small Scale Computer");
		z.setDesc("A type of computer that is only capable of processing data \n\t\t in a small-scale category.");
		z.setExample("PC, Laptop, Tablet");
		z.toPrint();
	}

}
