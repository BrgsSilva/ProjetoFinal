package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import modelo.Cliente;

public class ClienteDao {
	private Connection conectar = null;
	
	public ClienteDao() {
		conectar = new Conexao().getConnection();
	}
	
	@SuppressWarnings("resource")
	public void adicionaCliente(Cliente cliente) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			stmt = conectar.prepareStatement("insert into cliente(nome, sobrenome, cpf, usuario, senha) values(?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getSobrenome());
			stmt.setString(3, cliente.getCpf());
			stmt.setString(4, cliente.getUsuario());
			stmt.setString(5, cliente.getSenha());
			
			stmt.executeUpdate();
			
			try(ResultSet rsKeys = stmt.getGeneratedKeys()){
			
			if(rsKeys.next()) {
				cliente.setIdcliente(rsKeys.getInt(1));
				
				stmt = conectar.prepareStatement("insert into contato(telefone, celular, email, cliente_idcliente) values(?,?,?,?)");
				stmt.setString(1, cliente.getContato().getTelefone());
				stmt.setString(2, cliente.getContato().getCelular());
				stmt.setString(3, cliente.getContato().getEmail());
				stmt.setInt(4, cliente.getIdcliente());
				
				stmt.executeUpdate();
				
										
				stmt = conectar.prepareStatement("insert into endereco(logradouro, numero, complemento, cidade, bairro, cep, cliente_idcliente1) values(?,?,?,?,?,?,?)");
				stmt.setString(1, cliente.getEndereco().getLogradouro());
				stmt.setInt(2, cliente.getEndereco().getNumero());
				stmt.setString(3, cliente.getEndereco().getComplemento());
				stmt.setString(4, cliente.getEndereco().getCidade());
				stmt.setString(5, cliente.getEndereco().getBairro());
				stmt.setString(6, cliente.getEndereco().getCep());
				stmt.setInt(7, cliente.getIdcliente());
				
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

