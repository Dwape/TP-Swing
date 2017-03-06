import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Dwape on 3/3/17.
 */

/**
 * This window allows the user to modify the settings of the game with different types of buttons.
 */
public class SettingsWindow extends JFrame {

    /**
     * Creates a SettingsWindow with a title and several buttons.
     * @param title
     * @param back
     * @param turnSoundOn
     * @param turnSoundOff
     * @param turnMusicOn
     * @param turnMusicOff
     * @param toggleShadows
     * @param toggleAntiAliasing
     */
    public SettingsWindow(String title, ActionListener back, ActionListener turnSoundOn, ActionListener turnSoundOff, ActionListener turnMusicOn, ActionListener turnMusicOff, ActionListener toggleShadows, ActionListener toggleAntiAliasing){
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(new BorderLayout());
        //Buttons
        JButton backButton = new JButton("Back");
        backButton.addActionListener(back);
        add(backButton, BorderLayout.PAGE_END);

        JRadioButton soundOn = new JRadioButton("On");
        soundOn.addActionListener(turnSoundOn);
        JRadioButton soundOff = new JRadioButton("Off");
        soundOff.setSelected(true);
        soundOff.addActionListener(turnSoundOff);
        ButtonGroup soundButtons = new ButtonGroup();
        soundButtons.add(soundOn);
        soundButtons.add(soundOff);

        JRadioButton musicOn = new JRadioButton("On");
        musicOn.addActionListener(turnMusicOn);
        JRadioButton musicOff = new JRadioButton("Off");
        musicOff.setSelected(true);
        musicOff.addActionListener(turnMusicOff);
        ButtonGroup musicButtons = new ButtonGroup();
        musicButtons.add(musicOn);
        musicButtons.add(musicOff);

        JCheckBox shadows = new JCheckBox("Shadows");
        shadows.addActionListener(toggleShadows);

        JCheckBox antiAliasing = new JCheckBox("Anti-aliasing");
        antiAliasing.addActionListener(toggleAntiAliasing);

        //Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //Grid Panel
        JPanel gridPanel = new JPanel(new GridLayout(3, 3));
        gridPanel.add(new JLabel("Sound:"));
        gridPanel.add(soundOn);
        gridPanel.add(soundOff);
        gridPanel.add(new JLabel("Music:"));
        gridPanel.add(musicOn);
        gridPanel.add(musicOff);
        gridPanel.add(new JLabel("Graphics:"));
        gridPanel.add(shadows);
        gridPanel.add(antiAliasing);

        panel.add(gridPanel);
        panel.add(backButton);
        add(panel);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * Shows SettingsWindow.
     */
    public void showSelf(){
        setVisible(true);
    }

    /**
     * Hides SettingsWindow.
     */
    public void hideSelf(){
        setVisible(false);
    }
}
