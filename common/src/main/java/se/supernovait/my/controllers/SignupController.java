package se.supernovait.my.controllers;

import com.codename1.components.ToastBar;
import com.codename1.rad.controllers.Controller;
import com.codename1.rad.controllers.ViewController;
import com.codename1.rad.nodes.ActionNode;
import com.codename1.rad.util.NonNull;
import se.supernovait.my.SignupPage;
import se.supernovait.my.SignupPageModel;
import se.supernovait.my.SignupPageModelWrapper;
import se.supernovait.my.services.AccountService;

public class SignupController extends ViewController {

    public SignupController(Controller parent) {
        super(parent);
    }

    @Override
    protected void initControllerActions() {
        super.initControllerActions();

        ActionNode.builder().addToController(this, SignupPage.NEXT, this::handleSubmit);
    }

    /**
     * Handles the signup form submission
     *
     * @since 1.0
     * @param event the incoming action event (e.g. button pushed)
     */
    private void handleSubmit(ActionNode.ActionNodeEvent event) {
        // Get reference to the view's model via the event.
        SignupPageModel signupPageModel = SignupPageModelWrapper.wrap(event.getEntity());
        // Get reference to the account webservice client
        AccountService accountService = lookup(AccountService.class);

        if (!validateForm(signupPageModel)) return;

        AccountService.SignupRequest request = accountService.createSignupRequest()
                .firstname(signupPageModel.getFirstname())
                .lastname(signupPageModel.getLastname())
                .username(signupPageModel.getFirstname())
                .birthDate(signupPageModel.getBirthDate());

        if (signupPageModel.isUseEmail()) {
            request.email(signupPageModel.getEmail());
        } else {
            request.phone(signupPageModel.getPhone());
        }
        request.signup();

        ToastBar.showInfoMessage("User registered");
    }

    private boolean validateForm(SignupPageModel signupPageModel) {
        boolean isValid = true;
        // Validate e-mail address or phone number
        if (signupPageModel.isUseEmail() && NonNull.empty(signupPageModel.getEmail())) {
            signupPageModel.setPhoneOrEmailErrorMessage("Email address cannot be empty");
            isValid = false;
        } else if (!signupPageModel.isUseEmail() && NonNull.empty(signupPageModel.getPhone())) {
            signupPageModel.setPhoneOrEmailErrorMessage("Phone cannot be empty");
            isValid = false;
        } else {
            signupPageModel.setPhoneOrEmailErrorMessage("");
        }

        // Validate firstname
        if (NonNull.empty(signupPageModel.getFirstname())) {
            signupPageModel.setFirstnameErrorMessage("Firstname cannot be empty");
            isValid = false;
        } else {
            signupPageModel.setFirstnameErrorMessage("");
        }

        // Validate lastname
        if (NonNull.empty(signupPageModel.getLastname())) {
            signupPageModel.setLastnameErrorMessage("Lastname cannot be empty");
            isValid = false;
        } else {
            signupPageModel.setLastnameErrorMessage("");
        }

        // Validate person ID
        if (NonNull.empty(signupPageModel.getPersonId())) {
            signupPageModel.setPersonIdErrorMessage("Person ID cannot be empty");
            isValid = false;
        } else {
            signupPageModel.setPersonIdErrorMessage("");
        }

        // Validate username
        if (NonNull.empty(signupPageModel.getUsername())) {
            signupPageModel.setUsernameErrorMessage("Username cannot be empty");
            isValid = false;
        } else {
            signupPageModel.setUsernameErrorMessage("");
        }

        // Validate birthdate
        if (NonNull.empty(signupPageModel.getBirthDate())) {
            signupPageModel.setBirthDateErrorMessage("Birthdate cannot be empty");
            isValid = false;
        } else {
            signupPageModel.setBirthDateErrorMessage("");
        }

        return isValid;
    }
}
