INSERT INTO `Impresso` (`Título`, `dataPublicacao`, `Tipo`, `Editora`, `Autor`) VALUES
('TITULO STRING', '2000-11-01', 1, 'EDITORASTRING', 'AUTORSTRING');

INSERT INTO `Exemplar` (`idImpresso`, `idAcervo`, `disponivel`) VALUES
(IDIMPRESSO_INT, IDACERVO_INT, 1);

INSERT INTO `Acervo` (`NomeAcervo`, `EndereçoAcervo`) VALUES
('STRING_NOME', 'STRING_ENDEREÇO');

INSERT INTO `Cliente` (`Senha`, `Nome`, `Telefone_Pessoal`) VALUES
('STRING_SENHA', 'STRING_NOME', 'STRING_TELEFONE');

INSERT INTO `Retirada` (`Matrícula`, `idExemplar`, `DataRetirada`, `DataDevolucao`, `Devolvido`) VALUES
(MATRICULA_INT, ID_EXEMPLAR_INT, '2000-11-01', '2000-11-01', 0);