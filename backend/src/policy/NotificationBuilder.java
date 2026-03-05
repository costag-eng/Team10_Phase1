package policy;

import Users.User;
import java.time.LocalDateTime;
import java.util.UUID;

public class NotificationBuilder {

    private Notification notification;

    public void reset() {
        notification = new Notification(
            UUID.randomUUID().toString(),
            "",
            LocalDateTime.now(),
            0,
            null
        );
    }

    public void buildMessage(String msg) {
        notification = new Notification(
            notification.getId(),
            msg,
            notification.getTimestamp(),
            notification.getPriority(),
            notification.getRecipient()
        );
    }

    public void buildPriority(int priority) {
        notification = new Notification(
            notification.getId(),
            notification.getMessage(),
            notification.getTimestamp(),
            priority,
            notification.getRecipient()
        );
    }

    public void chooseUser(User user) {
        notification = new Notification(
            notification.getId(),
            notification.getMessage(),
            notification.getTimestamp(),
            notification.getPriority(),
            user
        );
    }

    public Notification build() {
        return notification;
    }
}
