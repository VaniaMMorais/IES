# Exercício 3.2
Para a realização deste exercício é necessária uma instância do MySQL server, e para isso foi usado docker. Pode-se criar usando o comando:
```
docker run --name mysql5 -e MYSQL_ROOT_PASSWORD=secret1 -e MYSQL_DATABASE=demo -e MYSQL_USER=demo -e MYSQL_PASSWORD=secret2 -p 33060:3306-d mysql/mysql-server:5.7
```

De seguida foi criado um projeto Maven, seguindo o tutorial disponível em https://www.javaguides.net/2018/09/spring-boot-2-jpa-mysql-crud-example.html.

Para testar a aplicação foram realizados pedidos POST utilizando o Postman. Após a execução do pedido é possível verificar no browser que foi adicionado um novo *employee*, http://localhost:8080/api/v1/employees.