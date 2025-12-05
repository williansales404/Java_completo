package model.dao.impl;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

//Implementação da interface SellerDao
public class SellerDaoJDBC implements SellerDao {

	//Atributo de conexao com o banco de dados
	private Connection conn;

	//Construtor recebendo a conexao
	public SellerDaoJDBC(Connection conn) {
		//Inicializando o atributo conn
		this.conn = conn;
	}

	@Override
	public void insert(Seller sl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Seller sl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	//Retorna um vendedor pelo Id
	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			//Comando SQL
			st = conn.prepareStatement("""
					select seller.*, department.Name as DepName
					from seller
						inner join department
							on seller.DepartmentId = department.Id
					where seller.Id = ?
					""");
			//Setando o parametro
			st.setInt(1, id);

			//Executando o comando
			rs = st.executeQuery();
			//Verificando se retornou algum registro
			if (rs.next()) {
				//Instanciando o Departamento
				Department dp = new Department();
				dp.setId(rs.getInt("DepartmentId"));
				dp.setName(rs.getString("DepName"));

				//Instanciando o Vendedor
				Seller obj = new Seller();
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				obj.setEmail(rs.getString("Email"));
				//
				obj.setBirthDate(rs.getObject("BirthDate", LocalDate.class));
				obj.setBaseSalary(rs.getDouble("BaseSalary"));
				obj.setDepartment(dp);
				return obj;

			}
			//Retornando null caso nao encontre o vendedor
			return null;

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
