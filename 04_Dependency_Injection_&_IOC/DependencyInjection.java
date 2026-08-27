import javax.management.Notification;

import Notifications.EmailService;
import Notifications.NotificationService;

public class DependencyInjection {

    public static void main(String[] args) {
        
        NotificationService notification = new EmailService();
        OrderService order = new OrderService(notification);
        order.placeOrder();
    }
}