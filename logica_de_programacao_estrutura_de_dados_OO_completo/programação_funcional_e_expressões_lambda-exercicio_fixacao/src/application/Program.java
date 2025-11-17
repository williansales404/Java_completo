package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
//Solução professor nelio alves
// https://github.com/acenelio/lambda7-java
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full file path: in codigo");
		String path = "C:\\workspace\\programação_funcional_e_expressões_lambda-exercicio_fixacao\\in.txt";
		System.out.println("Enter salary: in codigo");
		double salary = 2000.00;
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			//Coleção do tipo employee
			List<Employee> list = new ArrayList<Employee>();
			
			//ler primeira linha do arquivo .csv
			String line = br.readLine();
			//Se não tiver no fim da linha continua lendo
			while(line != null) {
				//separo a string por "," virgula
				String [] file = line.split(",");
				//Instancio o objeto employee dentro do add da lista
				list.add(new Employee(file[0], file[1], Double.parseDouble(file[2])));
				//aqui tento ler a proxima linha
				line = br.readLine();
			}
			
			System.out.printf("Email of people whose salary is more than %.2f:%n",salary);
			//Criei o comparador para depois passar para lambda in line na stream
			//Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			//cria stream a partir da coleção list
			List<String> emails = list.stream()
					//filtra salario
					.filter(p -> p.getSalary() > salary)
					//Retorno da lista sera somente emails
					.map(p -> p.getEmail())
					//faz comparação de string e ordena em ordem alfabetica
					//para garantir converti todo email para caixa alta
					.sorted((s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()))
					//converte a stream para lista novamente
					.collect(Collectors.toList());
			//forEach() metodo da coleção List e chamo o metodo reference System.out::println
			emails.forEach(System.out::println);
			
			System.out.print("Sum of salary of people whose name starts with 'M': ");
			double totalSalary = list.stream()
					//filtra string e faz comparação boolean, primeira letra do nome
					.filter(p -> p.getName().charAt(0) == 'M')
					//list retornara somente salário
					.map(p -> p.getSalary())
					//Soma o salario x  e total e sera soma com y
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.println(totalSalary);
			
			sc.close();
		}
		catch (IOException e) {
			e.getMessage();
		}
	}
}
