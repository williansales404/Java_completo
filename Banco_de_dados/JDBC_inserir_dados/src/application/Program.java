package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import db.DB;

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
			st = conn.prepareStatement(
				"insert into seller" 
				+ "(Id, Name, Email, BirthDate, BaseSalary, DepartmentId)"
				+ "values" + "(?,?,?,?,?,?)");
			
			st.setInt(1, 5);
			st.setString(2, "Carl Purple");
			st.setString(3, "carl@gmail.com");
			// st.setDate(3, new java.sql.Date(fmt.parse("01/01/2020").getTime()));
			// Parse usando java.time (API moderna)
			LocalDate birthDate = LocalDate.parse("01/01/1998", fmt);
			// Opção 1 (compatível amplamente): converter para java.sql.Date
			st.setDate(4, java.sql.Date.valueOf(birthDate));
			// Opção 2 (se o driver JDBC suporta JDBC 4.2+):
			// st.setObject(3, birthDate);
			st.setDouble(5, 3000.0);
			st.setInt(6, 4);
			
			int affected_lines = st.executeUpdate(); // altera os dados
			
			System.out.println("linhas afetadas: " + affected_lines);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
