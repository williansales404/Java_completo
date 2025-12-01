package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("""
					delete from department
					where Id = ?
					""");
			
			//integridade referencial
			//tenta excluir um chave estrangeira em uso
			st.setInt(1, 2);

			int affected_line = st.executeUpdate();
			
			System.out.println("Affected line: "+affected_line);

		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
