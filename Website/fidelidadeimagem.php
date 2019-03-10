<?php
 session_start();
$nome = $_SESSION['login'];

$modelo = 'Imagens/cartaofidelidade.png';

$imagem = imagecreatefrompng($modelo); 

$branco = ImageColorAllocate($imagem, 255, 255, 255); //Cria a cor de primeiro plano da imagem e configura-a para branco

ImageString($imagem, 3, 3, 3, "Esse й o seu Cartгo Fidelidade, ".$nome."! - A cada suco uma marcaзгo!", $branco); //Imprime na imagem o texto PHPBrasil na cor branca que estб na variбvel $branco

ImagePng($imagem); //Converte a imagem para um GIF e a envia para o browser

ImageDestroy($imagem); //Destrуi a memуria alocada para a construзгo da imagem GIF.

?>