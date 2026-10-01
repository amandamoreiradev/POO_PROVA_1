# POO_PROVA_1 - Amanda Moreira Costa

O sistema engloba uma empresa de vendas onde o cadastro de clientes exige seu departamento, cargo e funcionário.
Há reajuste salário, atualização dos dados do funcionário, demissão, exibição da atividade/inatividade do funcionário de forma organizada e exibição do seu cargo. É um programa que facilita o dia a dia da empresa.

--Tecnologia utilizada-- 
Java 17, Apache NetBeans

--Executando o projeto--
Não sei ;(

--Descrição das classes--
Classe Departamento: envolve o nome do departamento onde o funcionário trabalha.
Esta classe está responsável por organizar as movimentações da empresa; tanto em vendas, compras, como também em alterações do funcionário referente o departamento.

Classe Cargo: envolve o nome do cargo pertencente ao funcionário.
Na classe Cargo, o contexto muda: ao invés de compras e vendas, agora são "comprador" e "vendedor", pois agora se trata do que o funcionário faz.

Classe Funcionário: engloba as duas classes acima, pois, a classe funcionário recebe um objeto Departamento e um objeto Cargo como atributos. 

Classe TesteSistema: é a junção de tudo, pois tem o objetivo de aprovar as regras do sistema. Ela instancia objetos do modelo de dados utilizando seus respectivos construtores para simular cenários reais. Assim, seus métodos de teste executam e validam os resultados, garantindo a estabilidade do código.


