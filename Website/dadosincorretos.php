<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BDS - Vem de suco! | DADOS INCORRETOS</title>
<link rel="shortcut icon" href="Imagens/favicon.ico"/> <!-- Ícone Favicon -->
<link rel="stylesheet" type="text/css" href="./estilos.css"/> <!-- CSS do site -->
<script type="text/javascript" src="./javascripts/functionvalidalogin.js"></script> <!-- Verifica os campos de acesso -->
<link rel="stylesheet" type="text/css" href="Galeria/galeria_script/style.css" />
	<script type="text/javascript" src="Galeria/galeria_script/jquery.js"></script>
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

<div id="main" style="padding:0;">
<img src="Imagens/vem.png" width="100%" height="auto"><p>
<div id="wowslider-container0">
	<div class="ws_images"><ul>
		<li><a href="./sabores.php"><img src="./Galeria/sabores_full.png" alt="Confira nossos sabores" title="Confira nossos sabores" id="wows0_0"/></a></li>
		<li><img src="./Galeria/laranja_full.png" alt="Foto promocional de laranja" title="Foto promocional de laranja" id="wows0_0"/></li>
		<li><img src="./Galeria/limo_full.png" alt="Foto promocional de limão" title="Foto promocional de limão" id="wows0_1"/></li>
		<li><img src="./Galeria/melancia_full.png" alt="Foto promocional de melancia" title="Foto promocional de melancia" id="wows0_2"/></li>
		<li><img src="./Galeria/uva_full.png" alt="Foto promocional de uva" title="Foto promocional de uva" id="wows0_3"/></li>
		<li><a href="./mapa.php"><img src="./Galeria/endereco_full.png" alt="Veja como chegar em nosso estabelecimento" title="Confira nossos sabores" id="wows0_0"/></a></li>
	</ul></div>
	<div class="ws_bullets"><div>
		<a href="#" title="Confira nossos sabores"><span><img src="./Galeria/sabores.png" alt="Confira nossos sabores"/>1</span></a>
		<a href="#" title="Foto promocional de laranja"><span><img src="./Galeria/laranja.png" alt="Foto promocional de laranja"/>1</span></a>
		<a href="#" title="Foto promocional de limão"><span><img src="./Galeria/limo.png" alt="Foto promocional de limão"/>2</span></a>
		<a href="#" title="Foto promocional de melancia"><span><img src="./Galeria/melancia.png" alt="Foto promocional de melancia"/>3</span></a>
		<a href="#" title="Foto promocional de uva"><span><img src="./Galeria/uva.png" alt="Foto promocional de uva"/>4</span></a>
		<a href="#" title="Veja como chegar em nosso estabelecimento"><span><img src="./Galeria/endereco.png" alt="Veja como chegar em nosso estabelecimento"/>4</span></a>
	</div></div><div class="ws_script" style="position:absolute;left:-99%"><a href="http://wowslider.com">javascript image slider</a> by WOWSlider.com v8.2</div>
	<div class="ws_shadow"></div>
	</div>	
	<script type="text/javascript" src="Galeria/galeria_script/wowslider.js"></script>
	<script type="text/javascript" src="Galeria/galeria_script/script.js"></script>

<!-- DECLARAÇÕES DO RODAPÉ -->

<div class="rodape">
TCC - Balde dos Sucos ©2015
</div>

</div> <!-- DIV QUE FECHA AS DECLARAÇÕES DO CONTEÚDO -->

<!-- DECLARAÇÕES DA SIDEBAR -->

<div id="sidebar">

<div class="acesso">
<p>
<h3>Acesso</h3>
<center><font style="color:#FF0000; font-weight: bold;">Login ou senha incorretos, por favor tente novamente.</br></font></center></br>
<?php 
/* esse bloco de código em php verifica se existe a sessão, pois o usuário pode simplesmente não fazer o login e digitar na barra de endereço do seu navegador o caminho para a página principal do site (sistema), burlando assim a obrigação de fazer um login, com isso se ele não estiver feito o login não será criado a session, então ao verificar que a session não existe a página redireciona o mesmo para a inicio.php. */
 session_start();
 if((!isset ($_SESSION['login']) == true) and (!isset ($_SESSION['senha']) == true)) {
	 unset($_SESSION['login']); 
	 unset($_SESSION['senha']);?>
<form name = "formlogin" method="post" action="./verificasessao.php">
<table width="100%" align="center">

<tr>
<td colspan="2"><input type="text" name="login" maxlength="15" size="auto" placeholder="Login"></td></tr>

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
			header("Location: ./index.php"); 
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