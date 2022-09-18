package se.supernovait.my.controllers;

import com.codename1.rad.controllers.Controller;
import com.codename1.rad.controllers.ViewController;
import com.codename1.rad.nodes.ActionNode;
import com.codename1.ui.RadioButton;
import se.supernovait.my.LanguageSettingsPage;
import se.supernovait.my.services.SettingsService;

/**
 * Logic for the settings views
 *
 * @author Ahmed Shakir
 * @version 1.0
 * @since 2022-01-09
 */
public class SettingsController extends ViewController {
    private final SettingsService settingsService = lookup(SettingsService.class);

    public SettingsController(Controller parent) {
        super(parent);
    }

    @Override
    protected void initControllerActions() {
        super.initControllerActions();

        ActionNode.builder()
                .addToController(this, LanguageSettingsPage.LANGUAGE, e -> {
                    e.consume();
                    RadioButton radioButton = (RadioButton) e.getSource();
                    String name = radioButton.getName();
                    if(radioButton.isSelected() && !settingsService.isSelectedLanguage(name)) {
                        settingsService.setSelectedLanguage(name);
                    }
                });
    }
}
