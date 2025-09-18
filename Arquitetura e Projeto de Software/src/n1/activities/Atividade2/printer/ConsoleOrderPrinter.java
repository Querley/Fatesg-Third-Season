package n1.activities.Atividade2.printer;

import n1.activities.Atividade2.model.Order;

public class ConsoleOrderPrinter implements OrderPrinter {
public void print(Order order) {
	System.out.println("Pedido:");
	for (String item : order.getItems()) {
		System.out.println("- " + item);
	}
	System.out.println("Total: " + order.getTotalSum());
}
}
