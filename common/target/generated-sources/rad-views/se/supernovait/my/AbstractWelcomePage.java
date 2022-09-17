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
public abstract class AbstractWelcomePage<T extends Entity>  extends AbstractEntityView<T> {
    private static final String FRAGMENT_XML="<?xml version=\"1.0\" encoding=\"UTF-8\"?><border xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" rad-id=\"0\" uiid=\"WelcomePage\" xsi:noNamespaceSchemaLocation=\"WelcomePage.xsd\">\n    <title rad-id=\"1\">\n        <label rad-id=\"2\" text=\"Items manager\"/>\n    </title>\n\n    <y layout-constraint=\"center\" rad-id=\"3\">\n        <spanLabel rad-id=\"4\" textUIID=\"WelcomeLabel\">Make everything fun, experience an easier and better items manager.</spanLabel>\n        <button rad-href=\"#SignupPage\" rad-id=\"5\" uiid=\"NewAccountButton\">Create account</button>\n        <flow rad-id=\"6\">\n            <label rad-id=\"7\" uiid=\"SmallLabel\">Have an account already?</label>\n            <button rad-href=\"#LoginPage\" rad-id=\"8\" uiid=\"SmallLink\">Log in</button>\n        </flow>\n    </y>\n\n    <center layout-constraint=\"south\" rad-id=\"9\">\n        <flow rad-id=\"10\" rad-leadComponent=\"#ShowInfoAction\">\n            <button materialIcon=\"FontImage.MATERIAL_INFO_OUTLINE\" name=\"ShowInfoAction\" rad-id=\"11\"/>\n        </flow>\n    </center>\n</border>";
    public AbstractWelcomePage(ViewContext<T> context) {
        super(context);
    }

}
