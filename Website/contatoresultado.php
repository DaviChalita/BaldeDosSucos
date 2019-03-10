<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BDS - Vem de suco! | CONTATO</title>
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
<h3 style="margin: 16px 0 16px 0;">Fale conosco</h3>
<?php

if(!isset ($_POST["txtNomeContato"]) == true){
?>
<center><b>Nenhuma informação foi recebida para falar conosco.</b><p>
<input type="button" value="Ir até à tela de contato" onclick="history.go(-1);" /><p>
</center>
<?php
	 }else{
		
		$nomecontato = $_POST["txtNomeContato"];
		$mensagemcontato = $_POST["content"];
		$de = $_POST["txtEmailContato"];
		$para = 'projbds@gmail.com';
		$mensagem = "<html><body><b>Mensagem de</b>: ".$nomecontato."<p>
					<b>Email</b>: ".$de."<p>
					<b>Mensagem:</b> ".$mensagemcontato." ";
		$assunto = 'Contato pelo site';
		
		function sendMail($de,$para,$mensagem,$assunto){
    require_once("class.smtp.php");
	require_once("class.phpmailer.php");
    $mail = new PHPMailer(true);
    $mail->IsSMTP();
    try {

      $mail->SMTPAuth   = true;
      $mail->Host       = 'smtp.gmail.com';
      $mail->SMTPSecure = "tls"; #remova se nao usar gmail
     $mail->Port       = 465;                  #remova se nao usar gmail
      $mail->Username   = 'projbds@gmail.com';
      $mail->Password   = 'balviteda';
      $mail->AddAddress($para);
     $mail->AddReplyTo($de);
     $mail->SetFrom($de);
      $mail->Subject = $assunto;
      $mail->MsgHTML($mensagem);
      $mail->Send();    
      $envio = true;
    } catch (phpmailerException $e) {
      $envio = false;
    } catch (Exception $e) {
      $envio = false;
    }
    return $envio;
}
					
					if(strlen($_POST['txtNomeContato']))
{
    if(sendMail($_POST['txtEmailContato'],'projbds@gmail.com', $_POST['content'], 'Formulário de contato'))
    {
?>
				<center>
				</br>
				<img src="Imagens/cadastrosucesso.png"><p>
				<b>Mensagem enviada com sucesso.</b><p>
				<input type="submit" value="Voltar ao início do site" onclick="window.location.href='./index.php'" /><p>
				</center>
<?php
					} else{
?>
				<center>
				</br>
				<img src="Imagens/cadastrofalha.png"><p>
				<b>Falha ao enviar mensagem.</b><p>
				<?php echo mysql_error(); ?><p>
				<input type="submit" value="Voltar à tela de contato" onclick="history.go(-1);" /><p>
				</center>
<?php
					}
					echo "<script>javascript:windows.close()</script>";
					
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
N&oacute;s queremos ouvir o que voc&ecirc; tem a dizer! :D
</div>

</div>

</body>
</html>