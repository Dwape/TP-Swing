/**
 * Created by Dwape on 3/3/17.
 */

/**
 * Settings stores the values for the selected options in SettingsWindow, and adjusts them accordingly.
 */
public class Settings {

    private boolean sound;
    private boolean music;
    private boolean shadows;
    private boolean antiAliasing;

    /**
     * Creates Settings, with all its variables set to false.
     */
    public Settings(){
        sound = false;
        music = false;
        shadows = false;
        antiAliasing = false;
    }

    /**
     * Turns sound on.
     */
    public void turnSoundOn(){
        sound = true;
    }

    /**
     * Turns sound off.
     */
    public void turnSoundOff(){
        sound = false;
    }

    /**
     * Turns music on.
     */
    public void turnMusicOn(){
        music = true;
    }

    /**
     * Turns music off.
     */
    public void turnMusicOff(){
        music = false;
    }

    /**
     * Switches the value of shadows to its opposite value.
     */
    public void toggleShadows(){
        shadows = !shadows;
    }

    /**
     * Switches the value of antiAliasing to its opposite value.
     */
    public void toggleAntiAliasing(){
        antiAliasing = !antiAliasing;
    }

    public boolean getSound(){
        return sound;
    }

    public boolean getMusic(){
        return music;
    }

    public boolean getShadows(){
        return shadows;
    }

    public boolean getAntiAliasing(){
        return antiAliasing;
    }
}
