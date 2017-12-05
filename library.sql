CREATE DATABASE Biblioteca;

USE Biblioteca;
CREATE TABLE Editora
(
  idEditora INT NOT NULL,
  Nome VARCHAR(128) NOT NULL,
  Endereço VARCHAR(256) NOT NULL,
  Telefone VARCHAR(9) NOT NULL,
  PRIMARY KEY (idEditora)
);

CREATE TABLE Cliente
(
  Matrícula INT NOT NULL,
  Nome VARCHAR(128) NOT NULL,
  Telefone_Pessoal VARCHAR(9) NOT NULL,
  idCurso INT,
  idDepartamento INT,
  idEmpresa INT,
  PRIMARY KEY (Matrícula)
);

CREATE TABLE Biblioteca
(
  Campus VARCHAR(128) NOT NULL,
  Endereco VARCHAR(258) NOT NULL,
  idBiblioteca INT NOT NULL,
  PRIMARY KEY (idBiblioteca)
);

CREATE TABLE Acervo
(
  idAcervo INT NOT NULL,
  idBiblioteca INT NOT NULL,
  PRIMARY KEY (idAcervo),
  FOREIGN KEY (idBiblioteca) REFERENCES Biblioteca(idBiblioteca)
);

CREATE TABLE Impresso
(
  idImpresso INT NOT NULL,
  Título VARCHAR(128) NOT NULL,
  dataPublicacao DATE NOT NULL,
  Tipo INT NOT NULL,
  idEditora INT NOT NULL,
  idAcervo INT NOT NULL,
  PRIMARY KEY (idImpresso),
  FOREIGN KEY (idEditora) REFERENCES Editora(idEditora),
  FOREIGN KEY (idAcervo) REFERENCES Acervo(idAcervo)
);

CREATE TABLE Exemplar
(
  idExemplar INT NOT NULL,
  idImpresso INT NOT NULL,
  disponivel BOOLEAN NOT NULL,
  PRIMARY KEY (idExemplar),
  FOREIGN KEY (idImpresso) REFERENCES Impresso(idImpresso)
);

CREATE TABLE Retirada
(
  idRetirada INT NOT NULL,
  DataRetirada DATE NOT NULL,
  DataDevolucao DATE,
  Devolvido BOOLEAN NOT NULL,
  idExemplar INT NOT NULL,
  Matrícula INT NOT NULL,
  PRIMARY KEY (idRetirada, idExemplar),
  FOREIGN KEY (idExemplar) REFERENCES Exemplar(idExemplar),
  FOREIGN KEY (Matrícula) REFERENCES Cliente(Matrícula)
);

CREATE TABLE Reserva
(
  idReserva INT NOT NULL,
  dataReserva DATE NOT NULL,
  idExemplar INT NOT NULL,
  Matrícula INT NOT NULL,
  Reservado BOOLEAN NOT NULL,
  PRIMARY KEY (idExemplar),
  FOREIGN KEY (idExemplar) REFERENCES Exemplar(idExemplar),
  FOREIGN KEY (Matrícula) REFERENCES Cliente(Matrícula)
);

CREATE TABLE Escrito_por
(
  Nome VARCHAR(128) NOT NULL,
  idImpresso INT NOT NULL,
  PRIMARY KEY (Nome, idImpresso),
  FOREIGN KEY (idImpresso) REFERENCES Impresso(idImpresso)
);