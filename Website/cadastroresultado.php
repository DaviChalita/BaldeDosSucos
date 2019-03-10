<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BDS - Vem de suco! | FIDELIDADE</title>
<link rel="shortcut icon" href="Imagens/favicon.ico"/> <!-- Ícone Favicon -->
<link rel="stylesheet" type="text/css" href="./estilos.css"/> <!-- CSS do site -->
<script type="text/javascript" src="./javascripts/functionvalidalogin.js"></script> <!-- Verifica os campos de acesso -->
<script type="text/javascript" src="./javascripts/functiondoprinting.js"></script>
</head>
<body>
<?php session_start(); ?>
<!-- DECLARAÇÕES DO CABEÇALHO -->

<div id="header">

<div class="logo">
<center><a href="./index.php">BDS<img src="Imagens/logo.png" width="36px" height="50px"></a></center>
</div>

<div class="menu">
<a href="./index.php">In&iacute;cio</a> | 
<a href="./mapa.php">Veja no mapa</a> | 
<a href="./sabores.php">Sabores</a> | 
<a href="./contato.php">Contato</a> | 
<a href="./fidelidade.php">Fidelidade</a>
</div>

</div>

<!-- DECLARAÇÕES DO CONTEÚDO -->

<div id="main" style="background: url('Imagens/filler.png') repeat;">
<h3 style="margin: 16px 0 16px 0;">Cadastre-se</h3>
<?php

if(!isset ($_POST["cadastroLogin"]) == true){
?>
<center><b>Nenhuma informação foi recebida para realizar o cadastro.</b></p>
<input type="button" value="Voltar ao início do site" onclick="window.location.href='./index.php'" /><p></center>
<?php
	 }else{
	
	
	$local_server = "127.0.0.1";
	$usuario_server = "root";
	$senha_server = "";
	$banco_dados = "banco_bds";
	$login = $_POST["cadastroLogin"];
	$senha = $_POST["cadastroSenha"];
	$email = $_POST["cadastroEmail"];
	$telefone = $_POST["telefone"];
	$cep = $_POST["cep"];
	$endereco = $_POST["rua"];
	$numero = $_POST["numero"];
	$complemento = $_POST["complemento"];
	$bairro = $_POST["bairro"];
	$cidade = $_POST["cidade"];
	$estado = $_POST["estado"];
 

	
	if ($conecta = @mysql_connect($local_server, $usuario_server, $senha_server)){
		if ($db = @mysql_select_db($banco_dados, $conecta)){
			
	$consultaLogin = mysql_query("SELECT * FROM cliente WHERE strLogin='$login'");
	$linhaLogin = mysql_num_rows($consultaLogin);
 
	$consultaEmail = mysql_query("SELECT * FROM cliente WHERE strEmail='$email'");
	$linhaEmail = mysql_num_rows($consultaEmail);
 
	if($linhaLogin == 0){
		
		if($linhaEmail == 0){
			
			$sql = "Insert into cliente(strLogin, strSenha, strEmail, strTelefone, strCEP, strEndereco, strNumero, strComplemento, strBairro, strCidade, strEstado) values('".$login."','".$senha."','".$email."','".$telefone."','".$cep."','".$endereco."','".$numero."','".$complemento."','".$bairro."','".$cidade."','".$estado."')";
			if ($query = @mysql_query($sql)){
?>
				<center>
				</br>
				<img src="Imagens/cadastrosucesso.png"><p>
				<b>Você foi cadastrado com sucesso, <?php echo "$login"; ?>!</b><p>
				<input type="submit" value="Voltar ao início do site" onclick="window.location.href='./index.php'" /><p>
				</center>
<?php
			} else {
?>
				<center>
				</br>
				<img src="Imagens/cadastrofalha.png"><p>
				<b>Erro no cadastro.</b><p>
				Erro ao inserir informações no banco de dados.<p>
				<input type="submit" value="Voltar à tela de cadastro" onclick="history.go(-1);" /><p>
				</center>
<?php
			}
			mysql_close($conecta);
		}else{
?>
				<center>
				</br>
				<img src="Imagens/cadastrofalha.png"><p>
				O email <b><?php echo "$email"; ?></b> já está sendo utilizado</b>, por favor <b>tente outro</b>.<p>
				<input type="submit" value="Voltar à tela de cadastro" onclick="history.go(-1);" /><p>
				</center>
<?php
		}
			}else{
?>
				<center>
				</br>
				<img src="Imagens/cadastrofalha.png"><p>
				O usuário <b><?php echo "$login"; ?></b> já está sendo utilizado</b>, por favor <b>tente outro</b>.<p>
				<input type="submit" value="Voltar à tela de cadastro" onclick="history.go(-1);" /><p>
				</center>
<?php
	}
		
		} else{
?>
				<center>
				</br>
				<img src="Imagens/cadastrofalha.png"><p>
				<b>Erro no cadastro.</b><p>
				Não foi possível estabelecer uma conexão com o banco de dados.<p>
				<input type="submit" value="Voltar à tela de cadastro" onclick="history.go(-1);" /><p>
				</center>
<?php
		}
	}else{
?>
				<center>
				</br>
				<img src="Imagens/cadastrofalha.png"><p>
				<b>Erro no cadastro.</b><p>
				Não foi possível estabelecer uma conexão com o servidor.<p>
				<input type="submit" value="Voltar à tela de cadastro" onclick="history.go(-1);" /><p>
				</center>
<?php
	}
	

	 }
?>

<!-- DECLARAÇÕES DO RODAPÉ -->

<div class="rodape" style="color: #000;">
TCC - Balde dos Sucos ©2015
</div>

</div> <!-- DIV QUE FECHA AS DECLARAÇÕES DO CONTEÚDO -->

<!-- DECLARAÇÕES DA SIDEBAR -->

<div id="sidebar">

<div class="acesso">
<p>
<h3>Acesso</h3>
<?php 
/* esse bloco de código em php verifica se existe a sessão, pois o usuário pode simplesmente não fazer o login e digitar na barra de endereço do seu navegador o caminho para a página principal do site (sistema), burlando assim a obrigação de fazer um login, com isso se ele não estiver feito o login não será criado a session, então ao verificar que a session não existe a página redireciona o mesmo para a inicio.php. */
 if((!isset ($_SESSION['login']) == true) and (!isset ($_SESSION['senha']) == true)) {
	 unset($_SESSION['login']); 
	 unset($_SESSION['senha']);?>
<form name = "formlogin" method="post" action="./verificasessao.php">
<table width="100%" align="center">

<tr>
<td colspan="2"><input type="text" name="login" maxlength="15" size="auto" placeholder="Nome de usuário"></td></tr>

<tr>
<td colspan="2"><input type="password" name="senha" maxlength="15" size="auto" placeholder="Senha"></td></tr>

<tr><td align="center"></td></tr>

<tr>

<td>
<center><font style="font-size:14px; font-family: Trebuchet MS; font-weight: bold;">
<a href="./cadastro.php">Cadastre-se</a><br>
<a href="./recuperarsenha.php">Esqueci a senha</a>
</font></center>
</td>

<td align="right"><input type="submit" value="Entrar" onClick="return validaLogin()">
</td>

</tr>
</table>
</form>
<?php
	 }else{
	 $logado = $_SESSION['login']; 
	 
   echo "<center><br/><IMG SRC='Imagens/user.png'><p>".
		"<b>Bem-vindo(a) $logado</b></center>";
?>
<center><a href="./meuperfil.php"><b>Meu perfil</b></a></center>
<form name = "formlogout" method="post" action="./logout.php">
<table align="right">
<tr>
<td colspan="2"><input type="submit" value="Sair"></td>
</tr>
</table>
</form>
</br></br>
<?php
	 }
   ?>
</div>

<div class="endereco">
<h3>Endereço</h3>
Rua Filgueiras Lima, 84</br>
Riachuelo, Rio de Janeiro - RJ</br>
<a href="./mapa.php">Veja no mapa &raquo;</a>
</div>

<div class="novidades">
<h3>Novidades</h3>
Agora contamos com um sistema autom&aacute;tico e comprar com a gente vai ser muito mais r&aacute;pido! :D</br>
<a href="#">Confira o que mudou &raquo;</a>
</div>

</div>

</body>
</html>