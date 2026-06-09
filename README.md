# FinTrack — Rastreador de Finanças Pessoais

> Projeto desenvolvido como parte do meu aprendizado em Java, com foco em estrutura de pacotes, orientação a objetos e tratamento de exceções.

---

## Sobre o projeto

O FinTrack é uma aplicação de terminal para controle de finanças pessoais.  
Com ele é possível registrar receitas e despesas, categorizar transações e visualizar o saldo atual.

## Funcionalidades

- ✅ Cadastro de transações (receita/despesa)
- ✅ Categorização por tipo
- ✅ Visualização do saldo
- ✅ Tratamento de entradas inválidas com exceção customizada

## Tecnologias utilizadas

- Java 17+
- NetBeans IDE
- BigDecimal para cálculos monetários
- LocalDate para datas
- Enums para categorias

## Estrutura do projeto

```
src/
├── app/          → Classe Main
├── controller/   → FinTracker (lógica principal)
├── model/        → Transacao
├── utils/        → Formatador
└── exceptions/   → EntradaInvalidaException
```

## Como executar

1. Clone o repositório: `git clone https://github.com/laralcf-netizen/fintrack.git`
2. Abra no NetBeans (File → Open Project)
3. Execute com `Shift + F6` ou clique em Run

## Autora

*Lara* — Estudante de Programação  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin)](https://linkedin.com/in/SEU_PERFIL)
