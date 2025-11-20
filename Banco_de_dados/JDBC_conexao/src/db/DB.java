package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//Class criada fazer conexão com banco de dados
public class DB {
	// Objeto criado do tipo Connection
	private static Connection conn = null;

	// Metodo para estabelecer conexão com banco de dados
	public static Connection getConnection() {
		if (conn == null) {
			try {
				//Recebe arquivo em formato chave=valor
				Properties props = loadProperties();
				// Pega a url do banco de dados passando a chave
				String url = props.getProperty("dburl");
				// Estabelece a conexão com o banco de dados
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}

	// Metodo ler o arquivo db.properties
	private static Properties loadProperties() {
		// FileInputStream classe de baixo nível que lê dados em bytes do arquivo.
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			// Objeto do tipo Properties para ler o arquivo
			Properties props = new Properties();
			// ler o arquivo em byte e converte para caracteres
			props.load(fs);// linhas no formato chave=valor
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}

	// Metodo usado para fechar conexão com banco de dados
	public static void closeConnection() {
		if (conn != null) {// Verifica se a conexão esta aberta
			try {
				conn.close(); // fecha a conexão
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

}
