-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Tempo de geração: 12/12/2017 às 17:03
-- Versão do servidor: 5.7.19-0ubuntu0.16.04.1
-- Versão do PHP: 7.0.22-0ubuntu0.16.04.1
CREATE DATABASE biblioteca;
use biblioteca;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `Acervo`
--

CREATE TABLE `Acervo` (
  `idAcervo` int(11) NOT NULL,
  `NomeAcervo` varchar(64) NOT NULL,
  `EndereçoAcervo` varchar(64) NOT NULL DEFAULT 'Desconhecido'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `Acervo`
--

INSERT INTO `Acervo` (`idAcervo`, `NomeAcervo`, `EndereçoAcervo`) VALUES
(1, 'uéfigê', 'Desconhecido');

-- --------------------------------------------------------

--
-- Estrutura para tabela `Cliente`
--

CREATE TABLE `Cliente` (
  `Matrícula` int(11) NOT NULL,
  `Senha` varchar(10) NOT NULL,
  `Nome` varchar(128) NOT NULL,
  `Telefone_Pessoal` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `Cliente`
--

INSERT INTO `Cliente` (`Matrícula`, `Senha`, `Nome`, `Telefone_Pessoal`) VALUES
(123, '123', '123', '123');

-- --------------------------------------------------------

--
-- Estrutura para tabela `Exemplar`
--

CREATE TABLE `Exemplar` (
  `idExemplar` int(11) NOT NULL,
  `idImpresso` int(11) NOT NULL,
  `idAcervo` int(11) NOT NULL,
  `disponivel` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `Exemplar`
--

INSERT INTO `Exemplar` (`idExemplar`, `idImpresso`, `idAcervo`, `disponivel`) VALUES
(1, 1, 1, 1),
(2, 2, 1, 1),
(3, 3, 1, 1),
(4, 1, 1, 1),
(5, 1, 1, 1),
(6, 2, 1, 1),
(7, 2, 1, 1),
(8, 3, 1, 1),
(9, 4, 1, 1),
(10, 4, 1, 1),
(11, 5, 1, 1),
(12, 5, 1, 1),
(13, 6, 1, 1),
(14, 6, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `Impresso`
--

CREATE TABLE `Impresso` (
  `idImpresso` int(11) NOT NULL,
  `Título` varchar(128) NOT NULL,
  `dataPublicacao` date NOT NULL,
  `Tipo` int(11) NOT NULL,
  `Editora` varchar(64) NOT NULL DEFAULT 'Desconhecido',
  `Autor` varchar(256) NOT NULL DEFAULT 'Desconhecido'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `Impresso`
--

INSERT INTO `Impresso` (`idImpresso`, `Título`, `dataPublicacao`, `Tipo`, `Editora`, `Autor`) VALUES
(1, 'Padrões de Projeto', '2000-11-01', 1, 'Desconhecido', 'GAMMA, Erich'),
(2, 'Projeto de Software', '2017-12-01', 1, 'Desconhecido', 'Quinta'),
(3, 'Héri Potter', '2017-09-11', 1, 'Desconhecido', 'Desconhecido'),
(4, 'As Aventuras de Wesley Uzumaki', '2017-12-11', 1, 'Desconhecido', 'Desconhecido'),
(5, 'Programador da Depressão', '2017-12-03', 2, 'Desconhecido', 'Desconhecido'),
(6, 'Visão computacional e a vida dos macacos na floresta amazônica', '2017-12-11', 3, 'Desconhecido', 'Desconhecido');

-- --------------------------------------------------------

--
-- Estrutura para tabela `Reserva`
--

CREATE TABLE `Reserva` (
  `idReserva` int(11) NOT NULL,
  `Matrícula` int(11) NOT NULL,
  `idExemplar` int(11) NOT NULL,
  `dataReserva` date NOT NULL,
  `Reservado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura para tabela `Retirada`
--

CREATE TABLE `Retirada` (
  `idRetirada` int(11) NOT NULL,
  `Matrícula` int(11) NOT NULL,
  `idExemplar` int(11) NOT NULL,
  `DataRetirada` date NOT NULL,
  `DataDevolucao` date DEFAULT NULL,
  `Devolvido` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `Retirada`
--

INSERT INTO `Retirada` (`idRetirada`, `Matrícula`, `idExemplar`, `DataRetirada`, `DataDevolucao`, `Devolvido`) VALUES
(1, 123, 1, '2017-12-12', '2017-12-12', 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `Tipo`
--

CREATE TABLE `Tipo` (
  `idTipo` int(11) NOT NULL,
  `TipoNome` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `Tipo`
--

INSERT INTO `Tipo` (`idTipo`, `TipoNome`) VALUES
(1, 'Livro'),
(2, 'Revista'),
(3, 'Periódico');

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `Acervo`
--
ALTER TABLE `Acervo`
  ADD PRIMARY KEY (`idAcervo`);

--
-- Índices de tabela `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`Matrícula`);

--
-- Índices de tabela `Exemplar`
--
ALTER TABLE `Exemplar`
  ADD PRIMARY KEY (`idExemplar`),
  ADD KEY `idImpresso` (`idImpresso`),
  ADD KEY `idAcervo` (`idAcervo`);

--
-- Índices de tabela `Impresso`
--
ALTER TABLE `Impresso`
  ADD PRIMARY KEY (`idImpresso`),
  ADD KEY `Tipo` (`Tipo`);

--
-- Índices de tabela `Reserva`
--
ALTER TABLE `Reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `Matrícula` (`Matrícula`),
  ADD KEY `idExemplar` (`idExemplar`);

--
-- Índices de tabela `Retirada`
--
ALTER TABLE `Retirada`
  ADD PRIMARY KEY (`idRetirada`) USING BTREE,
  ADD KEY `idExemplar` (`idExemplar`),
  ADD KEY `Matrícula` (`Matrícula`);

--
-- Índices de tabela `Tipo`
--
ALTER TABLE `Tipo`
  ADD PRIMARY KEY (`idTipo`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `Acervo`
--
ALTER TABLE `Acervo`
  MODIFY `idAcervo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de tabela `Cliente`
--
ALTER TABLE `Cliente`
  MODIFY `Matrícula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;
--
-- AUTO_INCREMENT de tabela `Exemplar`
--
ALTER TABLE `Exemplar`
  MODIFY `idExemplar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT de tabela `Impresso`
--
ALTER TABLE `Impresso`
  MODIFY `idImpresso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de tabela `Reserva`
--
ALTER TABLE `Reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `Retirada`
--
ALTER TABLE `Retirada`
  MODIFY `idRetirada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de tabela `Tipo`
--
ALTER TABLE `Tipo`
  MODIFY `idTipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Restrições para dumps de tabelas
--

--
-- Restrições para tabelas `Exemplar`
--
ALTER TABLE `Exemplar`
  ADD CONSTRAINT `Exemplar_ibfk_2` FOREIGN KEY (`idAcervo`) REFERENCES `Acervo` (`idAcervo`),
  ADD CONSTRAINT `Exemplar_ibfk_3` FOREIGN KEY (`idImpresso`) REFERENCES `Impresso` (`idImpresso`);

--
-- Restrições para tabelas `Impresso`
--
ALTER TABLE `Impresso`
  ADD CONSTRAINT `Impresso_ibfk_3` FOREIGN KEY (`Tipo`) REFERENCES `Tipo` (`idTipo`);

--
-- Restrições para tabelas `Reserva`
--
ALTER TABLE `Reserva`
  ADD CONSTRAINT `Reserva_ibfk_1` FOREIGN KEY (`Matrícula`) REFERENCES `Cliente` (`Matrícula`),
  ADD CONSTRAINT `Reserva_ibfk_2` FOREIGN KEY (`idExemplar`) REFERENCES `Exemplar` (`idExemplar`);

--
-- Restrições para tabelas `Retirada`
--
ALTER TABLE `Retirada`
  ADD CONSTRAINT `Retirada_ibfk_1` FOREIGN KEY (`Matrícula`) REFERENCES `Cliente` (`Matrícula`),
  ADD CONSTRAINT `Retirada_ibfk_2` FOREIGN KEY (`idExemplar`) REFERENCES `Exemplar` (`idExemplar`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
