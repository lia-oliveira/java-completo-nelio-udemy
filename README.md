<h1>Java Completo: programação orientada a objetos + projetos</h1>


# Objetivo
Este repositório foi criado para registrar os projetos feitos durante o curso [Java Completo: programação orientada a objetos + projetos](https://www.udemy.com/course/java-curso-completo/) ministrado pelo professor Nélio Alves disponível na Udemy.


# Tecnologias utilizadas

## Projeto Padrão Dao
* Java 21
* MySQLConector j 9.2.0
* Eclipse Web IDE 2021-06



# Estrutura do projeto



# Problemas encontrados

## Projeto: jpacLass

### ADVERTÊNCIA: jakarta.persistence.spi::No valid providers found.

TODO 1: Verifique se o arquivo persistence.xml está na pasta `META-INF` dentro da pasta `resources`.

TODO 2: Verifique se o `name` informado na tag `persistence-unit` é o mesmo informado na criação do `EntityManagerFactory` da classe principal do programa. Esse nome deve ser o mesmo da base de dados.

```xml
<persistence-unit name="exemplojpa" transaction-type="RESOURCE_LOCAL">
```

```java
EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemplojpa");
```
TODO 3: Verifique se a versão do persistence está correta no cabeçalho do persistence.xml. Se for necessário, verifique a versão mais recente em: [Persistence](https://www.oracle.com/webfolder/technetwork/jsc/xml/ns/persistence/index.html)

```java
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence" 
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence 
                                 http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd"
             version="2.2">
```
TODO 4: Verifique o `value` do conector mysql declarado no persistence.xml. Se estiver usando o jakarta no projeto, use o conector a seguir:

```xml
<property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver" />
```

TODO 5: Além da dependência do Hibernate-core mencionada na aula, adicione a dependência a seguir. Ela vai fazer com que o provider seja reconhecido.

```xml
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-jpamodelgen</artifactId>
    <version>6.6.9.Final</version>
</dependency>
```

