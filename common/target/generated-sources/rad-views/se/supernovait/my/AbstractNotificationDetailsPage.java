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
    
@RAD
public abstract class AbstractNotificationDetailsPage<T extends Notification>  extends AbstractEntityView<T> {
    private static final String FRAGMENT_XML="<?xml version=\"1.0\" encoding=\"UTF-8\"?><y xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" rad-id=\"0\" rad-model=\"Notification\" xsi:noNamespaceSchemaLocation=\"NotificationDetailsPage.xsd\">\n    <import rad-id=\"1\">\n        import se.supernovait.my.models.Notification;\n        import se.supernovait.my.services.NotificationService;\n    </import>\n\n    <title rad-id=\"2\">\n        <label rad-id=\"3\" text=\"Notification\"/>\n    </title>\n\n    <y rad-id=\"4\">\n        <y rad-id=\"5\">\n            <label rad-id=\"6\" text=\"Title:\"/>\n            <radSpanLabel rad-id=\"7\" tag=\"Notification.title\"/>\n\n            <label rad-id=\"8\" text=\"Body:\"/>\n            <radSpanLabel rad-id=\"9\" tag=\"Notification.body\"/>\n\n            <label rad-id=\"10\" text=\"Timestamp:\"/>\n            <radLabel dateFormat=\"ShortDate\" rad-id=\"11\" tag=\"Notification.timestamp\"/>\n        </y>\n    </y>\n</y>";
    public AbstractNotificationDetailsPage(ViewContext<T> context) {
        super(context);
    }

}
