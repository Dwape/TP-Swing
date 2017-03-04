/**
 * Created by Dwape on 3/2/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    public MainWindow(String title, ActionListener startGame, ActionListener settings, ActionListener exit){
        setTitle(title);
        addPanels(startGame, settings, exit);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void showSelf(){
        setVisible(true);
    }

    public void hideSelf(){
        setVisible(false);
    }

    public void addPanels(ActionListener startGame, ActionListener settings, ActionListener exit){
        JPanel panel1 = new JPanel(new BorderLayout());

        JLabel subtitle = new JLabel("Trabajo Práctico Swing");
        JLabel name1 = new JLabel("Eduardo Lalor");
        JLabel name2 = new JLabel("Gianluca Scolaro");

        panel1.add(subtitle,BorderLayout.PAGE_START);
        panel1.add(name1, BorderLayout.LINE_START);
        panel1.add(name2, BorderLayout.LINE_END);

        add(panel1);

        JPanel panel2 = new JPanel(new FlowLayout());

        JButton startGameButton = new JButton("Start Game");
        startGameButton.addActionListener(startGame);

        JButton settingsButton = new JButton("Settings");
        settingsButton.addActionListener(settings);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(exit);

        panel2.add(startGameButton);
        panel2.add(settingsButton);
        panel2.add(exitButton);

        panel1.add(panel2, BorderLayout.PAGE_END);
    }
}

