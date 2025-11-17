package util;

public class conversion {
	
	public static final double IOF = 1.06;
	
	public static double conversionDolar(double priceDolar, double quantity) {
		return priceDolar * quantity * IOF;
	}
	
}
