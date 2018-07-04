<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<P>Login</P>
	<form method="post" action="LoginServlet">
		<label>Usuário</label>
		<input type="text" id="txtUsuario" name="txtUsuario" value="">
		<label>Senha</label>
		<input type="password" id="txtSenha" name="txtSenha" value="">
		<input type="submit" value="Enviar" id="btnEnviar" name="btnEnviar">
	</form>
</body>
</html>