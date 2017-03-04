/**
 * Created by Dwape on 3/3/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame{

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
        JLabel thumb = new JLabel();
        thumb.setIcon(image);
        add(thumb, BorderLayout.CENTER);
        pack();
    }

    public void showSelf(){
        setVisible(true);
    }

    public void hideSelf(){
        setVisible(false);
    }
}
