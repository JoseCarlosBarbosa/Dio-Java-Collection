
# MAP

## Visão Geral

A interface Map é usada para mapear dados na forma de chaves e valores. No Java, um Map associa chaves a valores únicos e não permite chaves duplicadas.

## Implementações em Java

- **HashMap**: Não mantém ordem específica dos elementos; permite chaves e valores nulos.
- **TreeMap**: Mantém elementos ordenados; pode ser natural ou por Comparator.
- **LinkedHashMap**: Preserva ordem de inserção; permite chaves e valores nulos.
- **HashTable**: Implementação sincronizada e thread-safe; não permite nulos.

## Operações Básicas

- `put(key, value)`: Inserir ou atualizar um elemento.
- `get(key)`: Obter o valor associado à chave.
- `containsKey(key)`: Verificar se a chave está presente.
- `containsValue(value)`: Verificar se o valor está presente.
- `size()`: Obter o número de pares chave-valor.
- `isEmpty()`: Verificar se o Map está vazio.

# Exercícios

## Operações Básicas com Map

### 1. Agenda de Contatos

Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Implemente os seguintes métodos:

- `adicionarContato(String nome, Integer telefone)`: Adiciona um contato à agenda.
- `removerContato(String nome)`: Remove um contato da agenda.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa um contato pelo nome e retorna o número de telefone correspondente.

## Pesquisa em Map

### 1. Estoque de Produtos com Preço

Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar produtos, suas quantidades em estoque e seus preços. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, int quantidade, double preco)`: Adiciona um produto ao estoque.
- `exibirProdutos()`: Exibe todos os produtos, suas quantidades em estoque e preços.
- `calcularValorTotalEstoque()`: Calcula e retorna o valor total do estoque.
- `obterProdutoMaisCaro()`: Retorna o produto mais caro do estoque.
- `obterProdutoMaisBarato()`: Retorna o produto mais barato do estoque.

## Ordenação nos Map

### 1. Agenda de Eventos

Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Implemente os seguintes métodos:

- `adicionarEvento(LocalDate data, String nome, String atracao)`: Adiciona um evento à agenda.
- `exibirAgenda()`: Exibe a agenda de eventos em ordem crescente de data.
- `obterProximoEvento()`: Retorna o próximo evento que ocorrerá.
