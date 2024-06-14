# Set

A interface Set é uma coleção que não pode conter elementos duplicados. Ela representa o conceito matemático de um conjunto e é ideal para representar conjuntos como um baralho de cartas.

### Implementações Comuns de Set em Java:

- **HashSet**: Armazena os elementos em uma tabela hash, não mantendo uma ordem específica. Oferece um desempenho eficiente para operações de busca usando funções hash, mas a ordem de inserção não é preservada.
  
- **TreeSet**: Armazena os elementos em uma árvore binária balanceada, mantendo-os em ordem classificada (normalmente crescente). Mais lento para inserção e busca do que HashSet, mas ideal quando a ordem dos elementos é importante.
  
- **LinkedHashSet**: Mantém a ordem de inserção dos elementos usando uma combinação de tabela hash e lista duplamente vinculada. Combina a eficiência de busca do HashSet com a capacidade de manter a ordem de inserção.

### Características Gerais:

- A interface Set não permite acesso aleatório a elementos na coleção.
- Para percorrer os elementos de um Set, utiliza-se um iterador ou um loop foreach.
  
### Fixando os Conhecimentos

#### Exercícios:

### Operações Básicas com Set

#### 1. Conjunto de Convidados (OperacoesBasicas)
Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

- `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite(int codigoConvite)`: Remove um convidado do conjunto com base no código do convite.
- `contarConvidados()`: Conta o número total de convidados no Set.
- `exibirConvidados()`: Exibe todos os convidados do conjunto.

### Pesquisa em Set

#### 1. Agenda de Contatos (Pesquisa)
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

- `adicionarContato(String nome, int numero)`: Adiciona um contato à agenda.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome e retorna um conjunto com os contatos encontrados.
- `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o número de telefone de um contato específico.
- `exibirContatosOrdenados()`: Exibe os contatos ordenados.

