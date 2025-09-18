package n1.activities.Atividade2.repository;

import n1.activities.Atividade2.model.Order;

public class DatabaseOrderRepository implements OrderRepository {
public void save(Order order) {
	System.out.println("Salvando pedido no banco de dados...");
}
}
