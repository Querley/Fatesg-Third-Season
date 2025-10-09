# A02-N1 Sistema de Pedidos Online

Este repositório contém um sistema simples de pedidos para uma loja online, desenvolvido em Java. O sistema permite cadastro de produtos e clientes, processamento de pedidos, geração de faturas e envio de notificações.  
O código foi refatorado para aplicar corretamente os **cinco princípios do SOLID**, garantindo maior modularidade, manutenibilidade e facilidade de expansão.

<img width="886" height="267" alt="image" src="https://github.com/user-attachments/assets/85e0260d-fbcb-467e-ba2e-1cb222c7cbda" />

---

## Estrutura do Projeto

### Pacotes e Classes

**model**

- `Order`
    - Atributos privados: `items` (List<String>), `totalSum` (double)
    - Funcionalidades: adicionar itens, remover itens, calcular total, retornar lista de itens e quantidade.

**repository**

- `OrderRepository` (Interface)
    - Método: `save(Order order)`
- `DatabaseOrderRepository`
    - Implementação concreta do repositório, responsável por salvar pedidos (simulação).

**printer**

- `OrderPrinter` (Interface)
    - Método: `print(Order order)`
- `ConsoleOrderPrinter`
    - Implementação concreta, responsável por exibir pedidos no console.

**notification**

- `Notifier` (Interface)
    - Método: `sendNotification(String message)`
- `EmailNotifier`
    - Implementação concreta, responsável por enviar notificações via e-mail (simulação).

**app**

- `OrderApp`
    - Classe principal, responsável por criar pedidos, imprimir no console, salvar no banco e enviar notificações.

---

## Justificativa das Alterações

O código original apresentava graves violações dos princípios SOLID:

1. **SRP (Single Responsibility Principle)**
    - Problema: `Order` gerenciava itens, impressão, persistência e notificações.
    - Solução: Cada responsabilidade foi separada em classes próprias (`ConsoleOrderPrinter`, `DatabaseOrderRepository`, `EmailNotifier`).

2. **OCP (Open/Closed Principle)**
    - Problema: Alterações em funcionalidades exigiam mudanças na classe `Order`.
    - Solução: Uso de interfaces (`Notifier`, `OrderPrinter`, `OrderRepository`) permite adicionar novas implementações sem modificar `Order`.

3. **LSP (Liskov Substitution Principle)**
    - Problema: A classe `Order` não podia ser estendida facilmente sem quebrar o sistema.
    - Solução: Interfaces permitem substituições seguras, mantendo comportamento consistente.

4. **ISP (Interface Segregation Principle)**
    - Problema: `Order` possuía métodos que nem todos os clientes precisavam (`printOrder`, `saveToDatabase`).
    - Solução: Interfaces pequenas e específicas garantem que as classes implementem apenas o que realmente precisam.

5. **DIP (Dependency Inversion Principle)**
    - Problema: `Order` dependia de implementações concretas (`System.out`, métodos de salvamento).
    - Solução: Dependência invertida para interfaces, permitindo fácil troca de implementações e testes.

---

Cada classe está em seu próprio arquivo e pacote, mantendo organização e clareza.  
O sistema mantém a estrutura original do código, mas agora está modularizado e preparado para futuras expansões.
