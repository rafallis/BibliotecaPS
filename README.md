Sistema de Gestão Bibliotecária
===================


Este software visa a gestão de um sistema de biblioteca no qual será possível gerir o acervo de livros, periódicos e revistas com a inclusão e exclusão de itens do acervo, empréstimos, reservas e retiradas.

----------

Instruções de Instalação
=============================

    1- Certifique-se de que possui o [Docker](https://www.docker.com/);
    2- Clone o projeto ou baixe do próprio [GitHub](github.com);
    3- Utilize alguma IDE, ou compile pelo terminal. Foi utilizado no desenvolvimento a IDE [Netbeans](https://netbeans.org/)
    4- Vá à pasta onde consta o projeto e dê um "sudo docker-compose up"
    5- Acesse pelo navegador o link: localhost:8080 e acesse o SGBD com o nome: db, login: root e senha: password- padrões de criação;
    6- Compile e abra o programa.


P.S: Para poder utilizar o programa, você deverá ter criado as tuplas necessárias no banco de dados que já foi criado, caso tenha dúvidas sobre como funciona um banco de dados, eis o link da Wikipédia: https://pt.wikipedia.org/wiki/Banco_de_dados

  Após os procedimentos acima terem sido executados/verificados, continue a executar partindo da classe "InterfaceLogin.java", nela você verá um campo simples de login e senha onde obviamente terá que inserir as informações que constam no banco de dados.
  
  Pesquise os exemplares disponíveis, peça livros emprestados e devolva-os. Eis o objetivo da aplicação.
  Os diagramas se encontram na pasta Diagramas, no arquivo Diagramas.asta do próprio repositório. O documento básico de requisitos se encontra em Documentos, junto com imagens do banco de dados e afins.


(Edited on [<i class="icon-wikipedia"></i> StackEdit](https://stackedit.io))
