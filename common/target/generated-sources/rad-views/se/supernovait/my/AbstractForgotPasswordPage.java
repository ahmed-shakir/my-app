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
public abstract class AbstractForgotPasswordPage<T extends Entity>  extends AbstractEntityView<T> {
    private static final String FRAGMENT_XML="<?xml version=\"1.0\" encoding=\"UTF-8\"?><y xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" rad-id=\"0\" xsi:noNamespaceSchemaLocation=\"ForgotPasswordPage.xsd\">\n    <title rad-id=\"1\">\n        <label rad-id=\"2\" text=\"Forgot password\"/>\n    </title>\n\n    <label rad-id=\"3\" text=\"Under construction\"/>\n</y>";
    public AbstractForgotPasswordPage(ViewContext<T> context) {
        super(context);
    }

}
