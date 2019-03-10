<html>
<head>
<title>BDS - Vem de suco! | SABORES</title>
<link rel="shortcut icon" href="Imagens/favicon.ico"/> <!-- Ícone Favicon -->
<link rel="stylesheet" type="text/css" href="./estiloscardapio.css"/> <!-- CSS do site -->
</head>
<body>

<div id="header">

<div class="logo">
<center><a href="./index.php">BDS<img src="Imagens/logo.png" width="36px" height="50px"></a></center>
</div>
<div class="menu">
<table><td><text id="name">Lista completa de sabores </text></td></table>
</div>
</div>
<table align="center" cellpadding="5" cellspacing="2" width="50%" id="tabela" class="tabtext">
<?php 
	error_reporting(E_ALL ^ E_DEPRECATED);
 $con = mysql_connect("127.0.0.1", "root", "") or die ("Sem conexão com o servidor");
 $select = mysql_select_db("banco_bds") or die("Sem acesso ao DB");
 
 $dados = mysql_query("SELECT * FROM sabor");
 // transforma os dados em um array 
 $linha = mysql_fetch_assoc($dados);
 // calcula quantos dados retornaram 
 $total = mysql_num_rows($dados); 
 $contador = $total;
 // se o número de resultados for maior que zero, mostra os dados 
 if($total > 0) { 
 // inicia o loop que vai mostrar todos os dados
 
 if($total%2==0){
 
 do { 
 if($contador%2==0){
 ?>
 <tr class="tabtext">
  <td style="background: #FFCC99;" class="tabtext"><?=$linha['strNomeSabor']?></td>
  
 <?php }else{ ?>
 
  <td style="background: #FFF;" class="tabtext"><?=$linha['strNomeSabor']?></td>
 </tr class="tabtext">
 <?php
 }
	$contador--;
 // finaliza o loop que vai mostrar os dados
 }while($linha = mysql_fetch_assoc($dados));
 
 }else{
	 
 do { 
 if($contador%2==0){
 ?>
 
  <td style="background: #FFF;" class="tabtext"><?=$linha['strNomeSabor']?></td>
  </tr>
 <?php }else{ ?>
 <tr>
  <td style="background: #FFCC99;" class="tabtext"><?=$linha['strNomeSabor']?></td>
 
 <?php
 }
	$contador--;
 // finaliza o loop que vai mostrar os dados
 }while($linha = mysql_fetch_assoc($dados));
 }
 // fim do if 
 }
 // tira o resultado da busca da memória 
 mysql_free_result($dados); ?>
 </table>
 </body>
 </html>
 
<script src="Javascript/fittext.js"></script>
	<script type="text/javascript">
	  fitText(document.getElementById('name'), 2.0, {maxFontSize: '50px', minFontSize: '35px' });  
	</script>
	
	