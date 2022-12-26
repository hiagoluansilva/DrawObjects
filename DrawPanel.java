package Java.drawnRandomObjects;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DrawPanel extends JPanel 
{
    ArrayList<MyShape> shapes = new ArrayList<MyShape>();
    
    private static int size = 600;
    
    private Random rand = new Random();

    Scanner sc = new Scanner(System.in);

    int qtdTemp, i, rectangles, ovals, triangles, lines;
    
    public DrawPanel()
    {
        setBackground(Color.lightGray);

        this.qtdTemp = MMI("retangulo");
        
        for (i = 0; i < qtdTemp; i++) 
        {
            shapes.add
            (
                new MyRectangle
                (
                    (rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)))
                    ,(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)))
                )
            );

            rectangles++;
        } 

        this.qtdTemp = MMI("oval");
        
        for (i = 0; i < qtdTemp; i++) 
        {
            shapes.add
            (
                new MyOval
                (
                    (rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255))
                    ,new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255))
                )
            );

            ovals++;
        } 

        this.qtdTemp = MMI("triangulo");
        
        for (i = 0; i < qtdTemp; i++) 
        {
            shapes.add
            (
                new MyTriangle
                (
                    (rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255))
                    ,new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255))
                )
            );

            triangles++;
        } 
        
        this.qtdTemp = MMI("linha");
        
        for (i = 0; i < qtdTemp; i++) 
        {
            shapes.add
            (
                new MyLine
                (
                    (rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,(rand.nextInt(size))
                    ,(rand.nextInt(size))
                    , new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255))
                )
            );

            lines++;
        }

    }

    public int MMI(String shapeName)
    {
        int qtd = -1;

        while(qtd < 0)
        {
            System.out.println("Quantos formas do tipo " + shapeName + " deseja?");
            qtd = sc.nextInt();
        }
        
        return qtd;
    }

    public void paintComponent(Graphics g) 
    {
        for (MyShape shape : shapes) 
        {
            shape.draw(g);    
        }
    }

    public String LabelText() 
    {
        return String.format("Rectangles: %d, Ovals: %d, Triangles: %d, Lines: %d", this.rectangles, this.ovals, this.triangles, this.lines);
    }

    

}
