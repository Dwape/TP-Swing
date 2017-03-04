/**
 * Created by Dwape on 3/3/17.
 */
public class Settings {

    private boolean sound;
    private boolean music;
    private boolean shadows;
    private boolean antiAliasing;

    public Settings(){
        sound = false;
        music = false;
        shadows = false;
        antiAliasing = false;
    }

    public void turnSoundOn(){
        sound = true;
    }

    public void turnSoundOff(){
        sound = false;
    }

    public void turnMusicOn(){
        music = true;
    }

    public void turnMusicOff(){
        music = false;
    }

    public void toggleShadows(){
        shadows = !shadows;
    }

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
