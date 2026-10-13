# Sistema implementado

**Última verificação:** 2026-10-13  
**Referência:** `working-tree`

## Finalidade e unidade executável

Sete programas Java de console independentes. Não há build compartilhado (Maven/Gradle) nem
dependências externas. Cada pasta deve compilar com `javac` isolado; isso ainda não foi verificado (veja `testing.md`).

## Stack e entrypoints

- Java, sem versão fixada. O 07 usa `switch` com `->`, que exige Java 14 ou mais novo.
- Entrypoints: `03-calculadora/Calculadora.java`, `04-lista-de-tarefas/ListaDeTarefas.java`,
  `05-cardapio-ru/RU/Main.java`, `06-estacionamento/Estacionamento/Main.java`,
  `07-solicitacoes-internas/Sistema.java`. Em 01 e 02, cada arquivo tem o próprio `main`.

## Estado, persistência e integrações

Tudo fica em memória durante a execução. Não há persistência nem integração externa.

## Restrições e lacunas

- Os pacotes (`semana2.fundamentos`, `RU`, `Estacionamento`) não batem com a estrutura de pastas.
  Por isso a compilação usa `-d out` e a execução usa o nome completo da classe.
- `RU.Alimento` não sobrescreve `toString` (bug conhecido, mantido de propósito e documentado no README).
