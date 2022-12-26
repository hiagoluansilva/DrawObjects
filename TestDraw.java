package Java.drawnRandowObjects;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestDraw 
{
    public static void main(String[] args) 
    {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();
        JLabel label = new JLabel(panel.LabelText());

        application.setTitle("TestDraw");
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.add(label, "South");
        application.setSize(900, 900);
        application.setVisible(true);
    }
}