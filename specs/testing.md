# Estratégia e mapa de testes

**Última verificação:** 2026-10-13

## Gates

| Comando | Evidência |
|---|---|
| `javac -encoding UTF-8 -d out <arquivos da pasta>` | Compilação de cada exercício |

## Mapa por capacidade

| Capability | Arquivos ou globs | Situação |
|---|---|---|
| `core` | `0*/**/*.java` | Sem testes automatizados. Compilação ainda não verificada nesta máquina |

## Lacunas

- Não há testes automatizados (JUnit). É uma decisão consciente para preservar o código original.
- Em 2026-10-13 a máquina de consolidação não tinha JDK nem Docker ativo, então a compilação não foi
  executada. Foi feita só uma checagem estática: o nome de cada classe pública bate com o arquivo.
