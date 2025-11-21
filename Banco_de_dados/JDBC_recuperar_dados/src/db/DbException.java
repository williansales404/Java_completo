package db;

public class DbException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	//Classe para mensagem personalizada da exception
	public DbException(String msg) {
		//retorna a mensagem do argumento para a superClass
		super(msg);
	}
	
}