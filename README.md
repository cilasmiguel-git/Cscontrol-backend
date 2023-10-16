# Sistema de Reserva de Carros - Backend

Este projeto é uma API construída em Java, Spring Boot, PostgreSQL como banco de dados, e Spring Security e JWT para controle de autenticação.

A API foi desenvolvida para demonstrar como configurar autenticação e autorização em um aplicativo Spring usando Spring Security.

## Sumário
- [Instalação](#instalação)
- [Configuração](#configuração)
- [Uso](#uso)
- [Endpoints da API](#endpoints-da-api)
- [Autenticação](#autenticação)
- [Banco de Dados](#banco-de-dados)
- [Contribuições](#contribuições)

## Instalação
1. Clone o repositório:
   https://github.com/cilasmiguel-git/-sistema_de_reserva_de_carros_backend.git
2. Instale as dependências com o Maven.
3. Instale o PostgreSQL.

## Configuração
Antes de executar o backend, configure as propriedades do banco de dados no arquivo `application.properties`. Certifique-se de ter um servidor PostgreSQL em execução e configurado corretamente.
spring.datasource.url=jdbc:postgresql://localhost:5432/mycars
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha


## Uso
Inicie a aplicação com o Maven. A API estará acessível em http://localhost:8080.

## Endpoints da API
A API fornece os seguintes endpoints:

- `POST /car`: Salva as informações de um carro.
- `GET /car`: Retorna a lista de carros disponíveis.
- `GET /car/{carId}`: Retorna os detalhes de um carro específico.
- `DELETE /car/{carId}`: Exclui um carro (requer autenticação de um usuário com a função "ADMIN").
- `POST /reserved-car/reserve/{carId}`: Permite a reserva de um carro (requer autenticação de um usuário com a função "USER").
- `GET /reserved-car/list-reserved-cars`: Retorna a lista de carros reservados.

## Autenticação
A API utiliza autenticação baseada em tokens JWT (JSON Web Token) para proteger os endpoints. Para acessar endpoints protegidos, inclua um cabeçalho `Authorization` contendo o token JWT obtido durante o processo de login.

## Banco de Dados
O projeto utiliza o PostgreSQL como banco de dados. As migrações de banco de dados necessárias são gerenciadas usando o Flyway.

## Contribuições
Contribuições são bem-vindas! Se encontrar problemas ou tiver sugestões de melhorias, abra um problema ou envie uma solicitação pull para o repositório.

Ao contribuir para este projeto, siga o estilo de código existente, convenções de commits e envie suas alterações em um branch separado.
