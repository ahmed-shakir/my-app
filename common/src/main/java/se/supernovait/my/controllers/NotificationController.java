package se.supernovait.my.controllers;

import com.codename1.rad.controllers.Controller;
import com.codename1.rad.controllers.ViewController;
import com.codename1.rad.nodes.ActionNode;
import com.codename1.rad.ui.ViewContext;
import se.supernovait.my.NotificationDetailsPage;
import se.supernovait.my.NotificationDetailsPageController;
import se.supernovait.my.NotificationView;
import se.supernovait.my.models.Notification;
import se.supernovait.my.models.NotificationWrapper;
import se.supernovait.my.services.NotificationService;

public class NotificationController extends ViewController {
    private final NotificationService notificationService;

    public NotificationController(Controller parent) {
        super(parent);
        this.notificationService = lookup(NotificationService.class);
    }

    @Override
    protected void initControllerActions() {
        super.initControllerActions();

        ActionNode.builder()
                .addToController(this, NotificationView.VIEW_NOTIFICATION, e -> {
                    e.consume();
                    // TODO: implement

                    Notification notification = NotificationWrapper.wrap(e.getEntity());
                    NotificationDetailsPageController notificationDetailsPageController = new NotificationDetailsPageController(this, notification);
                    ViewContext<Notification> viewContext = notificationDetailsPageController.createViewContext(Notification.class, notification);
                    NotificationDetailsPage notificationDetailsPage = new NotificationDetailsPage(viewContext);
                    notificationDetailsPageController.setView(notificationDetailsPage);
                    notificationDetailsPageController.show();

                    notificationService.openNotification(notification.getId());
                    // TODO: ask for help, how to refresh/repaint list item view in codeRAD
                    /*e.getViewController().getView().refreshTheme();
                    e.getViewController().getView().repaint();
                    e.getActualComponent().repaint();*/
                });
    }
}
