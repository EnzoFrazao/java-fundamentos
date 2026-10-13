# 03 · Calculadora

Calculadora de console com soma, subtração, multiplicação, divisão e módulo de dois inteiros. O menu
roda em laço até o usuário escolher sair.

- A entrada é validada com `Scanner.hasNextInt()`: se o usuário digitar algo que não é inteiro, o
  programa pede de novo em vez de lançar exceção.
- Na divisão, enquanto o divisor for zero o programa pede outro número.

## Como executar

```bash
javac -encoding UTF-8 -d out Calculadora.java
java -cp out semana4.desafios.Calculadora
```
