# Projeto Java: Leitor de Pessoas via CSV

Este projeto em Java implementa um padrão Adapter para ler dados de pessoas a partir de um arquivo CSV.

## 📁 Estrutura

- `Pessoa.java`: Classe que representa uma pessoa com nome, idade e email.
- `RepositorioDePessoas.java`: Interface para abstrair a origem dos dados.
- `PessoaCsvAdapter.java`: Implementação que lê os dados do arquivo `pessoas.csv`.
- `Main.java`: Classe principal que usa o repositório e imprime as pessoas.
- `pessoas.csv`: Arquivo com os dados no formato: `nome,idade,email`

## ▶️ Como rodar

1. Compile os arquivos:
```bash
javac src/*.java
```

2. Execute o programa:
```bash
java -cp src Main
```

## 📌 Exemplo de saída
```
Nome: João da Silva
Idade: 32
Email: joao@email.com
-----------------------
...
```