package model.dao;

import model.dao.impl.SellerDaoJDBC;

//Classe fabrica de Dao
public class DaoFactory {
	
	//Classe retorna um SellerDao mas ela Instancia a classe SellerDaoJDBC
	//Ocultando a implementação da classe
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
}
