package se.supernovait.my;

import com.codename1.rad.controllers.ApplicationController;
import com.codename1.rad.controllers.ControllerEvent;
import se.supernovait.my.providers.NotificationsProvider;
import se.supernovait.my.services.AccountService;
import se.supernovait.my.services.NotificationService;
import se.supernovait.my.services.SettingsService;

import static com.codename1.rad.util.NonNull.with;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */
public class MyApp extends ApplicationController {

    public void actionPerformed(ControllerEvent evt) {
        with(evt, StartEvent.class, startEvent -> {
            if (!startEvent.isShowingForm()) {
                startEvent.setShowingForm(true);

                AccountService accountService = lookup(AccountService.class);
                //new WelcomePageController(this).show();
                new NotificationPageController(this).show(); // TODO: Remove when login is in place

                if (accountService.isLoggedIn()) {
                    new NotificationPageController(this).show();
                }
            }
        });
        super.actionPerformed(evt);
    }

    @Override
    protected void onStartController() {
        super.onStartController();

        addLookup(new AccountService());
        addLookup(new SettingsService());
        addLookup(new NotificationService());
        addLookup(new NotificationsProvider());
    }

    @Override
    public void destroy() {
        super.destroy();

        // TODO: catch app close event to logout if activated in settings
        lookup(AccountService.class).logout();
    }
}
