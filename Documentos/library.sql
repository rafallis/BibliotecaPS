-- phpMyAdmin SQL Dump
-- version 4.7.6
-- https://www.phpmyadmin.net/
--
-- Host: db
-- Generation Time: Dec 05, 2017 at 08:27 PM
-- Server version: 5.6.38
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biblioteca`
--

-- --------------------------------------------------------

--
-- Table structure for table `Acervo`
--

CREATE TABLE `Acervo` (
  `idAcervo` int(11) NOT NULL,
  `NomeAcervo` varchar(64) NOT NULL,
  `EndereçoAcervo` varchar(64) NOT NULL DEFAULT 'Desconhecido'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Cliente`
--

CREATE TABLE `Cliente` (
  `Matrícula` int(11) NOT NULL,
  `Senha` varchar(10) NOT NULL,
  `Nome` varchar(128) NOT NULL,
  `Telefone_Pessoal` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Exemplar`
--

CREATE TABLE `Exemplar` (
  `idExemplar` int(11) NOT NULL,
  `idImpresso` int(11) NOT NULL,
  `idAcervo` int(11) NOT NULL,
  `disponivel` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Impresso`
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
-- Dumping data for table `Impresso`
--

INSERT INTO `Impresso` (`idImpresso`, `Título`, `dataPublicacao`, `Tipo`, `Editora`, `Autor`) VALUES
(1, 'Padrões de Projeto', '2000-11-01', 1, 'Desconhecido', 'GAMMA, Erich');

-- --------------------------------------------------------

--
-- Table structure for table `Reserva`
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
-- Table structure for table `Retirada`
--

CREATE TABLE `Retirada` (
  `idRetirada` int(11) NOT NULL,
  `Matrícula` int(11) NOT NULL,
  `idExemplar` int(11) NOT NULL,
  `DataRetirada` date NOT NULL,
  `DataDevolucao` date DEFAULT NULL,
  `Devolvido` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Tipo`
--

CREATE TABLE `Tipo` (
  `idTipo` int(11) NOT NULL,
  `TipoNome` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Tipo`
--

INSERT INTO `Tipo` (`idTipo`, `TipoNome`) VALUES
(1, 'Livro'),
(2, 'Revista'),
(3, 'Periódico');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Acervo`
--
ALTER TABLE `Acervo`
  ADD PRIMARY KEY (`idAcervo`);

--
-- Indexes for table `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`Matrícula`);

--
-- Indexes for table `Exemplar`
--
ALTER TABLE `Exemplar`
  ADD PRIMARY KEY (`idExemplar`),
  ADD KEY `idImpresso` (`idImpresso`),
  ADD KEY `idAcervo` (`idAcervo`);

--
-- Indexes for table `Impresso`
--
ALTER TABLE `Impresso`
  ADD PRIMARY KEY (`idImpresso`),
  ADD KEY `Tipo` (`Tipo`);

--
-- Indexes for table `Reserva`
--
ALTER TABLE `Reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `Matrícula` (`Matrícula`),
  ADD KEY `idExemplar` (`idExemplar`);

--
-- Indexes for table `Retirada`
--
ALTER TABLE `Retirada`
  ADD PRIMARY KEY (`idRetirada`) USING BTREE,
  ADD KEY `idExemplar` (`idExemplar`),
  ADD KEY `Matrícula` (`Matrícula`);

--
-- Indexes for table `Tipo`
--
ALTER TABLE `Tipo`
  ADD PRIMARY KEY (`idTipo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Acervo`
--
ALTER TABLE `Acervo`
  MODIFY `idAcervo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Cliente`
--
ALTER TABLE `Cliente`
  MODIFY `Matrícula` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Exemplar`
--
ALTER TABLE `Exemplar`
  MODIFY `idExemplar` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Impresso`
--
ALTER TABLE `Impresso`
  MODIFY `idImpresso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `Reserva`
--
ALTER TABLE `Reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Retirada`
--
ALTER TABLE `Retirada`
  MODIFY `idRetirada` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Tipo`
--
ALTER TABLE `Tipo`
  MODIFY `idTipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Exemplar`
--
ALTER TABLE `Exemplar`
  ADD CONSTRAINT `Exemplar_ibfk_2` FOREIGN KEY (`idAcervo`) REFERENCES `Acervo` (`idAcervo`),
  ADD CONSTRAINT `Exemplar_ibfk_3` FOREIGN KEY (`idImpresso`) REFERENCES `Impresso` (`idImpresso`);

--
-- Constraints for table `Impresso`
--
ALTER TABLE `Impresso`
  ADD CONSTRAINT `Impresso_ibfk_3` FOREIGN KEY (`Tipo`) REFERENCES `Tipo` (`idTipo`);

--
-- Constraints for table `Reserva`
--
ALTER TABLE `Reserva`
  ADD CONSTRAINT `Reserva_ibfk_1` FOREIGN KEY (`Matrícula`) REFERENCES `Cliente` (`Matrícula`),
  ADD CONSTRAINT `Reserva_ibfk_2` FOREIGN KEY (`idExemplar`) REFERENCES `Exemplar` (`idExemplar`);

--
-- Constraints for table `Retirada`
--
ALTER TABLE `Retirada`
  ADD CONSTRAINT `Retirada_ibfk_1` FOREIGN KEY (`Matrícula`) REFERENCES `Cliente` (`Matrícula`),
  ADD CONSTRAINT `Retirada_ibfk_2` FOREIGN KEY (`idExemplar`) REFERENCES `Exemplar` (`idExemplar`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
