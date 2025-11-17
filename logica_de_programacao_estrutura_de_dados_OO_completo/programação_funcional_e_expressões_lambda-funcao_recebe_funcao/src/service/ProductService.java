package service;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	//Predicate vai retorna um boleam atraves da expressão lambda que receber
	public Double filteredSum(List<Product> list, Predicate<Product> criterion) {
		double sum = 0.0;
		for(Product p: list) {
			if(criterion.test(p)) {
				sum += p.getPrice();
			}
		}
		
		return sum;
	}
}
