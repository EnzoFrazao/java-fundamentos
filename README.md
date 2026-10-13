# Java — fundamentos

> **EN:** My Java learning path from 2024, kept in one place: core syntax, control flow, and five small
> console projects that introduce classes, collections and object composition. Each folder keeps its
> original commit history.

Trilha de estudos de Java que fiz em 2024, do primeiro `System.out.println` até pequenos sistemas de
console com classes e coleções. Os exercícios começaram em repositórios separados. Juntei todos aqui com
`git subtree`, então **cada pasta mantém o histórico original de commits**.

## Trilha

| # | Pasta | O que pratica | Tipo |
|---|---|---|---|
| 01 | [`01-sintaxe-basica`](01-sintaxe-basica/) | Variáveis, tipos primitivos e wrappers, conversões, `String`, operadores | 31 exercícios curtos |
| 02 | [`02-estruturas-de-controle`](02-estruturas-de-controle/) | `if`/`else`, `switch`, `for`, `while`, `do-while`, `break`/`continue` rotulados | 24 exercícios curtos |
| 03 | [`03-calculadora`](03-calculadora/) | Menu em laço, `Scanner.hasNextInt()` para validar a entrada, `switch`, divisão por zero | Projeto de console |
| 04 | [`04-lista-de-tarefas`](04-lista-de-tarefas/) | `ArrayList`, estado entre iterações do menu | Projeto de console |
| 05 | [`05-cardapio-ru`](05-cardapio-ru/) | Classes, composição de objetos, `toString` | Projeto com 5 classes |
| 06 | [`06-estacionamento`](06-estacionamento/) | Encapsulamento, lista de objetos, estado (pago/não pago) | Projeto com 3 classes |
| 07 | [`07-solicitacoes-internas`](07-solicitacoes-internas/) | CRUD em memória, `switch` com `->`, contador de id estático | Projeto com 2 classes |

As pastas 01 e 02 vieram dos repositórios `semana2` e `semana3`: exercícios curtos, um conceito por
arquivo. Da 03 em diante são programas completos de console.

## Como executar

Precisa de um JDK 17 ou mais novo. Os arquivos declaram `package`, então compile para uma pasta de
saída e rode pelo nome completo da classe (`pacote.Classe`):

```bash
cd 05-cardapio-ru
javac -encoding UTF-8 -d out RU/*.java
java -cp out RU.Main
```

O README de cada pasta traz o comando exato daquele exercício.

## O que eu faria diferente hoje

Deixei o código como foi escrito em 2024, porque esta é uma trilha de estudo. Só renomeei três arquivos
que não compilavam com o nome antigo (`Index.java`, `Sistema` e `Solicitacao`, estes dois sem extensão).
Revendo agora:

- **Testes:** nenhum projeto tem testes. Hoje eu separaria a regra (cálculo, pagamento do ticket) da
  leitura do `Scanner` e cobriria a regra com JUnit.
- **Bug conhecido:** no 05, `Alimento` não sobrescreve `toString`, então o cardápio imprime a
  referência do objeto (`RU.Alimento@1b6d3586`) em vez do nome. Deixei registrado em vez de corrigir.
- **Modelagem:** no 07 o status é texto livre digitado pelo usuário. Hoje seria um `enum`, e o
  `CardapioSemanal` usaria um `Map<DayOfWeek, MenuDia>` em vez de seis atributos.
- **Pacotes:** os nomes de pacote (`semana2.fundamentos`, `RU`) vieram da IDE da época e não seguem a
  convenção `com.exemplo.projeto` em minúsculas.

## Licença

[MIT](LICENSE)
