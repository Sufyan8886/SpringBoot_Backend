import javax.management.Notification;

import Notifications.EmailService;
import Notifications.NotificationService;
import Notifications.SmsService;

public class OrderService{

    NotificationService notification;

        public OrderService(NotificationService notification) {
            this.notification = notification;
        }
    public  void placeOrder() {

        
        System.out.println("Order Notification sent. ");
        notification.sendNotification();
            }
}
