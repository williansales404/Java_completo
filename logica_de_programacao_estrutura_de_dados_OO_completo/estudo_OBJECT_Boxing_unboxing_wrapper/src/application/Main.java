package application;

public class Main {

	public static void main(String[] args) {
		
		int x = 20;
		
		// obj contém a referência para o objeto alocado na heap
		Object obj1 = x;
		System.out.println(obj1);
		
		// aqui converte o objeto para variavel tipo valor
		// aqui realiza o casting do objeto para tipo primitivo int
		int y = (int) obj1;
		System.out.println(y);
		//////////////////////////////////////////////////////////////
		
		Integer obj2 = x;
		System.out.println(obj2);
		
		int c = obj2;
		System.out.println(c);
		
		//////////////////////////////////////////////////////////////
		/*
		Tipo Primitivo	Classe Wrapper
		byte	Byte
		short	Short
		int		Integer
		long	Long
		float	Float
		double	Double
		char	Character
		boolean	Boolean
		 * */
	}

}

