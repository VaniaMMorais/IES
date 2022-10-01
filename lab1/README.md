# LAB1 
**lab1_1**: O que é o Maven e a sua instalação

**lab1_2**: Como criar um projeto Maven, o que é POM e o Build Lifecycle

**lab1_3**: Introdução ao uso do GIT

**lab1_4**: Introdução ao Docker e Docker Compose

## Review questions
**A)**
As principais fases do Lifecycle são:
- **validate**- validar se o projeto está correcto e se toda a informação necessária está disponível
- **compile**- compilar o código fonte do projeto
- **test**- testar o código fonte compilado utilizando uma estrutura de teste unitário adequada
- **package**- pegar no código compilado e embalá-lo(package) no seu formato distribuível, tal como um JAR
- **verify**- executa quaisquer verificações dos resultados dos testes de integração para assegurar que os critérios de qualidade são cumpridos
- **install**- instala o pacote no repositório local, para utilização como dependência em outros projectos locais
- **deploy**- feito no ambiente do build, copia o pacote final para o repositório remoto para partilha com outros programadores e projectos

**B)**
O Maven pode ser usado para gerir e para correr projetos, tornando todo o processo mais fácil. Podem ser facilmente usados diferentes plugins e diferentes dependências de acordo com o nosso projeto.

**C)**
Fazer clone do repositório.
```
git clone <REPOSITORY_URL>
```
Descarregar as atualizações mais recentes
```
git pull
```
Entrar no diretório correto
```
cd project_folder
```
Adicionar os ficheiros alterados ("." significa todos os ficheiros)
```
git add .
```
Escrever a mensagem de commit
```
 git commit -m "This is a commit message!"
```
Enviar os ficheiros para o repositório
```
git push
```

**D)**
A mensagem de commit deve ser clara e direta, ou seja, curta, no presente e dizer explicitamente a alteração feita(por exemplo "fix bug X").
Para melhor compreenção, temos este artigo https://cbea.ms/git-commit/#imperative , que descreve 7 regras de como escrever uma mensagem de commit:

1. Separar o assunto do corpo da mensagem com uma linha em branco
2. Limitar a linha do assunto a 50 caracteres
3. Capitalizar a linha do assunto (começar todas as linhas com letra maiúscula)
4. Não terminar a linha do assunto com ponto final
5. Usar o modo imperativo na linha do assunto
6. O corpo deve ter até 72 caracteres
7. Usar o corpo da mensagem para explicar o quê e porquê vs. como

**E)**
Os volumes do Docker são importantes porque quando um container Docker é destruído, todo o seu sistema de ficheiros também é. Portanto, se quisermos manter estes dados, é necessário que utilizemos volumes Docker.