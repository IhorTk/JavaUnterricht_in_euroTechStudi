package Hausaufgabe.Malen;

import javax.swing.*;
import java.awt.Graphics;

public class OvalComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(5,5,getWidth()-10,getHeight()-30);

    }
}
