-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 03-Out-2018 às 02:25
-- Versão do servidor: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `grafica`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
`cod_Cliente` int(11) NOT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `nome` varchar(30) DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `bairro` varchar(30) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `email` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE IF NOT EXISTS `fornecedor` (
`cod_Fornecedor` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `cnpj` varchar(25) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `bairro` varchar(30) DEFAULT NULL,
  `datacadastro` varchar(20) DEFAULT NULL,
  `ativo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `material`
--

CREATE TABLE IF NOT EXISTS `material` (
`cod_Material` int(11) NOT NULL,
  `MateriaPrima_cod_MateriaPrima` int(11) NOT NULL,
  `descricao` varchar(20) NOT NULL,
  `nome` varchar(15) NOT NULL,
  `datacadastro` datetime NOT NULL,
  `precom2` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `materiaprima`
--

CREATE TABLE IF NOT EXISTS `materiaprima` (
`cod_MateriaPrima` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `qtdEstoque` varchar(25) NOT NULL,
  `datacadastro` datetime NOT NULL,
  `cod_Usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `materiaprima_has_fornecedor`
--

CREATE TABLE IF NOT EXISTS `materiaprima_has_fornecedor` (
  `MateriaPrima_cod_MateriaPrima` int(11) NOT NULL,
  `Fornecedor_cod_Fornecedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `servico`
--

CREATE TABLE IF NOT EXISTS `servico` (
`cod_Servico` int(11) NOT NULL,
  `descricao` varchar(50) NOT NULL,
  `taxa` float NOT NULL,
  `nome` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
`cod_Usuario` int(11) NOT NULL,
  `nome` varchar(60) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tipo_Usuário` varchar(15) NOT NULL,
  `senha` varchar(8) NOT NULL,
  `ativo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
 ADD PRIMARY KEY (`cod_Cliente`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
 ADD PRIMARY KEY (`cod_Fornecedor`);

--
-- Indexes for table `material`
--
ALTER TABLE `material`
 ADD PRIMARY KEY (`cod_Material`);

--
-- Indexes for table `materiaprima`
--
ALTER TABLE `materiaprima`
 ADD PRIMARY KEY (`cod_MateriaPrima`);

--
-- Indexes for table `materiaprima_has_fornecedor`
--
ALTER TABLE `materiaprima_has_fornecedor`
 ADD PRIMARY KEY (`MateriaPrima_cod_MateriaPrima`,`Fornecedor_cod_Fornecedor`), ADD KEY `fk_MateriaPrima_has_Fornecedor_Fornecedor1_idx` (`Fornecedor_cod_Fornecedor`), ADD KEY `fk_MateriaPrima_has_Fornecedor_MateriaPrima1_idx` (`MateriaPrima_cod_MateriaPrima`);

--
-- Indexes for table `servico`
--
ALTER TABLE `servico`
 ADD PRIMARY KEY (`cod_Servico`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
 ADD PRIMARY KEY (`cod_Usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
MODIFY `cod_Cliente` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `fornecedor`
--
ALTER TABLE `fornecedor`
MODIFY `cod_Fornecedor` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `material`
--
ALTER TABLE `material`
MODIFY `cod_Material` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `materiaprima`
--
ALTER TABLE `materiaprima`
MODIFY `cod_MateriaPrima` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `servico`
--
ALTER TABLE `servico`
MODIFY `cod_Servico` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
MODIFY `cod_Usuario` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
