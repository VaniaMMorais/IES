# Exercício 3.1
**O que é o Java Persistent API (JPA)?**
Introdução à JPA: https://www.infoworld.com/article/3379043/what-is-jpa-introduction-to-the-java-persistence-api.html
- JPA não é uma ferramenta ou *framework*. Em vez disso, define um conjunto de conceitos que podem ser implementados por qualquer ferramenta ou *framework*.
- JPA foi originalmente planeado para o uso de base de dados relacionais, sendo que atualmente algumas implementações de JPA foram estendidas para o uso de base de dados NoSQL.


Para a realização deste exercício foi seguido o tutorial disponibilizado (https://www.baeldung.com/spring-boot-crud-thymeleaf)

**Questões:**

A classe "UserController" recebe uma instância de "userRepository" através do seu construtor; como é que este novo repositório é instanciado?
- O novo repositório é instanciado automaticamente pelo *SpringBoot Bean Autoconfiguration* após a anotação *Autowired* tentar obter o *Bean* para o *UserRepository* 

Listar os métodos invocados no objecto "userRepository" pelo "UserController". Onde são definidos estes métodos?
- A anotação *@Repository* é a interface importante em todo este processo, sendo que é esta que fornece uma camada de abstração. A interface *CRUDRepository* é quem fornece as funcionalidades CRUD. Esta interface implementa, então, as operações CRUD básicas como save, delete, count, findAll, ...

Onde é que os dados estão a ser guardados?
- Os dados estão a ser guardados em memória, sendo que após a aplicação ser terminada os dados vão ser perdidos.

Onde é definida a regra para o endereço de email "não vazio"?
- Através da anotação *@NotBlank* importada de javax.validation.constraints