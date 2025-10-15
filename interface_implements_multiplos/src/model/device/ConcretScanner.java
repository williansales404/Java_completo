package model.device;

public class ConcretScanner extends Device implements Scanner {

	public ConcretScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("ProcessDoc ScanConcret: " + doc);
	}

	@Override
	public String scan() {
		return "ScanConcret";
	}

}
