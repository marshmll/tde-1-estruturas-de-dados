# TDE 1 - Estruturas de Dados

Este repositório contém a implementação de diferentes estruturas de dados e exercícios relacionados.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
src/
├── estruturas/         # Implementações das estruturas de dados
│   ├── Fila.java
│   ├── FilaVetor.java
│   ├── ListaEncadeada.java
│   ├── Node.java
│   └── Pilha.java
├── Exercicio1.java     # Implementação usando Pilha
├── Exercicio2.java     # Implementação usando Fila
├── Exercicio3Lista.java    # Merge de filas usando lista encadeada
├── Exercicio3Vetores.java  # Merge de filas usando vetores
└── Merge.java          # Implementação do algoritmo de merge
```

## Como Executar

Existem duas maneiras de executar os exercícios:

### Executando via IntelliJ IDEA (Recomendado)

1. Abra o projeto no IntelliJ IDEA:
   - Vá em `File > Open`
   - Navegue até a pasta do projeto e selecione-a
   - Clique em `OK`

2. Configure o JDK:
   - Vá em `File > Project Structure`
   - Em `Project Settings > Project`, certifique-se de que um JDK está selecionado
   - Se necessário, clique em `New...` para adicionar um JDK

3. Para executar qualquer exercício:
   - Navegue até o arquivo do exercício no Project Explorer (pasta `src`)
   - Clique com o botão direito no arquivo (ex: `Exercicio1.java`)
   - Selecione `Run 'Exercicio1.main()'`
   
   OU
   
   - Abra o arquivo do exercício
   - Clique no ícone de play verde ao lado da classe principal
   - Selecione `Run 'Exercicio1.main()'`

### Executando via Terminal

Se preferir executar via terminal, você precisa ter o Java JDK instalado em seu computador. Cada exercício pode ser executado separadamente.

#### Exercício 1 - Pilha

Este exercício implementa uma pilha dinâmica onde você pode inserir e remover elementos.

```bash
javac src/Exercicio1.java
java -cp src Exercicio1
```

#### Exemplo de Uso:
```
========= EXERCÍCIO 1 =========
Digite um número para inserir na pilha (-1 para sair, -2 para remover): 5
Inserindo elemento 5
[5] <- TOPO
Digite um número para inserir na pilha (-1 para sair, -2 para remover): 10
Inserindo elemento 10
[5, 10] <- TOPO
Digite um número para inserir na pilha (-1 para sair, -2 para remover): -2
Removendo elemento...
Removido elemento 10
[5] <- TOPO
```

### Exercício 2 - Fila

Este exercício implementa uma fila dinâmica onde você pode inserir e remover elementos.

```bash
javac src/Exercicio2.java
java -cp src Exercicio2
```

#### Exemplo de Uso:
```
========= EXERCÍCIO 2 =========
Digite um número para inserir na fila (-1 para sair, -2 para remover): 3
Inserindo elemento 3
FRENTE -> [3] <- ATRÁS
Digite um número para inserir na fila (-1 para sair, -2 para remover): 7
Inserindo elemento 7
FRENTE -> [3, 7] <- ATRÁS
Digite um número para inserir na fila (-1 para sair, -2 para remover): -2
Removendo elemento...
Removido elemento 3
FRENTE -> [7] <- ATRÁS
```

### Exercício 3 - Merge de Filas

Existem duas implementações do exercício 3:
1. `Exercicio3Lista.java`: Utiliza listas encadeadas
2. `Exercicio3Vetores.java`: Utiliza vetores

Para executar a versão com listas encadeadas:
```bash
javac src/Exercicio3Lista.java
java -cp src Exercicio3Lista
```

Para executar a versão com vetores:
```bash
javac src/Exercicio3Vetores.java
java -cp src Exercicio3Vetores
```

#### Exemplo de Uso (para ambas as versões):
```
========= EXERCÍCIO 3 COM FILAS DINÂMICAS =========
AS FILAS DEVEM SER PREENCHIDAS DE FORMA ORDENADA
Digite um número para inserir na filaA (-1 para ir para a próxima, -2 para remover): 1
Inserindo elemento 1
FRENTE -> [1] <- ATRÁS
Digite um número para inserir na filaA (-1 para ir para a próxima, -2 para remover): 3
Inserindo elemento 3
FRENTE -> [1, 3] <- ATRÁS
Digite um número para inserir na filaA (-1 para ir para a próxima, -2 para remover): -1
Indo para a próxima fila...

Digite um número para inserir na filaB (-1 para finalizar, -2 para remover): 2
Inserindo elemento 2
FRENTE -> [2] <- ATRÁS
Digite um número para inserir na filaB (-1 para finalizar, -2 para remover): 4
Inserindo elemento 4
FRENTE -> [2, 4] <- ATRÁS
Digite um número para inserir na filaB (-1 para finalizar, -2 para remover): -1

Fila A:
FRENTE -> [1, 3] <- ATRÁS
Fila B:
FRENTE -> [2, 4] <- ATRÁS
Fila Resultante do Merge:
FRENTE -> [1, 2, 3, 4] <- ATRÁS
```

## Observações Importantes

1. Todos os exercícios são interativos e utilizam entrada via console.
2. Para o Exercício 3, é importante que as filas sejam preenchidas de forma ordenada para que o merge funcione corretamente.
3. Em todos os exercícios:
   - Digite `-1` para sair/avançar
   - Digite `-2` para remover um elemento
   - Digite qualquer outro número para inserir na estrutura
4. Ao executar no IntelliJ IDEA:
   - O console de entrada/saída aparecerá na parte inferior da IDE
   - Você pode digitar os números diretamente no console do IntelliJ
   - Para parar a execução, você pode clicar no botão vermelho "Stop" ou fechar o console
   - Se precisar limpar o console, clique com o botão direito nele e selecione "Clear All"

## Validação

Os exercícios foram validados com diferentes cenários de teste:

1. Inserção e remoção alternada de elementos
2. Tentativa de remoção com estrutura vazia
3. Inserção até o limite (no caso das implementações com vetor)
4. Merge de filas de diferentes tamanhos
5. Merge de filas vazias
6. Merge de filas com números negativos e positivos
