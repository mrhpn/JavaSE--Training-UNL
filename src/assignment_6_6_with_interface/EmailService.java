package assignment_6_6_with_interface;

public class EmailService implements NotificationService {

	@Override
	public void notify(User owner) {
		System.out.println("Send mail to user...");
	}
}
