package application;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;

//Diferença entre PrepareStatement vs Statement
//https://pt.stackoverflow.com/questions/99620/qual-a-diferen%C3%A7a-entre-o-statement-e-o-preparedstatemen
public class Program {
	public static void main(String[] args) {
		// SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();
			/*
			// Instancia objeto st
			// Comando SQL
			st = conn.prepareStatement("""
					insert into seller
					(Name, Email, BirthDate, BaseSalary, DepartmentId)
					values (?,?,?,?,?)
					""", st.RETURN_GENERATED_KEYS);
			// ? espaço para ser preenchido depois com o metodo .set
			st.setString(1, "Sam Black");
			st.setString(2, "Sam@gmail.com");

			// st.setDate(3, new java.sql.Date(fmt.parse("01/01/2020").getTime()));
			// Parse usando java.time (API moderna)
			LocalDate birthDate = LocalDate.parse("12/12/1999", fmt);
			// Opção 1 (compatível amplamente): converter para java.sql.Date
			st.setDate(3, java.sql.Date.valueOf(birthDate));
			// Opção 2 (se o driver JDBC suporta JDBC 4.2+):
			// st.setObject(3, birthDate);

			st.setDouble(4, 3000.0);
			st.setInt(5, 4);
			*/
//			
			st = conn.prepareStatement(
					"insert into department (Name)"
					+ " values ('D1'), ('D2')",
					Statement.RETURN_GENERATED_KEYS);

			int affected_lines = st.executeUpdate(); // altera os dados

			if (affected_lines > 0) {
				// recuperar chaves geradas automaticamente pelo banco de dados
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("ID " + id);
				}
			} else {
				System.out.println("no lines affected");
			}

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
