package entities;

public class Sistema {
	private SistemaTT sistematt = new SistemaTT();
	private Integer quantity;
	
	Sistema(){
	}

	public Sistema(SistemaTT sistematt, Integer quantity) {
		this.sistematt = sistematt;
		this.quantity = quantity;
	}

	public SistemaTT getSistematt() {
		return sistematt;
	}

	public void setSistematt(SistemaTT sistematt) {
		this.sistematt = sistematt;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
}