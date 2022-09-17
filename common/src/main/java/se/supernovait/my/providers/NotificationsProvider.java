package se.supernovait.my.providers;

import com.codename1.rad.models.AbstractEntityListProvider;
import com.codename1.rad.models.EntityList;
import se.supernovait.my.MyApp;
import se.supernovait.my.models.Notification;
import se.supernovait.my.services.NotificationService;

public class NotificationsProvider extends AbstractEntityListProvider {
    private final NotificationService notificationService = MyApp.getInstance().lookup(NotificationService.class);

    @Override
    public Request getEntities(Request request) {
        EntityList<Notification> response = notificationService.getNotifications();
        request.complete(response);
        return request;
    }
}
