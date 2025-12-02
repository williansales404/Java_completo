package application;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;

		try {

			conn = DB.getConnection();

			// Desativa o auto-commit para que as operações só sejam finalizadas
			// quando executarmos conn.commit(); (controlamos a transação manualmente)
			conn.setAutoCommit(false);

			st = conn.createStatement();

			// Executa o comando SQL
			int rows1 = st.executeUpdate("""
					update seller set BaseSalary = 2090
					where DepartmentId = 1
					""");
//			
// Bloco de teste temporário para simular um erro e forçar rollback (opcional)
//			int x = 1;
//			if(x<2) {
//				throw new SQLException("Fake erro");
//			}

			int rows2 = st.executeUpdate("""
					update seller set BaseSalary = 3090
					where DepartmentId = 2
					""");

			// Confirma as operações dentro deste bloco — realiza commit somente
			// se não houver exceções durante a execução dos updates
			conn.commit();

			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);

		} catch (SQLException e) {
			try {
				// Se ocorrer uma exceção, desfazemos (rollback) todas as alterações
				// feitas na transação para garantir que o BD volte ao estado anterior.
				// Conferir se a conexão não é nula antes de tentar rollback.
				if (conn != null) {
					conn.rollback();
				}
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				// Erro ao tentar voltar a transação
				throw new DbException("Error trying to rollback caused by: " + e1.getMessage());
			}
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
