# DESAFIO: CRUD de clientes
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/anderson-aguiar/desafioCRUD/blob/main/LICENSE)

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
 ![Classe Client](https://github.com/anderson-aguiar/desafioCRUD/blob/main/assets/clientjpg.jpg)
 
 ## Tecnologias utilizadas
 - Java
 - Spring Boot
 - Maven
 - H2
 ## Testes manuais no Postman
 ```http
 #Buscar cliente por id
 GET /clients/1
 ```
 ![GET by id](https://github.com/anderson-aguiar/desafioCRUD/blob/main/assets/get-by-id.jpg)
 
 ```http
 #Busca paginada de clientes
 GET /clients?page=0&size=3&sort=name
 ```
 ![GET pageable](https://github.com/anderson-aguiar/desafioCRUD/blob/main/assets/get-pageable.jpg)
 ```http
 #Inserção de novo cliente
 POST /clients
 ```
 ![POST new client](https://github.com/anderson-aguiar/desafioCRUD/blob/main/assets/post-client.jpg)
 ```http
 #Atualização de cliente
 PUT /clients/1
 ```
 ![PUT client](https://github.com/anderson-aguiar/desafioCRUD/blob/main/assets/put-client.jpg)
 ```http
 #Deleção de cliente
 DELETE /clients/1
 ```
 ![DELETE client](https://github.com/anderson-aguiar/desafioCRUD/blob/main/assets/delete-client.jpg)
 
 ## Autor
 ### Anderson Martins
 [![linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/anderson-martins-0a062810b)
