
# Exercício 1.1

**O que é o Maven?**

O Maven é um gestor de dependências que permite criar projetos com alguma facilidade, baseado no conceito de Project object model (POM). Usa um ficheiro XML (POM) para descrever o projeto de software, sendo construído as suas dependências sobre módulos e componentes externas, a ordem de compilação, diretórios e plug-ins necessários. Baixa bibliotecas Java e seus plug-ins dinamicamente de um ou mais repositórios.

**Instalação do Maven**

Verificar a versão do Java instalada
```
java --version
```

Para instalar o Maven foi usado o comando
```
sudo apt install maven
```

De seguida, verificar a versão do Maven que foi instalada 
```
mvn --version
```

Sendo o resultado
```
Apache Maven 3.8.6 (84538c9988a25aec085021c365c560670ad80f63)
Maven home: /opt/apache-maven-3.8.6
Java version: 17.0.4, vendor: Private Build, runtime: /usr/lib/jvm/java-17-openjdk-amd64
Default locale: pt_PT, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-48-generic", arch: "amd64", family: "unix
```