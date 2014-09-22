package app.sunny.citmusa.com.sunny;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

/**
 * A {@link PreferenceActivity} that presents a set of application settings.
 * <p>
 * See <a href="http://developer.android.com/design/patterns/settings.html">
 * Android Design: Settings</a> for design guidelines and the <a
 * href="http://developer.android.com/guide/topics/ui/settings.html">Settings
 * API Guide</a> for more information on developing a Settings UI.
 */
public class SettingsActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Add 'general' preferences, defined in the XML file
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_general);
        PreferenceManager.setDefaultValues(this, R.xml.pref_general, false);
    }
}