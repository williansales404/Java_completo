package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//Class criada para ler o arquivo db.properties
public class DB {
	// Objeto criado do tipo Connection com valor NULL
	private static Connection conn = null;

	// Metodo para estabelecer conexão com banco de dados
	public static Connection getConnection() {

		if (conn == null) {// se a conexão for null ele tenta conectar
			try { // caso lance exceção
					// Variavel do tipo Properties recebe retorno da leitura
					// Metodo de leitura loadProperties()
				Properties props = loadProperties();
				// metodo getProperty() ler a url do arquivo
				String url = props.getProperty("dburl");

				// DriverManager.getConnection(url, props) faz a conexão da aplicação
				// com banco de dados
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		// retorna a conexão
		return conn;
	}

	// Metodo para ler o arquivo "db.properties"
	private static Properties loadProperties() {
		// FileInputStream ler byte a byte do arquivo "db.properties"
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();// Objeto criado do tipo Properties
			/*
			 * os bytes são convertidos em caracteres e depois analisados como pares
			 * chave=valor. em props.load(fs);
			 */
			props.load(fs);
			return props; // retorna um objeto do tipo properties
		} catch (IOException e) {
			// Chama a exception personalizada
			throw new DbException(e.getMessage());
		}
	}

	// Metodo usado para fechar conexão com banco de dados
	public static void closeConnection() {
		// Verifica se ainda esta conectado
		if (conn != null) {
			try { // como pode lançar exception usa o try
				conn.close(); // fecha a conexão
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

}
