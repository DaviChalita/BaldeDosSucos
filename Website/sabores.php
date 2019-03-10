<html>
<head>
<title>BDS - Vem de suco! | SABORES</title>
<link rel="shortcut icon" href="Imagens/favicon.ico"/> <!-- Ícone Favicon -->
<link rel="stylesheet" type="text/css" href="./estilos.css"/> <!-- CSS do site -->
<link rel="stylesheet" type="text/css" href="./estilossabores.css"/> <!-- CSS do site -->
<script type="text/javascript" src="./javascripts/functionvalidalogin.js"></script> <!-- Verifica os campos de acesso -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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

<div id="mainsabores">
<h3>Sabores</h3>

<table class="sab" cellspacing="5px" width="auto" align="center">

<!-- LINHA 1 -->
<tr>

<td > <img src="Imagens/Btns/abacaxi_btn.png" onMouseOver="this.src='Imagens/Btns/abacaxi_btnon.png'" onMouseOut="this.src='Imagens/Btns/abacaxi_btn.png'"></a></td>

<td > <img src="Imagens/Btns/blueberry_btn.png" onMouseOver="this.src='Imagens/Btns/blueberry_btnon.png'" onMouseOut="this.src='Imagens/Btns/blueberry_btn.png'"></a></td>
 
<td > <img src="Imagens/Btns/caju_btn.png" onMouseOver="this.src='Imagens/Btns/caju_btnon.png'" onMouseOut="this.src='Imagens/Btns/caju_btn.png'"></a></td>
 
<td > <img src="Imagens/Btns/caqui_btn.png" onMouseOver="this.src='Imagens/Btns/caqui_btnon.png'" onMouseOut="this.src='Imagens/Btns/caqui_btn.png'"></a></td>
 
</tr>

<!-- LINHA 2 -->
<tr>

<td > <img src="Imagens/Btns/framboesa_btn.png" onMouseOver="this.src='Imagens/Btns/framboesa_btnon.png'" onMouseOut="this.src='Imagens/Btns/framboesa_btn.png'"></a></td>

<td > <img src="Imagens/Btns/guarana_btn.png" onMouseOver="this.src='Imagens/Btns/guarana_btnon.png'" onMouseOut="this.src='Imagens/Btns/guarana_btn.png'"></a></td>
 
<td > <img src="Imagens/Btns/laranja_btn.png" onMouseOver="this.src='Imagens/Btns/laranja_btnon.png'" onMouseOut="this.src='Imagens/Btns/laranja_btn.png'"></a></td>

<td > <img src="Imagens/Btns/limao_btn.png" onMouseOver="this.src='Imagens/Btns/limao_btnon.png'" onMouseOut="this.src='Imagens/Btns/limao_btn.png'"></a></td>
 
</tr>

<!-- LINHA 3 -->
<tr>

<td > <img src="Imagens/Btns/maca_btn.png" onMouseOver="this.src='Imagens/Btns/maca_btnon.png'" onMouseOut="this.src='Imagens/Btns/maca_btn.png'"></a></td>

<td > <img src="Imagens/Btns/manga_btn.png" onMouseOver="this.src='Imagens/Btns/manga_btnon.png'" onMouseOut="this.src='Imagens/Btns/manga_btn.png'"></a></td>
 
<td > <img src="Imagens/Btns/maracuja_btn.png" onMouseOver="this.src='Imagens/Btns/maracuja_btnon.png'" onMouseOut="this.src='Imagens/Btns/maracuja_btn.png'"></a></td>

<td > <img src="Imagens/Btns/melancia_btn.png" onMouseOver="this.src='Imagens/Btns/melancia_btnon.png'" onMouseOut="this.src='Imagens/Btns/melancia_btn.png'"></a></td>
</tr>

<!-- LINHA 4 -->
<tr>

<td > <img src="Imagens/Btns/melao_btn.png" onMouseOver="this.src='Imagens/Btns/melao_btnon.png'" onMouseOut="this.src='Imagens/Btns/melao_btn.png'"></a></td>

<td > <img src="Imagens/Btns/morango_btn.png" onMouseOver="this.src='Imagens/Btns/morango_btnon.png'" onMouseOut="this.src='Imagens/Btns/morango_btn.png'"></a></td>
 
<td > <img src="Imagens/Btns/tangerina_btn.png" onMouseOver="this.src='Imagens/Btns/tangerina_btnon.png'" onMouseOut="this.src='Imagens/Btns/tangerina_btn.png'"></a></td>

<td > <img src="Imagens/Btns/uva_btn.png" onMouseOver="this.src='Imagens/Btns/uva_btnon.png'" onMouseOut="this.src='Imagens/Btns/uva_btn.png'"></a></td>
 
</tr>

</table>

<center><input type="submit" value="Veja a lista completa de sabores &raquo;" onclick="window.location.href='./saboreslista.php'" /></center>

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
N&oacute;s queremos ouvir o que voc&ecirc; tem a dizer! :D</br>
<a href="./contato.php">Fale conosco &raquo;</a>
</div>

</div>

</body>
</html>