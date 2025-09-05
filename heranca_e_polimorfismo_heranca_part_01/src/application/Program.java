package application;

import entities.BusinessAccount;

public class Program {
	public static void main(String[] args) {
		//Aqui vemos que o objeto B herdo todos os metodos da classe base ou Super class
		BusinessAccount B = new BusinessAccount(1223, "will", 1000.0, 10000.0);
		
		System.out.println(B.getNumber()+"/ "+B.getHolder()+"/ "+B.getBalance());
		System.out.println();
		B.loan(5000.0);
		System.out.println(B.getNumber()+"/ "+B.getHolder()+"/ "+B.getBalance());
		System.out.println();
		System.out.println("Limite emprestimo atual "+B.getLoanLimit());
		
		
	}
}
