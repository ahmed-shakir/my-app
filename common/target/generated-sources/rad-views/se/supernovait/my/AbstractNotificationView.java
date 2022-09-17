package se.supernovait.my;
import com.codename1.rad.annotations.RAD;
import com.codename1.rad.ui.AbstractEntityView;
import com.codename1.rad.ui.EntityView;
import com.codename1.rad.models.Entity;
import com.codename1.rad.nodes.Node;
import com.codename1.io.CharArrayReader;
import com.codename1.rad.ui.ViewContext;

        import se.supernovait.my.models.Notification;
        import se.supernovait.my.services.NotificationService;
    

        import se.supernovait.my.providers.NotificationsProvider;
    

        import se.supernovait.my.controllers.NotificationController;
        import se.supernovait.my.models.Notification;
        import se.supernovait.my.services.NotificationService;
    
@RAD
public abstract class AbstractNotificationView<T extends Notification>  extends AbstractEntityView<T> {
    private static final String FRAGMENT_XML="<?xml version=\"1.0\" encoding=\"UTF-8\"?><y xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" rad-id=\"0\" rad-model=\"Notification\" view-controller=\"NotificationController\" xsi:noNamespaceSchemaLocation=\"NotificationView.xsd\">\n    <import rad-id=\"1\">\n        import se.supernovait.my.controllers.NotificationController;\n        import se.supernovait.my.models.Notification;\n        import se.supernovait.my.services.NotificationService;\n    </import>\n    <var lookup=\"NotificationService\" name=\"notificationService\" rad-id=\"2\"/>\n    <define-category name=\"VIEW_NOTIFICATION\" rad-id=\"3\"/>\n\n    <border rad-id=\"4\" rad-leadComponent=\"#ShowDetailsButton\">\n        <button hidden=\"true\" layout-constraint=\"north\" name=\"ShowDetailsButton\" rad-href=\"#NotificationDetailsPage{context.getEntity()}\" rad-id=\"5\" rad-var=\"button\">\n            <bind-action category=\"VIEW_NOTIFICATION\" rad-id=\"6\"/>\n        </button>\n        <label layout-constraint=\"west\" materialIcon=\"FontImage.MATERIAL_INFO\" rad-id=\"7\"/>\n        <radLabel component.badgeUIID=\"MyBadge\" component.uiid=\"MyH2\" layout-constraint=\"center\" rad-id=\"8\" rad-var=\"notification\" tag=\"Notification.title\"/>\n    </border>\n\n    <script rad-id=\"9\">\n        notification.getComponent().setBadgeText(context.getEntity().isNew() ? \" \" : \"\");\n        /*button.addActionListener(e -&gt; {\n            notificationService.openNotification(context.getEntity().getId()); // TODO: refresh view\n        });*/\n    </script>\n</y>";
    public AbstractNotificationView(ViewContext<T> context) {
        super(context);
    }

}
