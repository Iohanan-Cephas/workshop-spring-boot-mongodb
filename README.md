# Workshop Mongo

Este é um projeto de exemplo que utiliza Spring Boot e MongoDB para gerenciar usuários e posts, permitindo operações CRUD e buscas filtradas.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para construção de aplicações Java.
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar dados.
- **Maven**: Gerenciador de dependências e construção do projeto.

## Funcionalidades

- **Gerenciamento de Usuários**:
  - Criar, ler, atualizar e deletar usuários.
  - Listar todos os usuários e buscar usuários por ID.

- **Gerenciamento de Posts**:
  - Criar, ler, atualizar e deletar posts.
  - Buscar posts por título e realizar buscas completas com filtros de data.


## Configuração do Ambiente

1. **Pré-requisitos**:
   - Java 11 ou superior
   - MongoDB em execução

2. **Clone o repositório**:
   ```bash
   git clone https://github.com/Iohanan-Cephas/workshop-spring-boot-mongodb.git
   cd workshop-mongo
   ```

3. **Instale as dependências**:
   ```bash
   mvn install
   ```

4. **Execute o aplicativo**:
   ```bash
   mvn spring-boot:run
   ```

## Endpoints

### Usuários

- **Listar todos os usuários**: `GET /users`
- **Buscar usuário por ID**: `GET /users/{id}`
- **Criar novo usuário**: `POST /users`
- **Atualizar usuário**: `PUT /users/{id}`
- **Deletar usuário**: `DELETE /users/{id}`
- **Listar posts de um usuário**: `GET /users/{id}/posts`

### Posts

- **Listar todos os posts**: `GET /posts`
- **Buscar post por ID**: `GET /posts/{id}`
- **Buscar posts por título**: `GET /posts/titlesearch?text={texto}`
- **Busca completa de posts**: `GET /posts/fullsearch?text={texto}&minDate={dataMin}&maxDate={dataMax}`

## Contribuição

Sinta-se à vontade para contribuir com melhorias e correções. Crie um fork do projeto, faça suas alterações e envie um pull request.