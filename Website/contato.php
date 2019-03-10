<html>
<head>
<script type='text/javascript' src='http://files.rafaelwendel.com/jquery.js'></script>
<script type='text/javascript' src='CEP/cep.js'></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BDS - Vem de suco! | CONTATO</title>
<link rel="shortcut icon" href="Imagens/favicon.ico"/> <!-- Ícone Favicon -->
<link rel="stylesheet" type="text/css" href="./estilos.css"/> <!-- CSS do site -->
<script type="text/javascript" src="./javascripts/functionvalidalogin.js"></script> <!-- Verifica os campos de acesso -->
<script type="text/javascript" src="./javascripts/functionvalidacadastro.js"></script> <!-- Verifica o campo de email -->
<script type="text/javascript" src="./javascripts/jquery-2.1.4.js"></script> <!-- Importa o jQuery -->
<script type="text/javascript" src="./javascripts/jquerycaracteresrestantes.js"></script> <!-- Importa a função de caracteres restantes -->
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
<h3>Fale conosco</h3>
<form name="formCadastro" method="post" action="./contatoresultado.php">
<table align="center">

<tr>
<td align="right"><b>Nome: *</b></td>
<td><input name="txtNomeContato" type="text" size="40" maxlength="50" placeholder="Say my name"/></td>
</tr>
<?php 

 if((!isset ($_SESSION['login']) == true) and (!isset ($_SESSION['senha']) == true)) {
	 unset($_SESSION['login']); 
	 unset($_SESSION['senha']);
?>
<tr>
<td align="right"><b>Email: *</b></td>
<td><input name="txtEmailContato" type="text" size="40" maxlength="50" placeholder="exemplo@baldedesucos.com"/></td>
</tr>
 <?php } else {

 $logado = $_SESSION['login']; 

		$local_server="127.0.0.1";
		$usuario_server = "root";
		$senha_server = "";
		$banco_dados = "banco_bds";
		if ($conecta = @mysql_connect($local_server,$usuario_server,$senha_server)){
			if ($db = @mysql_select_db($banco_dados, $conecta)){
			
				$dados = mysql_query("SELECT * FROM cliente where strLogin = '".$logado."'");
			
				$linha = mysql_fetch_assoc($dados); // transforma os dados em um array 
 
				$total = mysql_num_rows($dados); // calcula quantos dados retornaram 
			}
		}
 
 ?>
<tr>
<td align="right"><b>Email: *</b></td>
<td><input name="txtEmailContato" type="text" size="40" maxlength="50" value="<?=$linha['strEmail']?>"/></td>
</tr>
 <?php } ?>

<tr>
<td align="right"><b>Mensagem: *</b></td>
<td><font style="font-size:14px; font-family: Trebuchet MS;">Caracteres restantes: <span id="content-countdown" title="500">500</span></font></br>
<textarea  name="content" id="content" class="maxlength" cols="50" rows="7" maxlength="500" placeholder="Nós queremos ouvir o que você tem a dizer!"></textarea></br>
</td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Enviar" onClick="return validaTela()"></td>
</tr>

</table>
</form>

<center>
<b>*</b> Campos obrigatórios</br>
<!--Função de caracteres restantes por <a href="http://www.abstraindo.com/web-developer/" target="_blank">abstraindo.com/web-developer</a>--><p>
</center>

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
<h3>Contato</h3>
N&oacute;s queremos ouvir o que voc&ecirc; tem a dizer! :D
</div>

</div>

</body>
</html>