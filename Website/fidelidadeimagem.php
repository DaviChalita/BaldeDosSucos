<?php
 session_start();
$nome = $_SESSION['login'];

$modelo = 'Imagens/cartaofidelidade.png';

$imagem = imagecreatefrompng($modelo); 

$branco = ImageColorAllocate($imagem, 255, 255, 255); //Cria a cor de primeiro plano da imagem e configura-a para branco

ImageString($imagem, 3, 3, 3, "Esse � o seu Cart�o Fidelidade, ".$nome."! - A cada suco uma marca��o!", $branco); //Imprime na imagem o texto PHPBrasil na cor branca que est� na vari�vel $branco

ImagePng($imagem); //Converte a imagem para um GIF e a envia para o browser

ImageDestroy($imagem); //Destr�i a mem�ria alocada para a constru��o da imagem GIF.

?>