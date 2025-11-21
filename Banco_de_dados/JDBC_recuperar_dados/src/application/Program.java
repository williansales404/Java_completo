package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			// Estabalece conexão
			conn = DB.getConnection();
			// Aqui Instanciamos statement
			st = conn.createStatement();
			// Atribui a cunsulta a resultset
			// ResultSet representa a consulta em formato tabela
			rs = st.executeQuery("select * from department");
			// .next ler a proxima linha, .next == null fim da leitura
			while (rs.next()) {
				// rs.getInt() retorna coluna inteiros
				// rs.getString() retorna coluna Strings
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeConnection();
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

}
