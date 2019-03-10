<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BDS - Vem de suco! | CADASTRE-SE</title>
<link rel="shortcut icon" href="Imagens/favicon.ico"/> <!-- Ícone Favicon -->
<link rel="stylesheet" type="text/css" href="./estilos.css"/> <!-- CSS do site -->
<script type="text/javascript" src="./javascripts/functionvalidalogin.js"></script> <!-- Verifica os campos de acesso -->
<script type="text/javascript" src="./javascripts/functionvalidacadastro.js"></script> <!-- Verifica os campos de cadastro -->
<script type='text/javascript' src='./javascripts/jquery-2.1.4.js'></script> <!-- Importa o jQuery -->
<script type='text/javascript' src='./javascripts/cep.js'></script> <!-- Importa a função de preenchimento automático -->
<script type="text/javascript" src="./javascripts/jquery.mask.js"></script>  <!-- Importa o plugin jQuery Mask -->
<script type="text/javascript" src="./javascripts/mascaras.js"></script> <!-- Importa o arquivo que diz quais são as máscaras -->

</head>
<body>

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
<h3>Cadastre-se</h3>
<?php 
/* esse bloco de código em php verifica se existe a sessão, pois o usuário pode simplesmente não fazer o login e digitar na barra de endereço do seu navegador o caminho para a página principal do site (sistema), burlando assim a obrigação de fazer um login, com isso se ele não estiver feito o login não será criado a session, então ao verificar que a session não existe a página redireciona o mesmo para a inicio.php. */
 session_start();
 if((!isset ($_SESSION['login']) == true) and (!isset ($_SESSION['senha']) == true)) {
	 unset($_SESSION['login']); 
	 unset($_SESSION['senha']);
?>
<form name="formCadastro" method="post" action="./cadastroresultado.php">
<table align="center" cellspacing="0" cellpadding="5">

<tr style="background: #FDEFE1;">
<td align="right"><b>Nome de usuário: *</b></td>
<td><input name="cadastroLogin" type="text" size="20" maxlength="15" placeholder="5-15 caracteres"/></td>
</tr>

<tr style="background: #FEF9F3;">
<td align="right"><b>Senha: *</b></td>
<td><input name="cadastroSenha" type="password" size="20" maxlength="15" placeholder="5-15 caracteres"/></td>
</tr>

<tr style="background: #FDEFE1;">
<td align="right"><b>Confirme sua senha: *</b></td>
<td><input name="cadastroConfirmaSenha" type="password" size="20" maxlength="15" placeholder="5-15 caracteres"/></td>
</tr>

<tr style="background: #FEF9F3;">
<td align="right"><b>Email: *</b></td>
<td><input name="cadastroEmail" type="text" size="40" maxlength="50" placeholder="exemplo@baldedesucos.com"/></td>
</tr>

<tr style="background: #FDEFE1;">
<td align="right"><b>Telefone (Com DDD):</b></td>
<td><input name="telefone" id="telefone" type="text" maxlength="11" placeholder="21999999999"/></td>
</tr>

<tr style="background: #FEF9F3;">
<td align="right"><b>CEP (Somente números):</b></td>
<td><input type="text" name="cep" id="cep" maxlength="8" placeholder="00000000"/></td>
</tr>

<tr style="background: #FDEFE1;">
<td align="right"><b>Rua:</b></td>
<td><input type="text" name="rua" id="rua" size="45" placeholder="Rua"/></td>
</tr>

<tr style="background: #FEF9F3;">
<td align="right"><b>Número:</b></td>
<td><input type="text" name="numero" id="numero" size="5" placeholder="00"/></td>
</tr>

<tr style="background: #FDEFE1;">
<td align="right"><b>Complemento:</b></td>
<td><input type="text" name="complemento" id="complemento" size="45" placeholder="Quadra 0; Casa 0; Bloco 0; Apartamento 0"/></td>
</tr>

<tr style="background: #FEF9F3;">
<td align="right"><b>Bairro:</b></td>
<td><input type="text" name="bairro" id="bairro" size="25" placeholder="Bairro"/></td>
</tr>

<tr style="background: #FDEFE1;">
<td align="right"><b>Cidade:</b></td>
<td><input type="text" name="cidade" id="cidade" size="25" placeholder="Cidade"/></td>
</tr>

<tr style="background: #FEF9F3;">
<td align="right"><b>Estado:</b></td>
<td><input type="text" name="estado" id="estado" size="2" placeholder="UF"/></td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Cadastrar" onClick="return validaCadastro()"></td>
</tr>

</table>
</form>

<center>
<b>*</b> Campos obrigatórios</br>
<!--Função de preenchimento automático por CEP por <a href="http://www.rafaelwendel.com" target="_blank">rafaelwendel.com</a>--><p>
</center>

<?php
 }else{
	 $logado = $_SESSION['login']; 
?>
				<center>
				Olá <b><?php echo "$logado"; ?></b>,</p>
				para cadastrar um novo usuário, você deve primeiro sair de sua conta.</p>
				<input type="submit" value="Voltar ao início do site" onclick="window.location.href='./index.php'" /><p>
				</center>
<?php
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
N&oacute;s queremos ouvir o que voc&ecirc; tem a dizer! :D</br>
<a href="./contato.php">Fale conosco &raquo;</a>
</div>

</div>

</body>
</html>