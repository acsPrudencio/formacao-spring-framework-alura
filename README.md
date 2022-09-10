# <p align = "center"> <b>Curso</b>
## <p align = "center"> <b> Spring Boot API REST: construa uma API  </b>

## 💻 Sobre o projeto </br> </br> 

Este projeto contém todo conteúdo do curso <b>Spring Boot API REST: construa uma API</b> da plataforma Alura.
Você pode conferir o curso clicando <a href = "https://cursos.alura.com.br/course/spring-boot-api-rest"> aqui.</a>

O curso tem carga horária de 8 horas.


<b>Módulo 01: Introdução ao Spring Boot.</b>  
Neste módulo aprendemos como criar um projeto Spring Boot do zero, adição de dependências, importação na IDE e construção
do nosso primeiro controller.  
<b>Ferramentas: Spring Initializr, Spring Web</b>

<b>Módulo 02: Publicando Endpoints.</b>  
Neste módulo aprendemos o siginifica de cada verbo HTTP e como devemos utiliza-los, também criamos as classes modelo da
aplicação, criação do endPoint de listagem de tópicos, implementação do padrão DTO para evitar o retorno de uma entidade
com dados sensíveis além de permitir que seja feito apenas o retorno de alguns campos específicos.  
<b>Ferramentas: Spring Dev Tools</b>

<b>Módulo 03: Usando Spring Data.</b>  
Neste módulo aprendemos a trabalhar com o Spring Data JPA, configuramos o banco de dados e modificamos as classes modelo
para serem persistidas no banco de dados, adicionamos o padrão repository e implementamos consultas personalizadas com a JPA.  
<b>Ferramentas: Spring Data, PostgreSQL</b> 

<b>Módulo 04: Trabalhando com POST.</b>  
Neste módulo aprendemos que para evitar repetir a URL em todos os métodos, devemos utilizar a anotação @RequestMapping em cima da 
classe controller. Que para mapear requisições do tipo POST, devemos utilizar a anotação @PostMapping. Que para receber dados 
enviados no corpo da requisição, a boa prática é criar uma classe Form, e que ao cadastrar informações é uma boa prática devolver
o código 201 ao invés do 200. Como utilizar o Postman para testar uma API Rest.  
<b>Ferramentas: Spring Data, PostgreSQL, Postman</b>

<b>Módulo 05: Validação com Bean Validation</b>  
Neste módulo aprendemos a fazer validações utilizando o Bean Validation, e para que o spring consiga as validações do 
Bean Validation e devolver um erro 400, caso alguma informação enviada pelo cliente esteja inválida, devemos utilizar a 
anotação @Valid dentro do parametro do controlle que as validações seram realizadas, também vimos que para interceptar as 
exceptions que forem lançadas nos métodos das classes controller, devemos criar uma classe anotada com @RestControllerAdvice.  
<b>Ferramentas: Spring Data, PostgreSQL, Postman, Bean Validation</b>  
