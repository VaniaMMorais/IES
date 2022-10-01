# Exercício 1.2

**Getting started with Maven**

Maven em 5 min: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

Para criar um projeto Maven é mecessária a seguinte linha 
```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
O **groupId** e o **artifactId** devem ser escritos de acordo com as "naming conventions". O diretório criado fica com o nome do artifactId.

Naming conventions: https://maven.apache.org/guides/mini/guide-naming-conventions.html

O **archetype** é um modelo genérico de uma componente no sistema.

O diretório **src/main/java** contém o código fonte do projecto, o diretório **src/test/java contém** a fonte de teste e o ficheiro pom.xml é o Project Object Model, ou POM do projecto.


**POM**

O ficheiro **pom.xml** é o ficheiro principal de configuração de um projeto Maven. É neste ficheiro que está a maior parte da informação necessária para a criação de um projeto.


**Build the Project**
```
mvn package
```

Caso o comando seja bem sucedido, isto aparecerá:
```
 ...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.033 s
[INFO] Finished at: 2022-10-01T15:48:55+01:00
[INFO] ------------------------------------------------------------------------
```

O comando escrito acima é apena uma fase do ciclo da construção do projeto.Quando uma fase é dada,o Maven executa cada fase da sequência até à fase definida, inclusive. Por exemplo, se executamos o package,o Maven executa desde o validate até ao package.

**Build Lifecycle**
- **validate**- validar se o projeto está correcto e se toda a informação necessária está disponível
- **compile**- compilar o código fonte do projeto
- **test**- testar o código fonte compilado utilizando uma estrutura de teste unitário adequada
- **package**- pegar no código compilado e embalá-lo(package) no seu formato distribuível, tal como um JAR
- **verify**- executa quaisquer verificações dos resultados dos testes de integração para assegurar que os critérios de qualidade são cumpridos
- **install**- instala o pacote no repositório local, para utilização como dependência em outros projectos locais
- **deploy**- feito no ambiente do build, copia o pacote final para o repositório remoto para partilha com outros programadores e projectos


Para testar o JAR recentemente compilado, fazemos:
```
java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
```
No caso do repositório **my-app** o resultado obtido é:
```
Hello World!
```

Para correr o programa:
```
 mvn exec:java -Dexec.mainClass="com.mycompany.app.Main"
```
Se quisermos usar argumentos:
```
 mvn exec:java -Dexec.mainClass="com.mycompany.app.Main" -Dexec.args="1010500"
```