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
public abstract class AbstractLoginPage<T extends Entity>  extends AbstractEntityView<T> {
    private static final String FRAGMENT_XML="<?xml version=\"1.0\" encoding=\"UTF-8\"?><border xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" componentForm.formBottomPaddingEditingMode=\"true\" rad-id=\"0\" safeArea=\"true\" view-controller=\"se.supernovait.my.controllers.LoginController\" xsi:noNamespaceSchemaLocation=\"LoginPage.xsd\">\n    <define-category name=\"LOGIN\" rad-id=\"1\"/>\n    <!-- Properties for login -->\n    <define-tag name=\"phoneEmailOrUsername\" rad-id=\"2\"/>\n    <define-tag name=\"password\" rad-id=\"3\"/>\n    <!-- Properties for error messages -->\n    <define-tag name=\"phoneEmailOrUsernameErrorMessage\" rad-id=\"4\"/>\n    <define-tag name=\"passwordErrorMessage\" rad-id=\"5\"/>\n\n    <title rad-id=\"6\">\n        <label fontIcon=\"(char)0xe900\" iconUIID=\"SupernovaIcon\" rad-id=\"7\"/>\n    </title>\n\n    <y layout-constraint=\"center\" rad-id=\"8\" scrollableY=\"true\" uiid=\"SignupPageContent\">\n        <label rad-id=\"9\" uiid=\"SignupPageTitle\">Login to MY</label>\n        <radTextField component.constraint=\"TextArea.USERNAME\" component.hint=\"Phone, email or username\" rad-id=\"10\" tag=\"phoneEmailOrUsername\"/>\n        <radLabel bind-hidden=\"${phoneEmailOrUsernameErrorMessage}.isEmpty()\" component.uiid=\"FieldErrorMessage\" rad-id=\"11\" rad-transition=\"hidden 0.3s\" tag=\"phoneEmailOrUsernameErrorMessage\"/>\n\n        <radTextField component.constraint=\"TextArea.PASSWORD\" component.hint=\"Password\" rad-id=\"12\" tag=\"password\"/>\n        <radLabel bind-hidden=\"${passwordErrorMessage}.isEmpty()\" component.uiid=\"FieldErrorMessage\" rad-id=\"13\" rad-transition=\"hidden 0.3s\" tag=\"passwordErrorMessage\"/>\n\n        <flow rad-id=\"14\">\n            <label rad-id=\"15\" uiid=\"SmallLabel\">Don't have an account yet?</label>\n            <button rad-href=\"#SignupPage\" rad-id=\"16\" uiid=\"SmallLink\">Sign up</button>\n        </flow>\n    </y>\n\n    <border layout-constraint=\"south\" rad-id=\"17\" uiid=\"SignupPageSouth\">\n        <x layout-constraint=\"west\" rad-id=\"18\">\n            <button rad-href=\"#ForgotPasswordPage\" rad-id=\"19\">Forgot Password?</button>\n        </x>\n        <x layout-constraint=\"east\" rad-id=\"20\">\n            <button bind-enabled=\"!${phoneEmailOrUsername}.isEmpty()\" rad-id=\"21\" text=\"Login\">\n                <bind-action category=\"LOGIN\" rad-id=\"22\"/>\n            </button>\n        </x>\n    </border>\n</border>";
    public AbstractLoginPage(ViewContext<T> context) {
        super(context);
    }

}
