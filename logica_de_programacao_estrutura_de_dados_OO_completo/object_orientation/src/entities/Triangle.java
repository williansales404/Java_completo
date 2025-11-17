package entities;

public class Triangle {
	//atributos da classe
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a+ b + c) / 2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
