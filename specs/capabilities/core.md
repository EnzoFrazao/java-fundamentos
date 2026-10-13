---
id: core
contract_status: confirmed
implementation_status: implemented
last_verified: 2026-10-13
last_verified_ref: working-tree
---

# Trilha de exercícios Java

## Finalidade e limites

Mostrar a evolução do estudo de Java: sintaxe, controle de fluxo e programas de console com classes.
Não é uma aplicação e não recebe novas funcionalidades.

## Atores, permissões, entradas e resultados

Quem lê o repositório compila uma pasta e interage pelo terminal (entrada via `Scanner`). O 05 e o 06 são
demonstrações roteirizadas, sem entrada.

## Contrato comportamental e critérios de aceite

- Cada pasta numerada é independente e tem um README com o comando de compilação e de execução.
- O código mantém a forma original de 2024. São permitidas só correções que impeçam a compilação.

## Invariantes e regras de negócio

- O histórico importado por `git subtree` não é reescrito.

## Estado atual e lacunas

Os sete exercícios estão presentes. A compilação não foi executada em 2026-10-13 (veja `testing.md`).

## Evidências de implementação e teste

- Implementação: pastas `01-*` a `07-*`.
- Verificação manual: o comando de cada README de pasta.

## Relações

- [system.md](../system.md)
- [testing.md](../testing.md)
