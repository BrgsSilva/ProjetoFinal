package app;

import java.sql.Connection;

import dao.DAO;

public class TesteDeBanco {

	public static void main(String[] args) {
		System.out.println(DAO.status);
		
		Connection cnx = DAO.getConexao();
		
		System.out.println(DAO.status);
		
		DAO.closeConexao();
	}

}
