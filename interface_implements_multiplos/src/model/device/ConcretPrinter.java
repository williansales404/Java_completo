package model.device;

public class ConcretPrinter extends Device implements Printer {

	public ConcretPrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("ProcessDoc PrintConcret: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("PrintConcret: " + doc);
	}

}
