package n1.activities.Atividade2.app;


import n1.activities.Atividade2.model.Order;
import n1.activities.Atividade2.printer.ConsoleOrderPrinter;
import n1.activities.Atividade2.printer.OrderPrinter;
import n1.activities.Atividade2.repository.DatabaseOrderRepository;
import n1.activities.Atividade2.repository.OrderRepository;
import n1.activities.Atividade2.notification.EmailNotifier;
import n1.activities.Atividade2.notification.Notifier;

public class Main {
	public static void main(String[] args) {
		Order order = new Order();
		order.addItem("Camiseta", 50.0);
		order.addItem("Calça", 100.0);
		order.deleteItem("Camiseta", 50.0);
		
		OrderPrinter printer = new ConsoleOrderPrinter();
		printer.print(order);
		
		OrderRepository repository = new DatabaseOrderRepository();
		repository.save(order);
		
		Notifier notifier = new EmailNotifier();
		notifier.sendNotification("Pedido realizado com sucesso!");
	}
}


