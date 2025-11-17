package model.device;

public class ComboDevice extends Device implements Scanner, Printer{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printer ComboPrint: " + doc);
	}

	@Override
	public String scan() {
		return "WriterScan ComboScan";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("ProcessDoc ComboDevice " + doc);
	}
	
}
