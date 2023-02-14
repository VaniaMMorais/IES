# Review Questions 
A) As componentes Controller retornam uma string que indica qual é o template a ser renderizado, enquanto que as componentes RestController retornam objetos que vão ser posteriormente serializados e enviados como resposta, em formato JSON

B)
- Entity: Define a estrutura de dados, os campos necessários e os tipos de dados
- Repository: Cria uma interface CRUD sob uma entidade, estando disponíveis métodos para consultar, remover, criar e dar update (CRUD: Create Read Update Delete)
- Service: Adiciona uma nova camada que contém toda a lógica, responde a pedidos HTTP e interage com o repository, isto é serve de intermediário entre o controller e o repository
- RestController: Cria a associação entre os URL's e os métodos do Service

C)
- @Table: cria a associação entre a entidade e a respetiva base de dados
- @Column: cria a associação entre os atributos de uma classe e os campos na base de dados
- @Id: define o atributo que é a chave primária na tabela

D) A anotação @AutoWired preocupa-se com a injeção de dependências, sendo possível partilhar a instância de um serviço e de um repositório facilmente