# 01 · Sintaxe básica

Exercícios curtos, um conceito por arquivo (antigo repositório `semana2`).

| Tema | Arquivos |
|---|---|
| Primeiros passos | `primeiro`, `console`, `siglasJava` (JDK, JRE e JVM) |
| Variáveis e tipos | `variaveis`, `inferencia`, `objetoVSprimitivo`, `wrapper`, `notacaoPonto` |
| Conversões | `conversãoDePrimitivos`, `conversaoStringNumero`, `conversãoNumeroString` |
| Strings | `string`, `comparandoStrings`, `igualdadeStrings` (`==` × `equals`) |
| Operadores | `operadoresAritimeticos`, `operadoresAtribuição`, `operadoresLógicos`, `operadoresRelacionais`, `operadoresTernários`, `operadoresUnários`, `fundamentos` |
| Desafios | `desafioBaskara`, `desafioCalculadora`, `desafioCelsiusFahreinheit`, `desafioFahreinheitCelsius`, `desafioConversao`, `desafioOperadoresAritimeticos`, `desafioOperadoresLogicos`, `desafioPesoIMC`, `desafioQuadradoCubo`, `desafioTriangulo` |

## Como executar

Cada arquivo é independente. Compile só o que quiser rodar e use o pacote declarado no topo dele:

```bash
javac -encoding UTF-8 -d out desafioBaskara.java
java -cp out semana2.exercicios.desafioBaskara
```
