Este repositório contém implementações manuais e detalhadas das principais estruturas de dados em Java, seguindo o conteúdo do curso da Loiane Groner. A proposta do projeto é construir todas as estruturas do zero, sem o uso de bibliotecas prontas, a fim de fixar a lógica, entender a complexidade e reforçar os fundamentos de programação orientada a objetos.

🎯 Objetivo do Projeto
Praticar estrutura de dados clássicas em Java.

Refletir o comportamento interno dessas estruturas, sem depender da API do Java.

Exercitar a criação de métodos, manipulação de arrays, ponteiros e lógica algorítmica.

Aprender a aplicar conceitos como: listas, filas, pilhas, vetores, listas encadeadas, buscas e ordenações.

🛠️ Tecnologias Utilizadas
Java 8+

IDE: IntelliJ IDEA (ou qualquer IDE compatível)

Estrutura de pacotes organizada por tipo de estrutura

Nenhuma biblioteca externa

📂 Estrutura do Projeto
bash
Copiar
Editar
Estrutura_dados_Loiane_Groner/
├── src/
│   ├── com.loiane.estruturadados/
│   │   ├── vetor/               # Implementações de vetor (array dinâmico)
│   │   ├── fila/                # Fila com e sem prioridade
│   │   ├── pilha/               # Pilha (stack)
│   │   ├── lista/               # Lista dinâmica
│   │   ├── listaEncadeada/      # Lista encadeada (simples, duplamente e circular)
│   │   ├── testes/              # Testes individuais para cada estrutura
│   │   └── util/                # Métodos utilitários
└── README.md
📚 Estruturas Implementadas
📌 Vetor (vetor/)
Vetor genérico com capacidade dinâmica.

Métodos:

adiciona(T elemento)

busca(int posicao)

remove(int posicao)

tamanho(), estaVazio(), etc.

Tratamento de exceções e controle de capacidade.

📌 Lista (lista/)
Similar ao vetor, mas com mais operações (estilo ArrayList).

Suporte a inserção em qualquer posição.

Remoção de elementos por valor ou índice.

Inclusão de métodos auxiliares como ultimoIndice() e contem().

📌 Pilha (pilha/)
Implementação baseada em array.

Comportamento LIFO (Last In, First Out).

Métodos:

empilha(T elemento)

desempilha()

topo()

📌 Fila (fila/)
Implementação com array.

Comportamento FIFO (First In, First Out).

Também inclui:

Fila com prioridade, onde a ordem de inserção depende do valor do elemento.

📌 Lista Encadeada (listaEncadeada/)
Lista ligada com nós (Node) e ponteiros.

Implementações:

Lista Simples

Lista Duplamente Encadeada

Lista Circular

Operações clássicas:

Inserção, remoção, busca por índice e valor.

Manipulação de ponteiros de cabeça, cauda e meio da lista.

🧪 Pacote de Testes (testes/)
Para cada estrutura, há uma classe de testes que:

Instancia os objetos das estruturas.

Aplica os principais métodos.

Mostra a saída no console para validação.

Exemplos:

TesteLista.java

TesteVetor.java

TesteFilaComPrioridade.java

Esses arquivos facilitam a compreensão do funcionamento interno e são úteis para debug e aprendizado.

📌 Destaques Técnicos
Uso intensivo de genéricos (generics).

Aplicação de conceitos de orientação a objetos como encapsulamento e abstração.

Tratamento de erros com mensagens claras.

Estruturas projetadas pensando em reutilização e manutenção.

Base sólida para futuros estudos de algoritmos, árvores e grafos.

🚀 Como Executar
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/Marllon-Vieira-Vergili/Estrutura_dados_Loiane_Groner.git
Abra em sua IDE Java (como IntelliJ, Eclipse ou VS Code com extensão).

Vá até os arquivos de teste dentro da pasta testes/ e execute a classe main desejada.

✍️ Autor
Desenvolvido por Marllon Vieira Vergili

GitHub: @Marllon-Vieira-Vergili

LinkedIn: https://www.linkedin.com/in/marllon-vieira-vergili-00553a208/

🎓 Base de Estudo
Este projeto foi inspirado e guiado pelo conteúdo didático da Loiane Groner, referência no ensino de Java e Estrutura de Dados no Brasil.

🧩 Próximos Passos (sugestões)
Adicionar testes unitários com JUnit.

Implementar árvores binárias e algoritmos de ordenação.

Criar uma interface gráfica ou API para visualizar as operações.
