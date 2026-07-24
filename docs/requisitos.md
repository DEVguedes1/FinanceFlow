# FinanceFlow - Documento de Requisitos de Software

**Projeto:** FinanceFlow  
**Tipo:** Aplicacao desktop para gerenciamento financeiro pessoal  
**Tecnologia de referencia:** Java 21, Java Swing e MySQL Connector/J  
**Versao do documento:** 1.0  
**Status:** Documento de requisitos

## 1. Visao Geral e Motivacao do Projeto

### 1.1 Contexto do problema

A organizacao das financas pessoais costuma depender de anotacoes dispersas, planilhas ou aplicativos com excesso de funcionalidades. Esse cenario dificulta o registro consistente de receitas e despesas, a identificacao das categorias que concentram os gastos e a compreensao do saldo disponivel.

O FinanceFlow propoe uma interface desktop simples e centralizada para que uma pessoa possa registrar suas movimentacoes financeiras e consultar uma visao consolidada da propria situacao financeira. O sistema deve reduzir o esforco de controle manual e apresentar os dados de forma direta, legivel e adequada ao uso recorrente.

### 1.2 Objetivos do sistema

- Permitir o cadastro estruturado de receitas e despesas.
- Classificar movimentacoes por categorias.
- Exibir transacoes em tabelas para consulta e conferência.
- Apresentar um resumo do saldo, das receitas e das despesas.
- Validar os dados essenciais antes de aceitar uma transacao.
- Oferecer navegacao simples entre Visao Geral, Transacoes e Categorias.
- Manter uma base tecnica organizada, extensivel e coerente com boas praticas de Java.

### 1.3 Publico-alvo e valor entregue

O publico-alvo e o usuario que deseja controlar as proprias financas sem depender de uma planilha ou de uma aplicacao web. O sistema entrega valor por meio de:

- **Visibilidade:** consolidacao das movimentacoes e do saldo em uma tela de visao geral.
- **Organizacao:** classificacao das transacoes por tipo e categoria.
- **Praticidade:** cadastro por formulario modal e consulta em tabela.
- **Confiabilidade:** bloqueio de registros com informacoes obrigatorias ausentes.
- **Autonomia:** funcionamento como aplicacao desktop, com fluxo de uso direto e sem complexidade desnecessaria.

### 1.4 Escopo do produto

O escopo principal compreende o controle de transacoes financeiras pessoais, categorias, listagem das movimentacoes e resumo financeiro. O sistema deve preservar a separacao entre modelo de dominio e componentes visuais, permitindo evolucoes futuras como persistencia completa, filtros, edicao e exclusao sem comprometer a experiencia basica.

## 2. Atores do Sistema

Os atores abaixo representam os papeis que interagem diretamente com o sistema, conforme o fluxo de casos de uso previsto para o FinanceFlow.

| Ator | Descricao | Principais interacoes |
|---|---|---|
| **Usuario Principal** | Pessoa responsavel por administrar os proprios dados financeiros. E o unico ator humano necessario no escopo atual. | Navegar entre modulos, cadastrar transacoes, consultar tabelas, categorizar movimentacoes e visualizar o resumo do saldo. |

Nao ha, no escopo atual, papeis distintos de administrador, operador ou auditor. O banco de dados e um recurso tecnico de persistencia, nao um ator de negocio.

## 3. Requisitos Funcionais (RF)

As prioridades seguem a convencao **Alta**, **Media** e **Baixa**. Requisitos de prioridade Alta sao essenciais para o fluxo minimo de controle financeiro; requisitos de prioridade Media ampliam a utilidade do produto; requisitos de prioridade Baixa representam melhorias ou capacidades complementares.

### RF001 - Acessar a tela principal

- **Descricao:** O sistema deve abrir uma tela principal contendo a area de navegacao e a area de conteudo dos modulos.
- **Prioridade:** Alta.
- **Criterio de aceite:** Ao iniciar a aplicacao, o usuario visualiza a tela principal sem precisar abrir telas internas manualmente.

### RF002 - Navegar entre modulos

- **Descricao:** O sistema deve permitir que o Usuario Principal alterne entre os modulos **Visao Geral**, **Transacoes** e **Categorias** por meio do menu de navegacao.
- **Prioridade:** Alta.
- **Criterio de aceite:** Ao selecionar um modulo, seu painel e exibido na area de conteudo e o painel anteriormente exibido deixa de ocupar essa area.

### RF003 - Abrir formulario de nova transacao

- **Descricao:** O sistema deve disponibilizar no modulo de Transacoes uma acao para iniciar o cadastro de uma nova movimentacao financeira.
- **Prioridade:** Alta.
- **Criterio de aceite:** A acao de nova transacao abre um formulario modal com os campos necessarios ao registro.

### RF004 - Cadastrar receita ou despesa

- **Descricao:** O sistema deve permitir registrar uma transacao informando descricao, valor, tipo e categoria. O tipo deve distinguir **Receita** de **Despesa** e ser armazenado de acordo com o dominio (`ENTRADA` ou `SAIDA`).
- **Prioridade:** Alta.
- **Criterio de aceite:** Uma transacao com dados validos e aceita e fica disponivel para exibicao nas consultas do sistema.

### RF005 - Validar campos obrigatorios

- **Descricao:** O sistema deve impedir o salvamento quando descricao, valor, tipo ou categoria estiverem nulos, vazios ou preenchidos somente com espacos.
- **Prioridade:** Alta.
- **Criterio de aceite:** Ao tentar salvar um formulario incompleto, o sistema nao cria a transacao e informa que todos os campos obrigatorios devem ser preenchidos.

### RF006 - Validar o valor da transacao

- **Descricao:** O sistema deve aceitar somente valores monetarios numericos, positivos e maiores que zero, utilizando precisao adequada para valores financeiros.
- **Prioridade:** Alta.
- **Criterio de aceite:** Valores vazios, nao numericos, negativos ou iguais a zero sao rejeitados com mensagem orientativa e sem perda dos demais dados do formulario.

### RF007 - Selecionar uma categoria

- **Descricao:** O sistema deve permitir associar cada transacao a uma categoria disponivel, como Alimentacao, Educacao ou Lazer. O modulo de Categorias deve ser o ponto de consulta e evolucao desse cadastro.
- **Prioridade:** Media.
- **Criterio de aceite:** O usuario consegue escolher uma categoria no cadastro e a categoria selecionada aparece na transacao listada.

### RF008 - Listar transacoes em tabela

- **Descricao:** O sistema deve exibir as transacoes em uma tabela com, no minimo, as colunas Descricao, Valor, Tipo, Data e Categoria, permitindo consulta visual e rolagem quando houver muitos registros.
- **Prioridade:** Alta.
- **Criterio de aceite:** Cada transacao valida e exibida como uma linha com seus dados correspondentes e colunas identificadas.

### RF009 - Exibir a data da transacao

- **Descricao:** O sistema deve associar uma data a cada movimentacao e apresentar essa informacao na tabela de transacoes.
- **Prioridade:** Media.
- **Criterio de aceite:** A data registrada e exibida em formato legivel e permanece associada a transacao durante as consultas.

### RF010 - Exibir resumo financeiro

- **Descricao:** O modulo Visao Geral deve apresentar, de forma destacada, o saldo atual, o total de receitas e o total de despesas.
- **Prioridade:** Alta.
- **Criterio de aceite:** Os tres indicadores sao exibidos com valores monetarios e sao atualizados quando uma transacao valida altera os dados financeiros.

### RF011 - Calcular o saldo

- **Descricao:** O sistema deve calcular o saldo como a soma das receitas menos a soma das despesas: `saldo = totalReceitas - totalDespesas`.
- **Prioridade:** Alta.
- **Criterio de aceite:** Para um conjunto conhecido de transacoes, o saldo apresentado corresponde exatamente a essa formula, respeitando a precisao monetaria.

### RF012 - Consultar categorias

- **Descricao:** O sistema deve disponibilizar o modulo de Categorias para visualizacao das categorias utilizadas no controle financeiro e de seus dados associados, quando aplicavel.
- **Prioridade:** Media.
- **Criterio de aceite:** O usuario consegue acessar o modulo pelo menu e visualizar uma area dedicada ao gerenciamento ou consulta de categorias.

### RF013 - Informar o resultado das operacoes

- **Descricao:** O sistema deve comunicar ao usuario o resultado de uma tentativa de cadastro, indicando sucesso ou o motivo da rejeicao.
- **Prioridade:** Media.
- **Criterio de aceite:** Uma operacao rejeitada apresenta uma mensagem compreensivel e uma operacao concluida fecha o formulario ou atualiza a consulta conforme o fluxo definido.

## 4. Requisitos Nao Funcionais (RNF)

### RNF001 - Desempenho da interface

A tela principal e os paineis internos devem abrir e responder a interacoes comuns sem travamentos perceptiveis em um ambiente desktop compativel com Java 21. Operacoes de interface devem ser executadas na Event Dispatch Thread do Swing, sem bloquear a interacao do usuario com tarefas de longa duracao.

### RNF002 - Responsividade e estabilidade visual

A aplicacao deve manter os componentes legiveis e utilizaveis em sua janela suportada, com dimensoes, espacamentos e areas de rolagem consistentes. A carga de uma tabela nao deve causar redimensionamentos inesperados ou ocultar comandos essenciais.

### RNF003 - Usabilidade da navegacao

A navegacao deve ser previsivel, com menu lateral persistente e nomes claros para Visao Geral, Transacoes e Categorias. O usuario deve chegar a qualquer modulo principal sem mais de uma acao a partir da tela principal.

### RNF004 - UX/UI minimalista

A interface deve priorizar clareza, baixo ruido visual, hierarquia tipografica consistente, contraste adequado e exibicao direta dos dados financeiros. Os indicadores de saldo, receita e despesa devem ser facilmente identificaveis sem exigir interpretacao complexa.

### RNF005 - Dialogos modais desacoplados

O cadastro de transacoes deve ocorrer em uma janela modal desacoplada do painel de listagem, evitando que o formulario altere a estrutura da tela principal. O dialogo deve retornar o resultado da operacao de maneira controlada e nao deve concentrar regras de persistencia ou calculo financeiro.

### RNF006 - Arquitetura e separacao de responsabilidades

A solucao deve preservar a separacao entre entidades do dominio (`model`), componentes de apresentacao (`view`) e acesso a dados. Alteracoes de interface nao devem exigir mudancas indevidas nas regras de calculo ou nas entidades.

### RNF007 - Tecnologias suportadas

O sistema deve ser desenvolvido em Java 21, utilizar Java Swing para a interface desktop e manter compatibilidade com o ciclo de build Maven definido pelo projeto. A comunicacao com MySQL deve utilizar o driver oficial configurado no projeto quando a persistencia estiver habilitada.

### RNF008 - Padroes de projeto e Clean Code

O codigo deve seguir convencoes de nomenclatura, encapsulamento, coesao e baixo acoplamento. Padroes de projeto devem ser aplicados quando resolverem uma necessidade real, incluindo o uso controlado de componentes modais e do Singleton de conexao ja previsto no projeto, sem introduzir complexidade desnecessaria.

### RNF009 - Confiabilidade dos dados de entrada

Os dados recebidos da interface devem ser validados antes de serem convertidos, persistidos ou usados em calculos. Falhas de validacao devem impedir efeitos parciais, preservar a informacao digitada quando possivel e orientar a correcao pelo usuario.

### RNF010 - Precisao monetaria

Valores financeiros devem ser processados com uma representacao decimal apropriada, como `BigDecimal`, evitando erros de arredondamento associados a tipos de ponto flutuante binario. A exibicao deve utilizar formato monetario consistente.

### RNF011 - Manutenibilidade

O sistema deve manter classes e metodos com responsabilidades claras, evitar duplicacao desnecessaria e permitir a inclusao de novos tipos ou categorias sem alterar fluxos nao relacionados. Mudancas relevantes devem ser acompanhadas de testes ou verificacoes equivalentes.

### RNF012 - Tratamento de erros

Erros de entrada, persistencia ou operacao devem ser tratados de forma controlada. A aplicacao nao deve encerrar inesperadamente por causa de um valor invalido ou de uma falha recuperavel, e mensagens tecnicas devem ser separadas das mensagens destinadas ao usuario.

## 5. Regras de Negocio (RN)

### RN001 - Obrigatoriedade da descricao

Uma transacao nao pode ser salva sem descricao. A descricao deve conter pelo menos um caractere diferente de espaco.

### RN002 - Obrigatoriedade e validade do valor

Uma transacao nao pode ser salva sem valor. O valor deve ser numerico, maior que zero e interpretado como quantia monetaria valida.

### RN003 - Obrigatoriedade do tipo

Toda transacao deve possuir um tipo. Os tipos validos sao Receita/Entrada e Despesa/Saida; nao e permitido salvar uma transacao sem essa classificacao.

### RN004 - Obrigatoriedade da categoria

Toda transacao deve possuir uma categoria valida selecionada a partir das categorias disponiveis para o usuario.

### RN005 - Formula do saldo

O saldo atual e calculado pela diferenca entre o total de receitas e o total de despesas:

`Saldo Atual = Soma das Receitas - Soma das Despesas`

### RN006 - Impacto do tipo no saldo

Uma Receita aumenta o saldo e compoe o total de receitas. Uma Despesa reduz o saldo e compoe o total de despesas. O valor base da transacao deve permanecer positivo; o tipo determina seu efeito no calculo.

### RN007 - Consistencia entre listagem e resumo

Os totais exibidos na Visao Geral devem considerar o mesmo conjunto de transacoes apresentado na listagem, respeitando os mesmos tipos e valores validos.

### RN008 - Unicidade da identificacao

Cada transacao persistida deve possuir um identificador unico. Esse identificador deve ser usado para diferenciar registros mesmo quando duas transacoes tiverem a mesma descricao, data, categoria e valor.

### RN009 - Associacao ao usuario

Uma transacao e uma categoria devem estar associadas ao Usuario Principal responsavel pelos dados. O sistema nao deve misturar registros de usuarios diferentes quando o suporte a mais de um usuario estiver habilitado.

### RN010 - Integridade no cadastro

Uma transacao somente pode ser incluida depois que todas as regras de obrigatoriedade e formato forem satisfeitas. Em caso de falha, nenhum registro parcial deve ser criado.

## 6. Rastreabilidade e observacoes de escopo

- **Navegacao:** RF001, RF002 e RNF003 refletem a tela principal e os paineis de Visao Geral, Transacoes e Categorias.
- **Cadastro:** RF003 a RF007 e RN001 a RN004 refletem o formulario modal de transacao.
- **Consulta:** RF008, RF009 e RF012 refletem as tabelas e paineis de consulta.
- **Resumo:** RF010 e RF011, apoiados por RN005 a RN007, definem o comportamento financeiro esperado.
- **Qualidade tecnica:** RNF001 a RNF012 estabelecem as restricoes de desempenho, arquitetura, usabilidade, tecnologia e confiabilidade.

Este documento descreve o comportamento esperado do produto e serve como referencia para evolucao do prototipo atual. Funcionalidades como edicao, exclusao, filtros, autenticacao, exportacao e sincronizacao externa nao fazem parte do escopo funcional minimo deste documento e devem ser especificadas em uma revisao futura caso sejam incorporadas.
