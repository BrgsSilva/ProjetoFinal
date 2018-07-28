package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Cliente;

public class ClienteDao {
	private Connection conectar = null;
	
	public ClienteDao() {
		conectar = new Conexao().getConnection();
	}
	
	@SuppressWarnings("resource")
	public void adicionaCliente(Cliente cliente) throws SQLException {
		PreparedStatement stmt = null;
		String sql = "insert into cliente values(null, ?,?,?,?,?), Statement.RETURN_GENERATE_KEYS";
		
		try {
			stmt = conectar.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getSobrenome());
			stmt.setString(3, cliente.getCpf());
			stmt.setString(4, cliente.getUsuario());
			stmt.setString(5, cliente.getSenha());
			
			int affectedRows = stmt.executeUpdate();
			
			if(affectedRows == 0) {
				throw new SQLException("A criação do cliente falhou");
			}
			
			try(ResultSet generatedKeys = stmt.getGeneratedKeys()){
				if(generatedKeys.next()) {
					cliente.setIdcliente(generatedKeys.getInt(1));
					stmt = conectar.prepareStatement("insert into contato values (null, ?, ?, ?)");
					stmt.setInt(1, cliente.getIdcliente());
					stmt.setString(2, cliente.getContato().getTelefone());
					stmt.setString(3, cliente.getContato().getCelular());
					stmt.setString(4, cliente.getContato().getEmail());
					
					stmt.executeUpdate();
				}
				
			}
			try(ResultSet generatedKeys = stmt.getGeneratedKeys()){
				if(generatedKeys.next()) {
					cliente.setIdcliente(generatedKeys.getInt(1));
					stmt = conectar.prepareStatement("insert into endereco values (null, ?,?,?,?,?,?,?)");
					stmt.setInt(1, cliente.getIdcliente());
					stmt.setString(2, cliente.getEndereco().getLogradouro());
					stmt.setInt(3, cliente.getEndereco().getNumero());
					stmt.setString(4, cliente.getEndereco().getComplemento());
					stmt.setString(5, cliente.getEndereco().getCidade());
					stmt.setString(6, cliente.getEndereco().getBairro());
					stmt.setString(7, cliente.getEndereco().getCep());
					
					stmt.executeUpdate();
			
				}
		
			}
		} finally {
			if(stmt != null)
				stmt.close();
			if(conectar != null)
				conectar.close();
		}
	}
}

