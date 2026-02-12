# 🎯 Sistema de Gerenciamento de Descontos — OCP

## 📌 Contextualização
A empresa fictícia **TechStore** precisa que seu sistema de gerenciamento de descontos seja robusto e escalável. O time de marketing lança promoções frequentemente, exigindo a introdução constante de novos tipos de desconto.

O sistema deve ser capaz de evoluir sem sofrer grandes modificações em seu código central, mantendo flexibilidade e facilitando a manutenção.

## ❗ Problema Identificado — Violação do OCP
A classe `CalculadoraDeDesconto` implementa diferentes tipos de desconto usando **condicionais (if/else)** baseadas em um enum.

O problema é que **toda vez que um novo tipo de desconto é adicionado**, o desenvolvedor é obrigado a modificar a classe `CalculadoraDeDesconto` para incluir a nova regra.

Essa necessidade de modificar o código central para estender a funcionalidade **viola o Princípio Aberto-Fechado (OCP)**, que afirma:

> *"Uma entidade de software deve ser **aberta para extensão**, mas **fechada para modificação**."*

### Consequências da Violação:
- Modificação constante de código crítico 🔄
- Alto risco de quebrar funcionalidades existentes 💥
- Dificuldade de testar novas regras isoladamente 🧪
- Sistema frágil e acoplado 🔗
- Escalabilidade comprometida 📉

## 🔧 Solução Aplicada — Refatoração com OCP e Strategy Pattern
O sistema foi refatorado utilizando o **Padrão Strategy** para separar as implementações de desconto em classes independentes e especializadas.

A classe `CalculadoraDeDesconto` passou a receber uma estratégia de desconto como argumento, eliminando completamente os blocos if/else internos.

## 🧱 Estrutura da Solução — Padrão Strategy

### Interface Principal:
- 📋 **EstrategiaDeDesconto**  
  Define o contrato que todas as estratégias de desconto devem implementar.

### Estratégias de Desconto (Implementações):
- 🎁 **DescontoCupom**  
  Aplica desconto baseado em um código de cupom com valor fixo ou percentual.

- 👑 **DescontoVIP**  
  Aplica desconto especial para clientes com status VIP.

- 🍂 **DescontoSazonal**  
  Aplica desconto baseado em períodos sazonais e épocas do ano.

- 🎂 **DescontoAniversario** (Nova Estratégia)  
  Aplica desconto especial nos meses de aniversário do cliente.

### Coordenador Principal:
- 🧮 **CalculadoraDeDesconto**  
  Responsável por receber uma estratégia de desconto e aplicá-la sem conhecer os detalhes de implementação.

- ▶️ **Main**  
  Classe responsável por iniciar a execução do sistema e demonstrar o uso de diferentes estratégias.

## ✅ Benefícios da Aplicação do OCP com Strategy

- ✨ **Extensibilidade**: Novos tipos de desconto podem ser adicionados criando apenas novas classes que implementam `EstrategiaDeDesconto`
- 🔒 **Fechado para Modificação**: A classe `CalculadoraDeDesconto` não precisa ser alterada para suportar novos descontos
- 🎯 **Código Limpo**: Sem blocos if/else condicionais que crescem indefinidamente
- 🧪 **Testabilidade**: Cada estratégia pode ser testada isoladamente
- 🔄 **Flexibilidade**: Estratégias podem ser combinadas ou alternadas em tempo de execução
- 📚 **Manutenibilidade**: Código organizado e fácil de compreender
- ⚡ **Escalabilidade**: Sistema pronto para crescer sem efeitos colaterais

## 🎯 Objetivo do Projeto
Demonstrar a importância do **OCP (Open/Closed Principle)** e do **Padrão Strategy** na construção de sistemas escaláveis, flexíveis e manuteníveis.

Especialmente em contextos críticos como e-commerce, onde mudanças são frequentes, a capacidade de estender funcionalidades sem modificar código existente é essencial para reduzir riscos e garantir qualidade.

## 📊 Comparação: Antes vs Depois

| Aspecto | Antes (Violação OCP) | Depois (Com OCP + Strategy) |
|--------|----------------------|----------------------------|
| **Modificação ao adicionar desconto** | ❌ Modifica `CalculadoraDeDesconto` | ✅ Cria nova classe |
| **Acoplamento** | Alto | Baixo |
| **Complexidade da classe principal** | Cresce com cada novo desconto | Permanece constante |
| **Risco de bugs** | Alto | Reduzido |
| **Testabilidade** | Baixa | Alta |
| **Reusabilidade de código** | Baixa | Alta |
