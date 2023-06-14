# DESAFIO: CRUD de clientes
[![NPM](https://img.shields.io/npm/l/react)]()

## Sobre o projeto
Desafio desenvolvido como parte de aprovação no curso Formação Desenvolvedor Moderno da escola [DevSuperior](https://devsuperior.com "Site da DevSuperior").

## Requisitos
Deve ser entregue um projeto Spring Boot contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:
  - Busca paginada de recursos;
  - Busca de recursos por id;
  - Inserir novo recurso;
  - Atualizar recurso;
  - Deletar recurso;

O projeto deve conter um seed de pelo menos 10 clientes para inserção no banco de dados. Deve estar configurado um ambiente de testes acessando o banco de dados H2.

As seguintes exceções devem ser tratadas:
  - ID não encontrado (para GET por id, PUT e DELETE), retornando código 404;
  - Erro de validação retornando código 422 e mensagens customizadas para cada campo inválido. As regras de válidação são:
    - Nome: não pode ser vazio;
    - Data de nascimento: não pode ser data futura;
 ## Modelo conceitual da classe
 (aqui vai a imagem)
 
 ## Tecnologias utilizadas
 - Java
 - Spring Boot
 - JPA / Hibernate
 - Maven
 - H2
 ## Testes manuais no Postman
 ```http
 #Buscar cliente por id
 GET /clients/1
 ```
 (aqui vai uma imagem)
 
 ```http
 #Busca paginada de clientes
 GET /clients?page=0&size=3&sort=name
 ```
 (aqui vai outra imagem)
 ```http
 #Inserção de novo cliente
 POST /clients
 ```
 (aqui vai outra imagem)
 ```http
 #Atualização de  cliente
 POST /clients/1
 ```
 (aqui vai outra imagem)
 ```http
 #Deleção de cliente
 POST /clients/1
 ```
 (aqui vai outra imagem)
