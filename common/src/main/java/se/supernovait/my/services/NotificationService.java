package se.supernovait.my.services;

import com.codename1.rad.models.EntityList;
import se.supernovait.my.models.Notification;
import se.supernovait.my.models.NotificationImpl;

import java.util.Date;

public class NotificationService {
    private final EntityList<Notification> notifications;

    public NotificationService() {
        this.notifications = getMockedNotification();
    }

    public void openNotification(String id) {
        for(Notification notification : notifications) {
            if(notification.getId().equals(id) && notification.isNew()) {
                notification.setNew(false);
                return;
            }
        }
    }

    public int getUnreadNotificationsQty() {
        int unreadNotificationsQty = 0;
        for(Notification notification : notifications) {
            if(notification.isNew()) {
                unreadNotificationsQty++;
            }
        }
        return unreadNotificationsQty;
    }

    public boolean hasUnreadNotifications() {
        return getUnreadNotificationsQty() > 0;
    }

    public EntityList<Notification> getNotifications() {
        return getMockedNotification();
    }

    private EntityList<Notification> getMockedNotification() { // TODO: remove when API is in place
        EntityList<Notification> notifications = new EntityList<>();

        Notification notification = new NotificationImpl();
        notification.setId("123");
        notification.setTitle("New item");
        notification.setBody("Try out the new item");
        notification.setTimestamp(new Date());
        notification.setNew(true);
        notifications.add(notification);

        notification = new NotificationImpl();
        notification.setId("234");
        notification.setTitle("New item");
        notification.setBody("Try out the new item");
        notification.setTimestamp(new Date());
        notification.setNew(false);
        notifications.add(notification);

        notification = new NotificationImpl();
        notification.setId("345");
        notification.setTitle("New item");
        notification.setBody("Try out the new item");
        notification.setTimestamp(new Date());
        notification.setNew(false);
        notifications.add(notification);

        notification = new NotificationImpl();
        notification.setId("456");
        notification.setTitle("New item");
        notification.setBody("Try out the new item");
        notification.setTimestamp(new Date());
        notification.setNew(true);
        notifications.add(notification);

        return notifications;
    }
}
