### 🎓 `Projeto Escola - Clean Architecture`

### 🛠️ **Visão Geral**

Este projeto é uma implementação de um sistema de gerenciamento de alunos para uma escola, desenvolvido com base nos princípios da **Clean Architecture** em Java. O sistema permite o cadastro de alunos e o acompanhamento das indicações de novos alunos por aqueles já cadastrados.

### 🧹 **Clean Architecture**

**Clean Architecture** é uma abordagem de design de software que visa separar as preocupações e responsabilidades do sistema em camadas bem definidas. Isso resulta em um código mais flexível, testável e fácil de manter. No contexto deste projeto, a arquitetura está organizada da seguinte maneira:

### 📂 **Camadas**

1. **Dominio (Entidades):**
    - 📜 Contém as regras de negócio mais básicas e essenciais do sistema.
    - Exemplo: Classe `Aluno`, que representa a entidade de um aluno, e a classe `Indicacao`, que gerencia as indicações de novos alunos.

2. **Use Cases (Casos de Uso):**
    - 🔄 Define os casos de uso do sistema, ou seja, as operações que podem ser realizadas.
    - Exemplo: `RepositorioDeAlunosEmMemoria`, que contém a lógica de cadastro de novos alunos.

3. **Repositorios (Adaptadores de Interface):**
    - 🧩 Contém os adaptadores para as interfaces, como controladores, gateways e apresentadores.
    - Exemplo: Repositórios para persistência dos dados dos alunos e suas indicações.

4. **Infra (Frameworks e Motores):**
    - ⚙️ Implementa os detalhes técnicos, como o acesso a banco de dados, APIs, interfaces gráficas, etc.
    - Exemplo: Implementação de repositórios usando JPA ou acesso via REST API.

## 🏗️ **Estrutura do Projeto**

- `src/main/java/com/br.com.ca.escola/dominio`: Contém as entidades do sistema, como `Aluno` e `Indicacao`.
- `src/main/java/com/br.com.ca.escola/casosuso`: Implementa os casos de uso, como `CadastrarAluno`.
- `src/main/java/com/br.com.ca.escola/repositorios`: Contém os adaptadores de interface e implementação de repositórios.
- `src/main/java/com/br.com.ca.escola/infra`: Detalhes técnicos e infraestrutura.

## 🛠️ **Tecnologias Utilizadas**

- **☕ Java 11+**
- **☕ JUnit**
- **🐘 Maven**
- **🗃️ JPA/Hibernate**
- **🛢️ H2 Database** (para desenvolvimento e testes)

