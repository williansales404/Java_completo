package model.exeptions;

public class DomainExeption extends RuntimeException {
	//Quando uma classe e exeção usa se o sufixo Exception

	private static final long serialVersionUID = 1L;
	//exception e do tipo serializable
	
	public DomainExeption(String msg) {
		super(msg);
	}
	
}
