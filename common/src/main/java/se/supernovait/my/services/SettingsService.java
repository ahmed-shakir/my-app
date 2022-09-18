package se.supernovait.my.services;

import com.codename1.io.Preferences;

public class SettingsService {
    private static final String DEFAULT_LANGUAGE = "sv";
    private static final String LANGUAGE_ID_KEY = "selectedLanguage";

    public String getSelectedLanguage() {
        return Preferences.get(LANGUAGE_ID_KEY, DEFAULT_LANGUAGE);
    }

    public void setSelectedLanguage(String language) {
        Preferences.set(LANGUAGE_ID_KEY, language);
    }

    public boolean isSelectedLanguage(String language) {
        return getSelectedLanguage().equals(language);
    }
}
