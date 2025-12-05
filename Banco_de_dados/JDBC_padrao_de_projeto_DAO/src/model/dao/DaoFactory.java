package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

//Classe fabrica de Dao
public class DaoFactory {
	
	//Classe retorna um SellerDao mas ela Instancia a classe SellerDaoJDBC
	//Ocultando a implementação da classe
	public static SellerDao createSellerDao() {
		//Retornando a conexao para o SellerDaoJDBC
		return new SellerDaoJDBC(DB.getConnection());
	}
	
}
