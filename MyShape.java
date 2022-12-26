package Java.drawnRandomObjects;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape 
{
    private int x1, y1, x2, y2;

    private Color myColor;

    public MyShape(int x1, int y1, int x2, int y2, Color myColor)
    {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        setMyColor(myColor);  
    }

    public abstract void draw(Graphics paramGraphics);

    public int getX1()
    {
        return this.x1;
    }

    public void setX1(int x1)
    {
        this.x1 = (x1 >= 0) ? x1 : 0;
    }

    public int getY1()
    {
        return this.y1;
    }

    public void setY1(int y1)
    {
        this.y1 = (y1 >= 0) ? y1 : 0;
    }

    public int getX2()
    {
        return this.x2;
    }

    public void setX2(int x2)
    {
        this.x2 = (x2 >= 0) ? x2 : 0;
    }

    public int getY2()
    {
        return this.y2;
    }

    public void setY2(int y2)
    {
        this.y2 = (y2 >= 0) ? y2 : 0;
    }

    public Color getMyColor()
    {
        return this.myColor;
    }

    public void setMyColor(Color myColor)
    {
        this.myColor = myColor;
    }

}
