package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;
import modelo.Contato;
import modelo.Endereco;

@WebServlet("/adicionaDados")
public class AdicionaDadosServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String email = request.getParameter("email");
		String cpf = request.getParameter("cpf");
		String telefone= request.getParameter("telefone");
		String celular = request.getParameter("celular");
		String logradouro = request.getParameter("logradouro");
		String numero= request.getParameter("numero");
		String complemento = request.getParameter("complemento");
		String cidade = request.getParameter("cidade");
		String bairro= request.getParameter("bairro");
		String cep= request.getParameter("cep");
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setSobrenome(sobrenome);
		cliente.setContato(new Contato());
		cliente.getContato().setEmail(email);
		cliente.setCpf(cpf);
		cliente.getContato().setTelefone(telefone);
		cliente.getContato().setCelular(celular);
		cliente.setEndereco(new Endereco());
		cliente.getEndereco().setLogradouro(logradouro);
		cliente.getEndereco().setNumero(Integer.parseInt(numero));
		cliente.getEndereco().setComplemento(complemento);
		cliente.getEndereco().setCidade(cidade);
		cliente.getEndereco().setBairro(bairro);
		cliente.getEndereco().setCep(cep);
		cliente.setUsuario(usuario);
		cliente.setSenha(senha);
		
		ClienteDao dao = new ClienteDao();
		try {
			dao.adicionaCliente(cliente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/cadastrado.jsp");
		rd.forward(request, response);
		
		
	}
}
