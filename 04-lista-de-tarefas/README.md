# 04 · Lista de tarefas

Gerenciador de tarefas de console: adicionar, marcar como concluída e listar pendentes e concluídas.
As tarefas ficam em duas `ArrayList<String>` (pendentes e concluídas) durante a execução e se perdem
ao sair, porque não há persistência.

## Como executar

```bash
javac -encoding UTF-8 -d out ListaDeTarefas.java
java -cp out projetos.ListaDeTarefas
```
