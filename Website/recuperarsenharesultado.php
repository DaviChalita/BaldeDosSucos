<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BDS - Vem de suco! | RECUPERAR SENHA</title>
<link rel="shortcut icon" href="Imagens/favicon.ico"/> <!-- Ícone Favicon -->
<link rel="stylesheet" type="text/css" href="./estilos.css"/> <!-- CSS do site -->
<script type="text/javascript" src="./javascripts/functionvalidalogin.js"></script> <!-- Verifica os campos de acesso -->
<script type="text/javascript" src="./javascripts/functionvalidaemail.js"></script> <!-- Verifica o campo de email -->
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
<h3 style="margin: 16px 0 16px 0;">Recupere sua senha</h3>
<?php

if(!isset ($_POST["emailRecuperar"]) == true){
?>
<center><b>Nenhuma informação foi recebida para recuperar sua senha.</b><p>
<input type="button" value="Voltar ao início do site" onclick="window.location.href='./index.php'" /><p>
</center>
<?php
	 }else{
		$email = $_POST["emailRecuperar"];
		
		$local_server="127.0.0.1";
		$usuario_server = "root";
		$senha_server = "";
		$banco_dados = "banco_bds";
		
		if ($conecta = @mysql_connect($local_server,$usuario_server,$senha_server)){
			if ($db = @mysql_select_db($banco_dados, $conecta)){
			
				$sql = "select strSenha, strLogin from cliente where strEmail = '".$email."'";
				$query = mysql_query($sql);
				while($sql = mysql_fetch_array($query)){
					$senha = $sql["strSenha"];
					$login = $sql["strLogin"];
					require("class.smtp.php");
					require("class.phpmailer.php");
					$mensagem="<html><body><img src='http://i.imgur.com/KaLSXLt.png'/><p>Ol&aacute; ".$login.", <b>sua senha &eacute; ".$senha."</b>.<p>&nbsp;<p>Atenciosamente,<br><br>Equipe Balde dos Sucos. </br></body></html>";
					$mail = new PHPMailer();
					$mail->IsSMTP();
					$mail->Port = 465;
					$mail->Host = 'smtp.gmail.com';
					$mail->IsHTML(true);
					$mail->Mailer = 'smtp';
					$mail->SMTPSecure = 'ssl';
					$mail->SMTPAuth = true;
					$mail->Username = "web2iserj";
					$mail->Password = "iserj2015";
					$mail->SingleTo = true;
					$from = "web2iserj@gmail.com";
					$fromname = "Balde dos Sucos";
					$mail->addAddress($email);
					$mail->Subject = 'Balde dos Sucos | Recupere sua senha';
					$mail->Body = $mensagem;
					$result = $mail->Send();
					
					if($result){
?>
				<center>
				</br>
				<img src="Imagens/cadastrosucesso.png"><p>
				<b>Email para <?php echo "$email"; ?> enviado com sucesso.</b><p>
				<input type="submit" value="Voltar ao início do site" onclick="window.location.href='./index.php'" /><p>
				</center>
<?php
					} else{
?>
				<center>
				</br>
				<img src="Imagens/cadastrofalha.png"><p>
				<b>Falha ao enviar email para <?php echo "$email"; ?>.</b><p>
				<?php echo mysql_error(); ?><p>
				<input type="submit" value="Voltar à tela de recuperação de senha" onclick="history.go(-1);" /><p>
				</center>
<?php
					}
					echo "<script>javascript:windows.close()</script>";
					}
				}else {
?>
				<center>
				</br>
				<img src="Imagens/cadastrofalha.png"><p>
				<b>Falha ao enviar email para <?php echo "$email"; ?>.</b><p>
				Não foi possível estabelecer uma conexão com o banco de dados.<p>
				<input type="submit" value="Voltar à tela de recuperação de senha" onclick="history.go(-1);" /><p>
				</center>
<?php
				}
			} else {
?>
				<center>
				</br>
				<img src="Imagens/cadastrofalha.png"><p>
				<b>Falha ao enviar email para <?php echo "$email"; ?>.</b><p>
				Não foi possível estabelecer uma conexão com o servidor.<p>
				<input type="submit" value="Voltar à tela de recuperação de senha" onclick="history.go(-1);" /><p>
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
<h3>Contato</h3>
N&oacute;s queremos ouvir o que voc&ecirc; tem a dizer! :D</br>
<a href="./contato.php">Fale conosco &raquo;</a>
</div>

</div>

</body>
</html>