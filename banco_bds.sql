-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 06-Out-2015 às 12:53
-- Versão do servidor: 5.6.12-log
-- versão do PHP: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `banco_bds`
--
DROP DATABASE banco_bds;
CREATE DATABASE `banco_bds` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `banco_bds`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `strLogin` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `strSenha` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `strEmail` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `strTelefone` varchar(11) COLLATE utf8_spanish_ci DEFAULT NULL,
  `strCEP` varchar(8) COLLATE utf8_spanish_ci DEFAULT NULL,
  `strEndereco` varchar(90) COLLATE utf8_spanish_ci DEFAULT NULL,
  `strNumero` varchar(6) COLLATE utf8_spanish_ci DEFAULT NULL,
  `strComplemento` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `strBairro` varchar(72) COLLATE utf8_spanish_ci DEFAULT NULL,
  `strCidade` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `strEstado` varchar(2) COLLATE utf8_spanish_ci DEFAULT NULL,
  UNIQUE KEY `strLogin` (`strLogin`),
  UNIQUE KEY `strEmail` (`strEmail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `contato`
--

CREATE TABLE IF NOT EXISTS `contato` (
  `strNomeContato` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `strEmailContato` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `strMensagem` varchar(500) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE IF NOT EXISTS `funcionario` (
  `Matricula` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `Cpf` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `Rg` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `DataNasc` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `EstadoCivil` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `Sexo` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `Email` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `Telefone` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `Celular` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Cargo` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `DataInicio` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `DataTermino` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `Login` varchar(255) COLLATE utf8_spanish_ci,
  `Senha` varchar(255) COLLATE utf8_spanish_ci,
  `Salario` float NOT NULL,
  `Auxilio` float NOT NULL,
  `HorarioTrabCom` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `HorarioTrabFim` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `IntervCom` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `IntervFim` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`Matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

INSERT INTO `funcionario` (`Matricula`, `Nome`, `Cpf`, `Rg`, `DataNasc`, `EstadoCivil`, `Sexo`, `Email`, `Telefone`, `Celular`, `Cargo`, `DataInicio`, `DataTermino`, `Login`, `Senha`, `Salario`, `Auxilio`, `HorarioTrabCom`, `HorarioTrabFim`, `IntervCom`, `IntervFim`) VALUES
(1, 'Balde dos Sucos', '163.170.447-83', '291499101', '14/06/1789', 'Solteiro(a)', 'Masculino', 'balde@gmail.com', '(21)3213-2132', '(21)21432-1321', 'Gerente', '21/01/2015', '21/01/2016', 'Balde', 'Balde', 5000, 200, '07:00', '17:00', '12:00', '17:00');


-- --------------------------------------------------------

--
-- Estrutura da tabela `lote`
--

CREATE TABLE IF NOT EXISTS `lote` (
  `IdLote` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `TipoProdutoLote` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `Especificacao` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `QtdUnitaria` int(11) NOT NULL,
  `Fornecedor` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `DataEntrada` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `DataSaida` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `HoraEntrada` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `HoraSaida` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Validade` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`IdLote`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

CREATE TABLE IF NOT EXISTS `lotedel` (
  `IdLoteDel` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `TipoProdutoLoteDel` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `EspecificacaoDel` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `QtdUnitariaDel` int(11) NOT NULL,
  `FornecedorDel` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `DataEntradaDel` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `DataSaidaDel` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `HoraEntradaDel` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `HoraSaidaDel` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `ValidadeDel` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`IdLoteDel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `IdProduto` int NOT NULL AUTO_INCREMENT,
  `TipoProduto` varchar(255) NOT NULL,
  `Especificacao` varchar(255) COLLATE utf8_spanish_ci,
  `QtdDisponivel` int NOT NULL,
  PRIMARY KEY (`IdProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
ALTER TABLE produto AUTO_INCREMENT = 1;
-- --------------------------------------------------------

INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Batata','Batata',20);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Biscoito','Biscoito',20);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Abacate',20);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Abacaxi',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Açaí',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Acerola',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Ameixa',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Amora',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Avelã',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Blueberry',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Cacau',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Caju',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Caqui',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Carambola',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Cereja',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Côco',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Cupuaçu',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Damasco',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Framboesa',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Goiaba',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Graviola',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Groselha',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Guaraná',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Jabuticaba',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Jaca',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Kiwi',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Laranja',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Lichia',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Limão',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Maçã',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Mamão',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Manga',20);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Maracujá',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Melancia',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Melão',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Morango',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Pêra',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Pêssego',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Pitanga',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Romã',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Tangerina',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Tomate',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Toranja',0);
INSERT INTO `produto` (TipoProduto, Especificacao, QtdDisponivel) VALUES('Polpa','Uva',0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ItemVendido`
--

CREATE TABLE IF NOT EXISTS `ItemVendido` (
  `IDVenda` int(11) NOT NULL,
  `IDItem` int(11) NOT NULL,
  `Especificacao` varchar(255) COLLATE utf8_spanish_ci,
  `TamanhoItem` varchar(255) COLLATE utf8_spanish_ci,
  `Sabor1` varchar(255) COLLATE utf8_spanish_ci,
  `Sabor2` varchar(255) COLLATE utf8_spanish_ci,
  `Sabor3` varchar(255) COLLATE utf8_spanish_ci,
  `QtdItem` int NOT NULL,
  PRIMARY KEY (`IDItem`,`IDVenda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;


-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

CREATE TABLE IF NOT EXISTS `venda` (
  `IdVenda` int(11) NOT NULL AUTO_INCREMENT,
  `QtdSuco250` int(11) DEFAULT 0,
  `QtdSuco500` int(11) DEFAULT 0,
  `QtdSuco750` int(11) DEFAULT 0,
  `QtdBiscoito` int(11) DEFAULT 0,
  `QtdBatata` int(11) DEFAULT 0,
  /*`ValorTotBiscoito` float NOT NULL,*/
  /*`ValorTotBatata` float NOT NULL,*/
  `Desconto` float DEFAULT 0,
  `ValorTotal` float DEFAULT 0,
  /*`Matricula` int(11) NOT NULL,*/
  PRIMARY KEY (`IdVenda`)
  /*foreign key (`Matricula`) references funcionario (`Matricula`)*/
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
