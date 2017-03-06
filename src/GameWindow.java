/**
 * Created by Dwape on 3/3/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Displays an image of a game, can be accessed from the MainWindow.
 */

public class GameWindow extends JFrame{

    /**
     * Creates a GameWindow with a title, an image and a "back" button.
     * @param title
     * @param back
     */
    public GameWindow(String title, ActionListener back){
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(false);
        setLayout(new BorderLayout());
        //Button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(back);
        add(backButton, BorderLayout.PAGE_END);
        //Image
        ImageIcon image = new ImageIcon("Images/spaceinvaders.jpg");
        //resize image
        Image image1 = image.getImage();
        Image newImage = image1.getScaledInstance(480, 270,  java.awt.Image.SCALE_SMOOTH);
        image = new ImageIcon(newImage);
        JLabel thumb = new JLabel();
        thumb.setIcon(image);
        add(thumb, BorderLayout.CENTER);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * Shows GameWindow.
     */
    public void showSelf(){
        setVisible(true);
    }

    /**
     * Hides GameWindow.
     */
    public void hideSelf(){
        setVisible(false);
    }
}
