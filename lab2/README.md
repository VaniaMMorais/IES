# Review Questions
**A)** <br>
Um servlet container é um componente importante de um servidor web que permite gerar páginas web dinâmicas. É responsável por:
- gerir o ciclo de vida de servlets
- carregar os servlets para memória
- mapear uma URL para um servlet particular
- garantir que quem pede o URL possui os direitos de acesso corretos
- inicializar e invocar métodos dos servlets
- terminar (destruir) os servlets 

**B)** <br>
Model-View-Controller (MVC) é um padrão de desenho de software usado habitualmente para desenvolver interfaces que dividem a lógica do programa em 3 elementos interconectados. <br>
- Model
    - preocupa-se com o armazenamento, manipulação e geração de dados
    
- View
    - os dados solicitados ao Model são apresentados aqui
    - não se dedica a saber de onde vieram os dados, apenas os apresenta

- Controller
    - componente final que faz o intermédio entre entrada e saída, comanda a View e o Model para serem alterados de forma apropriada conforme o pedido do utilizador
    - o foco central são as ações do utilizador
<br> 

O Controller envia comandos para o Model para atualizar o seu estado (pode também enviar comandos para a view)<br>
O Model armazena dados e notifica as Views e Controllers associados quando há uma mudança de estado. Estas notificações permitem que as Views produzam saídas atualizadas<br>
A View gera uma representação dos dados presentes no Model solicitado, fazendo a exibição dos dados<br>

MVC com o Spring Boot:<br>
The Spring Web MVC framework is designed around a DispatcherServlet that dispatches requests to handlers, with configurable handler mappings and view resolution. The default handler is based on the @Controller and @RequestMapping annotations, offering a wide range of flexible handling methods. <br>

**C)** <br>
O papel destas *starter dependencies* consiste em reduzir o tempo que se passa a configurar e a gerir todas as diferentes dependências, sendo, então, possível agrupar várias dependências num só nome. <br>
Ex.: org.springframework.boot:spring-boot-starter-data-jpa <br>

**D)** <br>
- @EnableAutoConfiguration
    - permite à Spring Boot auto-configurar o contexto da aplicação. Portanto, cria e regista automaticamente beans com base tanto nos ficheiros jar incluídos no classpath como nos beans definidos por nós.
- @ComponentScan
    - diz à Spring para procurar componentes anotados nas pakages. @ComponentScan também usado para especificar pacotes base e classes de pacotes base usando obasePackageClasses ou atributos basePackages de @ComponentScan.
- @Configuration
    -  indica que uma classe declara um ou mais métodos @Bean e pode ser processada pelo contentor Spring para gerar definições beans e pedidos de serviço para esses beans em tempo de execução

**E)** <br>
What is a REST API?<br>
A REST API is an application programming interface that conforms to specific architectural constraints, like stateless communication and cacheable data. It is not a protocol or standard. <br>

- Some of Best practices:
    - Accept and respond with JSON: SON is the standard for transferring data. Almost every networked technology can use it. Server-side technologies have libraries that can decode JSON without doing much work.
    - Handle errors gracefully and return standard error codes: To eliminate confusion for API users when an error occurs, we should handle errors gracefully and return HTTP response codes that indicate what kind of error occurred. <br>Ex.: 400 Bad Request – This means that client-side input fails validation.
    - Allow filtering, sorting, and pagination: The databases behind a REST API can get very large. Filtering and pagination both increase performance by reducing the usage of server resources. As more data accumulates in the database, the more important these features become.
    - Maintain good security practices: Most communication between client and server should be private since we often send and receive private information. A SSL certificate isn’t too difficult to load onto a server and the cost is free or very low. 
    - Cache data to improve performance: We can add caching to return data from the local memory cache instead of querying the database to get the data every time we want to retrieve some data that users request. The good thing about caching is that users can get data faster.