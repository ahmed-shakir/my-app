package se.supernovait.my;
import com.codename1.rad.annotations.RAD;
import com.codename1.rad.ui.AbstractEntityView;
import com.codename1.rad.ui.EntityView;
import com.codename1.rad.models.Entity;
import com.codename1.rad.nodes.Node;
import com.codename1.io.CharArrayReader;
import com.codename1.rad.ui.ViewContext;

        import se.supernovait.my.services.SettingsService;
        import se.supernovait.my.controllers.SettingsController;
    
@RAD
public abstract class AbstractLanguageSettingsPage<T extends Entity>  extends AbstractEntityView<T> {
    private static final String FRAGMENT_XML="<?xml version=\"1.0\" encoding=\"UTF-8\"?><y xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" rad-id=\"0\" uiid=\"MyPage\" view-controller=\"SettingsController\" xsi:noNamespaceSchemaLocation=\"LanguageSettingsPage.xsd\">\n    <import rad-id=\"1\">\n        import se.supernovait.my.services.SettingsService;\n        import se.supernovait.my.controllers.SettingsController;\n    </import>\n    <var lookup=\"SettingsService\" name=\"settingsService\" rad-id=\"2\"/>\n    <define-category name=\"LANGUAGE\" rad-id=\"3\"/>\n\n    <title rad-id=\"4\">\n        <label rad-id=\"5\" text=\"Language settings\"/>\n    </title>\n\n    <y rad-id=\"6\" uiid=\"MySection\">\n        <radioButton name=\"sv\" rad-id=\"7\" rad-var=\"sv\" text=\"Svenska\" uiid=\"MySettingsAction\">\n            <bind-action category=\"LANGUAGE\" rad-id=\"8\"/>\n        </radioButton>\n        <radioButton name=\"en\" rad-id=\"9\" rad-var=\"en\" text=\"English\" uiid=\"MySettingsAction\">\n            <bind-action category=\"LANGUAGE\" rad-id=\"10\"/>\n        </radioButton>\n    </y>\n\n    <script rad-id=\"11\">\n        /* Add buttons to a ButtonGroup so only one can be selected at a time. */\n        new ButtonGroup(sv, en);\n        sv.setSelected(settingsService.isSelectedLanguage(\"sv\"));\n        en.setSelected(settingsService.isSelectedLanguage(\"en\"));\n    </script>\n</y>";
    public AbstractLanguageSettingsPage(ViewContext<T> context) {
        super(context);
    }

}
