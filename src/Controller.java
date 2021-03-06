/**
 * Created by Dwape on 3/3/17.
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controls the actions of all buttons and the opening and closing of windows. Created upon execution of the program, it
 * is in charge of creating all the windows and settings.
 */

public class Controller {

    private MainWindow menuWindow;
    private GameWindow gameWindow;
    private SettingsWindow settingsWindow;
    private Settings settings;

    /**
     * Creates a Controller, which then creates the windows providing them ActionListeners.
     */
    public Controller(){
        menuWindow = new MainWindow("Main Menu", startGame, openSettings, exit);
        gameWindow = new GameWindow("Game", back);
        settingsWindow = new SettingsWindow("Settings", back, turnSoundOn, turnSoundOff, turnMusicOn, turnMusicOff, toggleShadows, toggleAntiAliasing);
        settings = new Settings();
        menuWindow.showSelf();
    }

    /**
     * Prints the current values of the variables stored in settings.
     */
    public void printStatus(){
        if(settings.getSound()) System.out.println("Sound: On");
        else System.out.println("Sound: Off");
        if(settings.getMusic()) System.out.println("Music: On");
        else System.out.println("Music: Off");
        if(settings.getShadows()) System.out.println("Shadows: On");
        else System.out.println("Shadows: Off");
        if(settings.getAntiAliasing()) System.out.println("Anti-aliasing: On");
        else System.out.println("Anti-aliasing: Off");
    }

    /**
     * ActionListeners with the behaviour that each button will follow.
     */
    ActionListener back = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            gameWindow.hideSelf();
            settingsWindow.hideSelf();
            menuWindow.showSelf();
        }
    };

    ActionListener startGame = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            gameWindow.showSelf();
            menuWindow.hideSelf();
        }
    };

    ActionListener openSettings = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settingsWindow.showSelf();
            menuWindow.hideSelf();
        }
    };

    ActionListener exit = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            menuWindow.hideSelf();
            System.exit(0);
        }
    };

    ActionListener turnSoundOn = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.turnSoundOn();
            printStatus();
        }
    };

    ActionListener turnSoundOff = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.turnSoundOff();
            printStatus();
        }
    };

    ActionListener turnMusicOn = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.turnMusicOn();
            printStatus();
        }
    };

    ActionListener turnMusicOff = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.turnMusicOff();
            printStatus();
        }
    };

    ActionListener toggleShadows = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.toggleShadows();
            printStatus();
        }
    };

    ActionListener toggleAntiAliasing = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.toggleAntiAliasing();
            printStatus();
        }
    };
}
