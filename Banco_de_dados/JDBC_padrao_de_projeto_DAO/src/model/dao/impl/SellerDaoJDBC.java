package model.dao.impl;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

//Implementação da interface SellerDao
public class SellerDaoJDBC implements SellerDao {

	// Atributo de conexao com o banco de dados
	// Conexao fechar somente quando a aplicacao for finalizada
	// No projeto principal
	private Connection conn;

	// Construtor recebendo a conexao
	public SellerDaoJDBC(Connection conn) {
		// Inicializando o atributo conn
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

	// Retorna um vendedor pelo Id
	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			// Comando SQL
			st = conn.prepareStatement("""
					select seller.*, department.Name as DepName
					from seller
						inner join department
							on seller.DepartmentId = department.Id
					where seller.Id = ?
					""");
			// Setando o parametro
			st.setInt(1, id);
			// Executando o comando
			rs = st.executeQuery();
			// Verificando se retornou algum registro
			if (rs.next()) {
				// Instanciando o Departamento
				Department dp = instanceDepartment(rs);
				// Instanciando o Vendedor
				Seller obj = instanceSeller(rs, dp);
				return obj;
			}
			// Retornando null caso nao encontre o vendedor
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
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			// Comando SQL
			st = conn.prepareStatement("""
					SELECT seller.*,department.Name as DepName
					FROM seller INNER JOIN department
					ON seller.DepartmentId = department.Id
					ORDER BY Name
										""");
			// Executando o comando SQL
			rs = st.executeQuery();
			// Criando a lista de vendedores
			List<Seller> list = new ArrayList<>();
			// Mapa para evitar a criacao de multiplos departamentos
			// Cada departamento sera instanciado uma unica vez
			Map<Integer, Department> map = new HashMap<>();
			
			// Percorrendo o ResultSet e instanciando os vendedores
			// Adicionando na lista de vendedores
			while (rs.next()) {
				// Verificando se o departamento ja foi instanciado
				// Se ja foi instanciado, recupera do mapa
				Department dep = map.get(rs.getInt("DepartmentId"));
				// Se nao foi instanciado, instancia e adiciona no mapa
				if(dep == null) {
					// Instanciando o Departamento	
					dep = instanceDepartment(rs);
					// Adicionando no mapa 
					// Chave: Id do departamento
					// Valor: Departamento instanciado
					map.put(rs.getInt("DepartmentId"), dep);
				}
				// Instanciando o Vendedor
				Seller obj = instanceSeller(rs, dep);
				list.add(obj);
			}
			// Retornando null caso nao encontre o vendedor
			return list;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	// Retorna uma lista de vendedores por departamento
	@Override
	public List<Seller> findByDepartment(Department department) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			// Comando SQL
			st = conn.prepareStatement("""
					SELECT seller.*,department.Name as DepName
					FROM seller INNER JOIN department
					ON seller.DepartmentId = department.Id
					WHERE DepartmentId = ?
					ORDER BY Name
										""");
			// Setando o parametro
			st.setInt(1, department.getId());
			// Executando o comando SQL
			rs = st.executeQuery();
			// Criando a lista de vendedores
			List<Seller> list = new ArrayList<>();
			// Mapa para evitar a criacao de multiplos departamentos
			// Cada departamento sera instanciado uma unica vez
			Map<Integer, Department> map = new HashMap<>();
			
			// Percorrendo o ResultSet e instanciando os vendedores
			// Adicionando na lista de vendedores
			while (rs.next()) {
				// Verificando se o departamento ja foi instanciado
				// Se ja foi instanciado, recupera do mapa
				Department dep = map.get(rs.getInt("DepartmentId"));
				// Se nao foi instanciado, instancia e adiciona no mapa
				if(dep == null) {
					// Instanciando o Departamento	
					dep = instanceDepartment(rs);
					// Adicionando no mapa 
					// Chave: Id do departamento
					// Valor: Departamento instanciado
					map.put(rs.getInt("DepartmentId"), dep);
				}
				// Instanciando o Vendedor
				Seller obj = instanceSeller(rs, dep);
				list.add(obj);
			}
			// Retornando null caso nao encontre o vendedor
			return list;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	// Método para instanciar um vendedor
	// Recebe o ResultSet e o Departamento como parametros
	private Seller instanceSeller(ResultSet rs, Department dp) throws SQLException {
		Seller obj = new Seller();
		obj.setId(rs.getInt("Id"));
		obj.setName(rs.getString("Name"));
		obj.setEmail(rs.getString("Email"));
		obj.setBirthDate(rs.getObject("BirthDate", LocalDate.class));
		obj.setBaseSalary(rs.getDouble("BaseSalary"));
		obj.setDepartment(dp);
		return obj;
	}

	// Método para instanciar um departamento
	// Recebe o ResultSet como parametro
	private Department instanceDepartment(ResultSet rs) throws SQLException {
		Department dp = new Department();
		dp.setId(rs.getInt("DepartmentId"));
		dp.setName(rs.getString("DepName"));
		return dp;
	}

}
