# 🧩 DESAFIO 0.1 — Mini Calculadora 

Este projeto implementa uma mini calculadora de linha de comando em Java. Ele atende a todos os requisitos do Desafio 0.1, focando em testes unitários robustos com JUnit e na manipulação de exceções personalizadas.

## ⚙️ Tecnologias e Requisitos

* **Linguagem:** Java (JDK 17+)
* **Gerenciador de Build:** Apache Maven (utilizando o `mvnd` - Maven Daemon - para otimização de performance)
* **Testes:** JUnit 5 (JUnit Jupiter)

## ✅ Requisitos Obrigatórios Atendidos

| Requisito | Implementação |
| :--- | :--- |
| **Lógica do Código** | A lógica de cálculo está isolada no método `calcular()` para facilitar o teste. |
| **Lançar Exception Personalizada** | `OperacaoInvalidaException` é lançada quando o usuário insere uma operação não suportada. |
| **Tratar Divisão por Zero** | O código lança `OperacaoInvalidaException` para divisões por zero, sendo capturada e tratada no método `main`. |
| **Testes Unitários (JUnit)** | `CalculadoraTest.java` verifica a precisão das quatro operações e o lançamento de ambas as exceções (personalizada e nativa). |

---

## 🚀 Como Executar o Projeto

Todos os comandos devem ser executados a partir do **diretório raiz do projeto** (onde o arquivo `pom.xml` está localizado), utilizando o `mvnd` configurado.

### 1. Compilar o Código

Este comando compila o código de produção e de teste.

```bash
mvnd compile