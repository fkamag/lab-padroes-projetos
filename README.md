# Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de 
Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando o Spring
Framework, são eles:

- Singleton - Utilizando @Autowired, que embora não seja uma implementação direta do 
padrão Singleton, ele está relacionado à criação e gerenciamento de instâncias únicas de componentes
no contexto do Spring. 


- Strategy/Repository - Utilizando o @Service e o @Repository que tem uma Strategy do próprio Spring
para ser utilizado dentro no nosso projeto


- Facade - Construímos uma API REST utilizando as integrações Spring Data JPA e ViaCep(Feign)


Ao criar um cliente, vamos buscar o endereço através do CEP na api ViaCep


Endereço para acessar o Swagger: http://localhost:8080/swagger-ui/index.html