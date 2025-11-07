package n1.activities.Atividade2.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

private List<String> items;
private double totalSum;

public Order() {
	this.items = new ArrayList<>();
	this.totalSum = 0.0;
}

public void addItem(String item, double price) {
	items.add(item);
	totalSum += price;
}

public void deleteItem(String item, double price) {
	if (items.contains(item)) {
		items.remove(item);
		totalSum -= price;
	}
}

public double getTotalSum() {
	return totalSum;
}

public List<String> getItems() {
	return items;
}

public int getItemCount() {
	return items.size();
}

}
