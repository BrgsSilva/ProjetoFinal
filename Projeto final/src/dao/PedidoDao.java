package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import modelo.Pedido;

public class PedidoDao {
	private Connection conectar;
	
	public PedidoDao() {
		conectar = new Conexao().getConnection();
	}
	
	@SuppressWarnings("resource")
	public void adicionaPedido(Pedido pedido) throws SQLException {
		PreparedStatement stmt = null;
		
		try {
			stmt = conectar.prepareStatement("insert into pedido(datapedio, produto_idproduto, cliente_idcliente2,"
					+"pagamento_idpagamento) values(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, pedido.getData());
			stmt.setInt(2, pedido.getProduto().getIdproduto());
			stmt.setInt(3, pedido.getCliente().getIdcliente());
			stmt.setInt(4, pedido.getPagamento().getIdpagamento());
			
			stmt.executeUpdate();
			
			ResultSet rsKeys = stmt.getGeneratedKeys();
			
			if(rsKeys.next()) {
				pedido.setIdpedido(rsKeys.getInt(1));
				
				stmt = conectar.prepareStatement("insert into detalhepedido(quantidade, valor, pedido_idpedido, produto_idproduto1) values(?,?,?,?)");
				
				stmt.setString(1, pedido.getDetalhe().getQuantidade());
				stmt.setDouble(2, pedido.getDetalhe().getValor());
				stmt.setInt(3, pedido.getIdpedido());
				stmt.setInt(4, pedido.getProduto().getIdproduto());
				
				stmt.executeUpdate();
				
			}
		} finally {
			if(stmt != null)
				stmt.close();
			if(conectar != null)
				conectar.close();
		}
	}
}
