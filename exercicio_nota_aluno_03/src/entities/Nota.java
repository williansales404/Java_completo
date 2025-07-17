package entities;

public class Nota {
	public String Name;
	public double a;
	public double b;
	public double c;
	
	public double sumGrade() {
		return a + b + c;
	}
	
	public String status() {
		String s;
		if(sumGrade() > 60) {
			s = "PASS";
		} else {
			s = "FAILED";
		}
		return s;
	}
	
	public double points() {
		return 60 - sumGrade();
	}
	
}
