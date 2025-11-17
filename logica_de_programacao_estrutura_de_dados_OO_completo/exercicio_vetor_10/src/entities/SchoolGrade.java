package entities;

public class SchoolGrade {
	
	private String name;
	private double grade1;
	private double grade2;
	private double average;
	
	public SchoolGrade(String name, double grade1, double grade2, double average) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.average = average;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	
	public double getAverage() {
		return average;
	}

	public void setAvarage(double average) {
		this.average = average;
	}
	
	
	
	
	
}
