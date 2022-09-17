package se.supernovait.my.controllers;

import com.codename1.rad.controllers.Controller;
import com.codename1.rad.controllers.ViewController;
import com.codename1.rad.nodes.ActionNode;
import com.codename1.rad.util.NonNull;
import se.supernovait.my.services.AccountService;
import se.supernovait.my.LoginPage;
import se.supernovait.my.LoginPageModel;
import se.supernovait.my.LoginPageModelWrapper;

public class LoginController extends ViewController {

    public LoginController(Controller parent) {
        super(parent);
    }

    @Override
    protected void initControllerActions() {
        super.initControllerActions();

        ActionNode.builder().addToController(this, LoginPage.LOGIN, this::handleSubmit);
    }

    /**
     * Handles the login form submission
     *
     * @since 1.0
     * @param event the incoming action event (e.g. button pushed)
     */
    private void handleSubmit(ActionNode.ActionNodeEvent event) {
        // Get reference to the view's model via the event.
        LoginPageModel loginPageModel = LoginPageModelWrapper.wrap(event.getEntity());
        // Get reference to the account webservice client
        AccountService accountService = lookup(AccountService.class);

        if (!validateForm(loginPageModel)) return;

        accountService.createLoginRequest()
                .username(loginPageModel.getPhoneEmailOrUsername())
                .password(loginPageModel.getPassword())
                .login();
    }

    private boolean validateForm(LoginPageModel loginPageModel) {
        boolean isValid = true;
        // Validate e-mail address or phone number or username
        if (NonNull.empty(loginPageModel.getPhoneEmailOrUsername())) {
            loginPageModel.setPhoneEmailOrUsernameErrorMessage("Please enter a non-empty username");
            isValid = false;
        }
        // Validate password
        if (NonNull.empty(loginPageModel.getPassword())) {
            loginPageModel.setPasswordErrorMessage("Please enter a password");
            isValid = false;
        }

        return isValid;
    }
}
