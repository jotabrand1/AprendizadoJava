# ☕ AprendizadoJava
 
Repositório com os meus estudos de **Java**, organizados por nível e por tema. Cada arquivo é um exercício ou uma anotação prática dos conceitos que vou aprendendo.
 
> 🚧 **Projeto em evolução.**
> Este repositório está sendo construído junto com o meu aprendizado. Este README descreve o **estado atual** do projeto (**novembro de 2026**) e será atualizado conforme eu avançar nos estudos e adicionar novos conteúdos. Alguns arquivos ainda estão apenas com a estrutura ou com anotações iniciais.
 
---
 
## 🎯 Objetivo
 
Aprender Java do básico ao avançado, praticando com exemplos curtos e desafios. Para deixar o estudo mais divertido, os exemplos usam como tema os personagens de **Naruto** (ninjas, missões, aldeias e níveis de dificuldade).
 
## 📍 Estágio atual
 
Atualmente o repositório cobre apenas o **Nível Básico**:
 
- Tipos de dados (primitivos e não primitivos)
- Estruturas condicionais (`if/else`, `switch/case`, operador ternário)
- Entrada de dados com `Scanner`
- Arrays
- Dois desafios práticos
Os níveis seguintes ainda serão adicionados.
 
## 📂 Estrutura do projeto
 
```
AprendizadoJava/
└── src/
    └── NivelBasico/
        ├── TiposDeDados/
        │   ├── DadosPrimitivos.java
        │   ├── DadosNaoPrimitivos.java
        │   └── Desafio1.java
        ├── Condicoes/
        │   ├── ifEElse.java
        │   ├── SwitchCase.java
        │   ├── Ternarios.java
        │   ├── LacosDeRepeticao.java
        │   └── Scanners.java
        ├── Array.java
        ├── Array2.java
        └── Desafio2.java
```
 
## 📚 Conteúdo estudado
 
### Tipos de dados
| Arquivo | O que pratica |
|---|---|
| `DadosPrimitivos.java` | `int`, `double`, `char`, `boolean`, `Long` |
| `DadosNaoPrimitivos.java` | `String` e seus métodos (`toUpperCase()`, `toLowerCase()`) |
| `Desafio1.java` | Variáveis e condicionais aninhadas: verifica se um ninja pode concluir uma missão com base na idade e no nível de dificuldade |
 
### Condições e entrada de dados
| Arquivo | O que pratica |
|---|---|
| `ifEElse.java` | Estrutura condicional `if / else` |
| `SwitchCase.java` | Menu de escolha de ninja com `switch / case` e `default` |
| `Ternarios.java` | Operador ternário (`condição ? verdadeiro : falso`) |
| `Scanners.java` | Leitura de dados do usuário (nome e idade) e validação de maioridade |
| `LacosDeRepeticao.java` | 🚧 Ainda em construção (`while` e `for`) |
 
### Arrays
| Arquivo | O que pratica |
|---|---|
| `Array.java` | Criação, preenchimento com `Scanner` e leitura de um array de `String` |
| `Array2.java` | 🚧 Ainda em construção (redeclaração de arrays) |
| `Desafio2.java` | Menu interativo em loop para cadastrar e listar ninjas, com limite de vagas no array |
 
## ▶️ Como executar
 
**Pré-requisito:** JDK instalado (o projeto foi configurado no IntelliJ IDEA com o JDK 24).
 
### Pelo IntelliJ IDEA
1. Clone o repositório e abra a pasta no IntelliJ.
2. Abra qualquer arquivo dentro de `src/`.
3. Clique no ícone ▶️ ao lado do método `main` para executar.
### Pelo terminal
```bash
# Clonar o repositório
git clone https://github.com/jotabrand1/AprendizadoJava.git
cd AprendizadoJava
 
# Compilar um arquivo (exemplo)
javac -d out src/NivelBasico/Condicoes/Scanners.java
 
# Executar
java -cp out NivelBasico.Condicoes.Scanners
```
 
## 🗺️ Próximos passos
 
Esta lista é o que pretendo estudar e pode mudar ao longo do caminho:
 
- [ ] Finalizar `LacosDeRepeticao.java` (`while`, `for`, `do/while`)
- [ ] Finalizar `Array2.java`
- [ ] Métodos e funções
- [ ] Orientação a Objetos (classes, objetos, encapsulamento, herança, polimorfismo)
- [ ] Coleções (`ArrayList`, `HashMap`, etc.)
- [ ] Tratamento de exceções
- [ ] Novos desafios práticos
## 🛠️ Tecnologias
 
- Java
- IntelliJ IDEA
- Git e GitHub
## 👨‍💻 Autor
 
**João Paulo Brandão**
Estudante de Ciência da Computação na UFES
 
- GitHub: [@jotabrand1](https://github.com/jotabrand1)
- LinkedIn: [João Paulo Brandão](https://www.linkedin.com/in/joão-paulo-brandão-3294902ab)
---
 
📝 *Última atualização do README: novembro de 2026 — este documento reflete o momento atual do projeto e vai evoluir junto com ele.*
 
