/**
 * Created by Fantoche on 20/03/17.
 */

import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
    System.out.println("Hello World");
    JFrame mFrame = new JFrame("Hello");
    JLabel mLabel = new JLabel("Hello World");
    mFrame.setSize(200,200);
    mFrame.setLocationRelativeTo(null);
    mFrame.setLayout(new FlowLayout());
    mFrame.add(mLabel);
    SwingUtilities.updateComponentTreeUI(mFrame);
    mFrame.setVisible(true);
    mFrame.setDefaultCloseOperation(3);
    }
}