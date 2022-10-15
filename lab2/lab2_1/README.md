# Exercício 2.1
**O que são *Servlet Containers*?**

São componentes de um servidor web que interagem com os *Java Servlets*. <br>Processam várias solicitações concorrentemente.

- Servlet: interface genérica
- HttpServlet: extensão da interface Servlet

Quando uma aplicação em execução num servidor web recebe uma solicitação, o *server* entrega a solicitação ao *Servlet Container* que, por sua vez, a transmite ao *servlet* de destino.

**O que é um *application server*?**
Um *application server* é uma *Java Virtual Machine* (JVM) que executa apps de utilizadores. Colabora com com o *web server* para retornar uma resposta dinâmica e personalizada a uma solicitação do cliente.

Existem vários *application servers*, sendo que foi utilizado o **Apache Tomcat**, que é *open source*.

Foi então feito o download a partir de [`Apache Tomcat`](http://tomcat.apache.org/), sendo instalada a versão 9.

Para correr o servidor foi necessário acessar a pasta **bin** e dar permissões (chmod) ao ficheiro **startup.sh**.

Para verificar se foi tudo feito corretamente e o servidor está a correr basta aceder a http://localhost:8080/

É possível observar os logs através de:
```
tail logs/catalina.out
```

A instalação do Tomcat inclui um *management environment*, que pode ser usado para controlar o servidor e para lançar aplicações criadas pelo utilizador. <br>
Pode ser acedida através de http://localhost:8080/manager

Para usar este *environment* (manager app) é necessário registar pelo menos uma *role* em **conf/tomcat-users.xml**. De seguida o servidor Tomcat deve ser reiniciado. <br>
Esta role é criada através do seguinte código:
```
<role rolename="manager-gui"/>
<role rolename="manager-script"/>
<user username="admin" password="secret" roles="manager-gui,manager-script"/>
```
Há exemplos de aplicações já criados na *manager app* (Inspect theExamples --> Servlet--> Request Parameters).

Foi criada um aplicação web, recorrendo a um projeto *maven* e lançada no Tomcat.
```xml
    <dependencies>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-web-api</artifactId>
            <version>7.0</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
```

Para ser possível lançar a aplicação no servidor Tomcat é necessário fazer *install*
```
mvn install
```
Sendo, então, gerado um ficheiro **.war**, que pode ser encontrado em <project_folder>/target.

Após o ficheiro **.war** ser descarregado para o server deve ser possível observar uma página HTML simples com "Hello World!".
```html
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
```