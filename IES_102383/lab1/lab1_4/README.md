# Exercício 1.4
## Introdução ao Docker
O Docker é uma tecnologia de conteinerização de código aberto para construir e conteinerizar apps. O Docker atua como uma app cliente-servidor com:
- Um **servidor** de longa execução.
- **APIs** que especificam interfaces que os programas podem usar para conversar e instruir o daemon do Docker.
- Uma **interface** de linha de comando para o cliente(CLI).

A CLI usa APIs do Docker para controlar ou interagir com o daemon do Docker por meio de scripts ou comandos diretos da CLI. O daemon cria e gerencia objetos do Docker, como imagens, containers, redes e volumes.

**Docker Images**: template (uma classe OOP) que permite iniciar um container. Cada imagem é definida por um Dockerfile, um arquivo de configuração que contém todos os comandos que um utilizador precisa executar para modelar a imagem.

## Docker Compose
É uma ferramenta que permite definir e correr *multi-container Docker applications*. É usado um ficheiro YAML para configurar os serviços. Depois, com um simples comando é possível criar e começar todos os serviços.

Usar o *docker compose* consiste em 3 processos:
1. Defina o ambiente da aplicação com um Dockerfile para que possa ser reproduzido em qualquer lugar.

2. Defina os serviços que compõem a aplicação em docker-compose.yml para que possam ser executados em conjunto num ambiente isolado.

3. Correr docker compose up para iniciar e executar toda a aplicação.

