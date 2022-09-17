package se.supernovait.my.services;

import com.codename1.io.Log;
import com.codename1.io.Preferences;
import com.codename1.util.AsyncResource;

import java.util.Date;

public class AccountService {
    private static final String USER_ID_KEY = "loggedInUserId";
    private String loggedInUserId;

    public AccountService() {
        loadPreferences();
        Log.p("Preferences loaded", Log.INFO);
    }

    public boolean isLoggedIn() {
        return loggedInUserId != null;
    }

    public void loadPreferences() {
        loggedInUserId = Preferences.get(USER_ID_KEY, null);
    }

    public void logout() {
        saveCurrentUserId(null);
    }

    public SignupRequest createSignupRequest() {
        return new SignupRequest();
    }

    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    private void saveCurrentUserId(String loggedInUserId) {
        this.loggedInUserId = loggedInUserId;
        Preferences.set(USER_ID_KEY, loggedInUserId);
    }

    /**
     * Sends a signup request to the server.
     *
     * @since 1.0
     * @param request the signup request
     * @return the signup request
     */
    private SignupRequest signup(SignupRequest request) {
        // TODO
        return request;
    }

    /**
     * Sends a login request to the server.
     *
     * @since 1.0
     * @param request the login request
     * @return the login request
     */
    private LoginRequest login(LoginRequest request) {
        // TODO
        return request;
    }

    // #######################################################################################################################################

    /**
     * Encapsulates a signup request to send to the server. Modify this class to include the information you require in your signup process.
     */
    public class SignupRequest extends AsyncResource<String> {
        // The email address, phone number & name of the user.
        private String firstname, lastname, personId, username, email, phone;
        private Date birthDate;

        public SignupRequest firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public SignupRequest lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public SignupRequest personId(String personId) {
            this.personId = personId;
            return this;
        }

        public SignupRequest username(String username) {
            this.username = username;
            return this;
        }

        public SignupRequest email(String email) {
            this.email = email;
            return this;
        }

        public SignupRequest phone(String phone) {
            this.phone = phone;
            return this;
        }

        public SignupRequest birthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public SignupRequest signup() {
            return AccountService.this.signup(this);
        }
    }

    public class LoginRequest extends AsyncResource<String> {
        private String username, password;

        public LoginRequest username(String username) {
            this.username = username;
            return this;
        }

        public LoginRequest password(String password) {
            this.password = password;
            return this;
        }

        public LoginRequest login() {
            return AccountService.this.login(this);
        }
    }
}