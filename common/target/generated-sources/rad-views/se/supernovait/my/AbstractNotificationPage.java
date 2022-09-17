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
    
@RAD
public abstract class AbstractNotificationPage<T extends Entity>  extends AbstractEntityView<T> {
    private static final String FRAGMENT_XML="<?xml version=\"1.0\" encoding=\"UTF-8\"?><border xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" rad-id=\"0\" uiid=\"WelcomePage\" xsi:noNamespaceSchemaLocation=\"NotificationPage.xsd\">\n    <import rad-id=\"1\">\n        import se.supernovait.my.providers.NotificationsProvider;\n    </import>\n\n    <title rad-id=\"2\">\n        <label rad-id=\"3\" text=\"Notifications\"/>\n    </title>\n\n    <entityList layout-constraint=\"center\" name=\"notifications\" provider=\"NotificationsProvider.class\" rad-id=\"4\">\n        <row-template rad-id=\"5\">\n            <notificationView rad-id=\"6\" view-model=\"rowModel\"/>\n        </row-template>\n    </entityList>\n</border>";
    public AbstractNotificationPage(ViewContext<T> context) {
        super(context);
    }

}
