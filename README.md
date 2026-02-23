🚀 HR Core API

API REST para gerenciamento de funcionários desenvolvida com Java 17 e Spring Boot, aplicando boas práticas de arquitetura backend.

Projeto criado com foco em consolidação de fundamentos essenciais para desenvolvimento backend profissional.

🎯 Objetivo

Demonstrar domínio de:

Arquitetura em camadas

DTO Pattern

Paginação customizada

Soft Delete

Tratamento global de exceções

Validação de dados

Boas práticas REST

🛠 Stack Tecnológica

Java 17

Spring Boot

Spring Data JPA

Hibernate

Banco relacional (H2 / PostgreSQL)

Maven

🏗 Arquitetura do Projeto

Estrutura organizada por responsabilidade:

controller
service
repository
entity
dto
exception
Principais decisões técnicas

Separação entre entidade e DTO para evitar exposição direta do domínio

Implementação de Soft Delete com campo ativo

Paginação customizada utilizando PageResponse

Tratamento global de erros com @RestControllerAdvice

Uso de record para DTOs

Validações com Bean Validation

📦 Funcionalidades Implementadas

✔ Criar funcionário

✔ Listar funcionários ativos com paginação

✔ Buscar funcionário por ID (apenas ativos)

✔ Atualizar funcionário

✔ Soft Delete

✔ Tratamento padronizado de erros

✔ Validação de dados de entrada

📬 Endpoints Principais
➜ Criar Funcionário

POST /funcionarios

{
  "nome": "Lucas",
  "email": "lucas@email.com",
  "cargo": "Desenvolvedor",
  "dataAdmissao": "2024-01-10"
}
➜ Listar Funcionários

GET /funcionarios?page=0&size=10

Exemplo de resposta:

{
  "content": [
    {
      "id": 1,
      "nome": "Lucas",
      "email": "lucas@email.com",
      "cargo": "Desenvolvedor",
      "dataAdmissao": "2024-01-10",
      "ativo": true
    }
  ],
  "page": 0,
  "size": 10,
  "totalElements": 1,
  "totalPages": 1,
  "last": true
}
➜ Resposta de Erro Padronizada
{
  "timestamp": "2026-02-19T20:10:00",
  "status": 404,
  "error": "Not Found",
  "message": "Funcionário não encontrado com id 99",
  "path": "/funcionarios/99"
}
⚙ Como Executar o Projeto

Clonar o repositório

git clone https://github.com/seu-usuario/hr-core-api.git

Acessar a pasta do projeto

cd hr-core-api

Executar a aplicação

mvn spring-boot:run

A API estará disponível em:

http://localhost:8080
📈 Evoluções Planejadas

Filtros dinâmicos com Specification

Autenticação JWT

Dockerização

Testes automatizados completos

Deploy em ambiente cloud
