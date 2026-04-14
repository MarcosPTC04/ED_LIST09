## 📌 Descrição

Este repositório apresenta a implementação de um TAD de BookList em Java utilizando listas sequenciais (arrays). O objetivo é praticar conceitos fundamentais de estrutura de dados, como manipulação de índices, controle de capacidade e lógica de deslocamento (shift) para inserção e remoção de IDs de livros.

O projeto demonstra como os dados são organizados sequencialmente na memória e como as operações funcionam internamente, garantindo que a lista permaneça sempre compactada.

🛠 Recursos Utilizados

Linguagem: Java
IDE: IntelliJ IDEA
Controle de versão: Git
Plataforma de hospedagem: GitHub

---

## 📋 Estrutura do Código

🔹 Interface BookListTAD

Define as operações da lista, como:

Inserção (início, final ou posição específica)
Remoção (início, final ou posição)
Busca e consulta
Verificações de estado (cheia, vazia, tamanho)
🔹 Classe BookList

Responsável por implementar a lista sequencial, contendo métodos de:

Inserção (início, fim e posição)
Remoção (início, fim e posição)
Busca (localizar elemento)
Verificação (estaVazia, estaCheia, tamanho)

🔹 Utiliza deslocamento (shift) para manter a lista organizada.

🔹 Classe Main

Responsável por testar todas as operações implementadas e validar o funcionamento da lista.

---

## ⚙️ Observações sobre a implementação

Lista baseada em array de tamanho fixo
Uso de deslocamento (shift)
Controle por variável tamanho
Tratamento de erros (lista cheia, vazia e posições inválidas)

---

▶️ Logs de Execução

5 10 15 20
10 15 20
10 20
Buscar 20: 1
Tamanho: 2

---

## 👨‍💻 Autor

Marcos Antonio  
Curso: ANÁLISE E DESENVOLVIMENTO DE SISTEMAS  
Disciplina: Estrutura de Dados I
