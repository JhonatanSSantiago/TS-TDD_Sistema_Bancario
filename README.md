# TS-TDD Sistema Bancário ![GitHub Workflow Status](https://img.shields.io/github/workflow/status/JhonatanSSantiago/TS-TDD_Sistema_Bancario/Maven?style=flat-square)

Vídeo:[🧪⚙️☕️ #1 TDD com JUNIT 5 no VS CODE: Implementando Regras de Negócio em JAVA pra um Sistema Bancário](https://youtu.be/isOY-qG5bxU)

Este projeto fornece um conjunto de classes base para que sejam implementados testes unitários.
O diagrama abaixo apresenta as classes existentes. O projeto fornece documentação dos requisitos a serem implementados

![Diagrama das classes de negocio](diagrama-classes-model.png)

Perceba que a interface `Cadastro` é implementada por todas as classes exibidas acima, mas o relacionamento não foi exibido para evitar um emaranhado de linhas. De qualquer forma, pode observar que as classes são estereotipadas (rotuladas) com `\<<Cadastro>>`.

O código de tais classes foi gerado a partir do StarUML e está disponível em um link:src[projeto Java
na pasta src], contendo a mesma documentação disponível no projeto UML.
A documentação JavaDoc incluída no código fonte das classes informa como os métodos devem funcionar,
quais as regras de validação de atributos e outros detalhes.
A partir destas definições apresentadas, pode-se então escrever os testes e o código dos métodos gerais, getters e setters das classes. Observe que estes dois últimos tipos de métodos não são mostrados no diagrama por simplificação.

## Apresentações

Alguns conceitos relacionados a testes de software são mostrados nas apresentações abaixo:

[Code Coverage:](https://docs.google.com/presentation/d/e/2PACX-1vQiRM6mLQ496ptdlXhmILYO__PzXjBHyrzGOPgfCVwWy-0a7h3v-S9bbdHm7V6HO8Y4sQLkvexQvWy3/pub?start=true&loop=false&delayms=60000) fundamentos de cobertura de código e como utilizar em projetos Java com [JUnit5](http://junit.org) e [JaCoCo](http://jacoco.org/jacoco) 

[Continuous Integration e Continuous Deployment (CI/CD)](https://docs.google.com/presentation/d/e/2PACX-1vQwATi-XTUnQcXi1S2Q6p_O37gQ68D7z0hDzQBSnrIc1WVPmJNoR3lmddY47KFLDpk9iAQoizaVdFOR/pub?start=true&loop=false&delayms=60000): fundamentos de Integração Contínua e Implantação Contínua. [Vídeo-aula disponível aqui]( https://youtu.be/wA1RbmK-QRA)


> [!IMPORTANT]
>O relatório de cobertura de código do JaCoCo **NÃO é gerado** se existir algum espaço em qualquer lugar no caminho completo da pasta onde você salvou o projeto. Por exemplo, se o projeto estiver em: 

`/home/usuario/meus projetos/projeto incrível` 

você deverá renomear as pastas para algo como (preferencialmente evitando acentos) 

`/home/usuario/meus-projetos/projeto-incrivel`

![Relatorio](relatorio.png)
