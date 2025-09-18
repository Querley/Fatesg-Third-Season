package n1.activities.Atividade2.notification;

public class EmailNotifier implements Notifier {
public void sendNotification(String message) {
	System.out.println("Enviando e-mail: " + message);
}
}
