![DESAFIO BECA](https://user-images.githubusercontent.com/97994560/150247212-7291741f-09a8-460e-ba9a-9c1e94e55450.png)

## Projeto:
+ Nome do projeto: Sistema de Gestão Educacional (SISGED) 
+ Descrição: O projeto consiste em oito desafios com o objetivo final de desenvolver um Sistema de Gestão Educacional 
+ Resumo da aplicação: A aplicação tem como objetivo a automatização de tarefas manuais e simplificação dos principais processos burocráticos que integram a sala de aula e a diretoria de uma escola. Em sua primeira versão o sistema deverá permitir o cadastro da escola e do seu diretor responsável, além do cadastro de cursos e professores. Através do cadastro de turmas e alunos, a API deverá permitir o gerenciamento de todos as matrículas, além de disponibilizar funcionalidades para o controle de aplicação de atividades, 
notas e resultados de cada aluno e sua respectiva turma.
+ Status: Em revisão ⚠️

## Desenvolvimento:
+ Desafio 01 (Concluído 20/01/2021 ✅)
1) Criação da modelagem e um pequeno resumo sobre a API
2) Criação de um projeto Spring Boot e implementação das classes da modelagem
3) Criação de um repositório no git onde será utilizado para a entrega de todos os desafios
4) Commit do código na branch “main” junto com o arquivo README.md

+ Desafio 02 -- Disponível na branch main (Concluído 24/01/2021 ✅)
1) Criar uma nova branch com o nome “desafio2”, a partir da branch “main” como base, atualizar todas as modificações feitas na  api nesta banch no documento README.md
2) Criar as classes de controllers na API (CRUD)
3) Implementar o OpenAPI na Spring Rest API
4) Implementar ResponseEntity nos retornos das suas chamadas
5) Subir o código na branch “desafio2”, em seguida mergear com a branch “main”

+ Desafio 03 -- Disponível na branch main (Concluído 27/01/2021 ✅)
1) Criar uma nova branch com o nome “desafio3”, a partir da branch “main” como base, atualizar todas as modificações feitas na  api nesta banch no documento README.md
2) Criar as classes de service na API
4) Implementar interfaces e declarar os metódos que irão ser utilizados
5) Fazer a integração com a camada de controller
6) Subir o código na branch “desafio3”, em seguida mergear com a branch “main”

+ Desafio 04 -- Disponível na branch develop (Concluído 31/01/2021 ✅)
1) Criar uma nova branch com o nome “desafio4”, a partir da branch “main” como base, atualizar todas as modificações feitas na  api nesta banch no documento README.md
2) Criar as classes de repository na API
3) Configure o banco de dados H2 na  API
4) (UsAR a configuração: spring.datasource.url=jdbc:h2:mem:testdb)
5) Implementar na camada service
6) Fazer testes para certificar que a base de dados está integrada

+ Desafio 05 -- Disponível na branch desafioCinco (Concluído 02/02/2021 ✅)
1) Criar uma nova branch com o nome “desafio5”, a partir da branch “main” como base, atualizar todas as modificações feitas na  api nesta banch no documento README.md
2) Aplicar os conceitos de DTO na  aplicação
3) Fazer um relacionamento de tabelas na API
4) Criar um novo end-point para retornar um DTO personalizado, agrupamento de várias informações em diferentes tabelas da base de dados
	
+ Desafio 06 -- Disponível na branch desafioSeis (Entregue 04/02/2021 ✅)
1) Criar uma nova branch com o nome “desafio6”, a partir da branch “main” como base, atualizar todas as modificações feitas na  api nesta banch no documento README.md
2) Adicionar validação de dados na API
3) Adicionar Mapper na aplicação para conversão de objetos
4) Implementar Lombok

+ Desafio 07 -- Disponível na branch desafioSete (Entregue 08/02/2021 ✅)
1) Criar uma nova branch com o nome “desafio7”, a partir da branch “main” como base, atualizar todas as modificações feitas na  api nesta banch no documento README.md
2) Fazer o tratamento das exception utilizando try catch e si necessário finally
3) Fazer o tratamento utilizando throw e @ExceptionHandler
4) Aproveitando o método criado com @ExceptionHandler criar a classe para tratamento de exceptions utilizando @ControllerAdvice
5) Realizar novos testes, verificar o resultado final e escreva conclusão sobre exceptions

+ Desafio 08 -- Disponível na branch desafioOito (Entregue 10/02/2021 ✅)
1) Criarum docker-compose.yml
2) Subir um container contendo uma base de dados
3) Integrar sua Api com a base de dados
4) Fazer testes de integração com a nova base de dados

## Diagrama:
![Untitled Diagram](https://user-images.githubusercontent.com/97994560/151408488-1300c44b-4d83-466f-9388-3bf805dd7a99.jpg)

