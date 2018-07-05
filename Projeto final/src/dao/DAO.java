package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static String status = "Desconectado...";
	
	public static Connection getConexao() {
		Connection cnx = null;
		String driverName = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driverName);
			
			String serverName = "localhost:3306";
			String dataBase = "pizzaria";
			String url = "jdbc:mysql://" + serverName + "/" + dataBase;
			String user = "root";
			String password = "";
			
			cnx = DriverManager.getConnection(url, user, password);
			
			if(cnx != null) {
				status = "Conectado com sucesso!";
			} else {
				status = "Não foi possível conectar ao banco de dados";
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnx;
	}
	
	public static boolean closeConexao() {
		try {
			DAO.getConexao().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}
}
