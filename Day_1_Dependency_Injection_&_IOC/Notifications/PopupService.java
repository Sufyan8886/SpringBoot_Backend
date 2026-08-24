package Notifications;
public class PopupService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Popup notification sent.");
    }
}
