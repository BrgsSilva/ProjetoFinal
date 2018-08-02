<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>NitPizza &mdash; Formulario de Produtos</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	
	<link rel="stylesheet" href="css/animate.css">

	<link rel="stylesheet" href="css/icomoon.css">

	<link rel="stylesheet" href="css/bootstrap.css">


	<link rel="stylesheet" href="css/magnific-popup.css">


	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">


	<link rel="stylesheet" href="css/style.css">

	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">
	<script src="js/modernizr-2.6.2.min.js"></script>
</head>
<body>
	<div class="gtco-loader"></div>
	
	<div id="page">
	<nav class="gtco-nav" role="navigation">
		<div class="gtco-container">
			<div class="row">
				<div class="col-xs-2">
					<div id="gtco-logo"><a href="index.jsp">
					<img src="images/logo.png" width="100" height="100">
					
					</a></div>
				</div>
				<div class="col-xs-8 text-center menu-1">
					<ul>
						<li class="active"><a href="index.jsp">Home</a></li>
						<li class="active"><a href="cardapio.jsp">Cardápio</a></li>
						<li class="active"><a href="cadastro.jsp">Cadastro</a></li>
						<li class="active"><a href="carrinho.jsp"><img src="images/cart.png" width="20" height="20"></a></li>
					</ul>
				</div>
				<div class="col-xs-2 text-right hidden-xs menu-2">
					<ul>
						<li class="btn-cta"><a href="login.jsp"><span>Login</span></a></li>
					</ul>
				</div>
			</div>
			
		</div>
	</nav>

	<header id="gtco-header" class="gtco-cover gtco-cover-sm" role="banner" style="background-image:url(images/pizza.png);">

		<div class="gtco-container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center">
					<div class="display-t">
						<div class="display-tc animate-box" data-animate-effect="fadeIn">
							<h1>Formulario<br>de<br>Cadastro</h1>
							<h2></h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	
	<div class="gtco-section">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 animate-box">
					<h3>Digite seus Dados</h3>
					<form method="post" action="adicionaDados">
						<fieldset class="col-md-12">
							<legend>Dados Pessoais</legend>
							<div class="col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="nome">Nome</label>
										<input type="text" name="nome" id="nome" class="form-control" placeholder="Digite o nome">
									</div>
								</div>
							</div>
							<div class="col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="sobrenome">Sobrenome</label>
										<input type="text" name="sobrenome" id="sobrenome" class="form-control" placeholder="Digite o sobrenome">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="email">Email</label>
										<input type="email" name="email" id="email" class="form-control" placeholder="Digite o seu email">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="nome">CPF</label>
										<input type="text" name="cpf" id="cpf" class="form-control" placeholder="Digite o seu CPF">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="nome">Telefone</label>
										<input type="text" name="telefone" id="telefone" class="form-control" placeholder="(00) 0000-0000">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="nome">Celular</label>
										<input type="text" name="celular" id="celular" class="form-control" placeholder="(00) 00000-0000">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="usuario">Usuario</label>
										<input type="text" name="usuario" id="usuario" class="form-control" placeholder="Nome de Usuário">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="senha">Senha</label>
										<input type="password" name="senha" id="senha" class="form-control" placeholder="Senha">
									</div>
								</div>
							</div>
						</fieldset>
						<fieldset class="col-md-12">
							<legend>Endereço</legend>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="nome">Logradouro</label>
										<input type="text" name="logradouro" id="logradouro" class="form-control" placeholder="Digite o seu logradouro">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="nome">Número</label>
										<input type="text" name="numero" id="numero" class="form-control" placeholder="Digite o seu número">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="nome">Complemento</label>
										<input type="text" name="complemento" id="complemento" class="form-control" placeholder="Digite o seu complemento">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="nome">Cidade</label>
										<input type="text" name="cidade" id="cidade" class="form-control" placeholder="Digite a sua cidade">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="nome">Bairro</label>
										<input type="text" name="bairro" id="bairro" class="form-control" placeholder="Digite o bairro">
									</div>
								</div>
							</div>
							<div class= "col-md-6">
								<div class="row form-group">
									<div class="name col-md-12">
										<label for="nome">CEP</label>
										<input type="text" name="cep" id="cep" class="form-control" placeholder="Digite o CEP">
									</div>
									<input type="submit" value="cadastrar"/>
								</div>
							</div>
							<input type= "submit" value="Concluir cadastro" class="btn btn-primary" />
						</fieldset>
					</form>		
				</div>
	        </div>
        </div>
	</div>	
			
			
	<footer id="gtco-footer" role="contentinfo">
	<div id="gtco-started">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-8 gtco-widget">
					<h3>Sobre Nós</h3>
					<p>A NitPizza se destaca pela qualidade dos seus produtos e a sua eficiência no atendimento.</p>
					<p><a href="sobre_nos.html">Saiba mais</a></p>
				</div>
				<div class="col-md-2 col-md-push-1">
					<ul class="gtco-footer-links">
						<li><a href="index.jsp">Home</a></li>
						<li><a href="sobre_nos.jsp">Sobre Nós</a></li>
						<li><a href="produtos.jsp">Produtos</a></li>
						<li><a href="cursos.jsp">Cursos</a></li>
						<li><a href="contato.jsp">Contato</a></li>
					</ul>
				</div>
			</div>

			<div class="row copyright">
				<div class="col-md-12">
					<p class="pull-left">
						<small class="block">&copy; 2018 NitPizza. Todos os direitos reservados.</small> 
					</p>
					<p class="pull-right">
						<ul class="gtco-social-icons pull-right">
							<li><a href="#"><i class="icon-twitter"></i></a></li>
							<li><a href="#"><i class="icon-facebook"></i></a></li>
							<li><a href="#"><i class="icon-linkedin"></i></a></li>
							<li><a href="#"><i class="icon-dribbble"></i></a></li>
						</ul>
					</p>
				</div>
			</div>
		</div>
	</div>	
	</footer>
	

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	
	<script src="js/jquery.min.js"></script>

	<script src="js/jquery.easing.1.3.js"></script>

	<script src="js/bootstrap.min.js"></script>

	<script src="js/jquery.waypoints.min.js"></script>

	<script src="js/owl.carousel.min.js"></script>

	<script src="js/jquery.countTo.js"></script>

	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>

	<script src="js/main.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>
	<script src="js/cep.js"></script>

</body>
</html>