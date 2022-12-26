package Java.drawnRandomObjects;

import java.awt.Color;
import java.awt.Graphics;

public class MyTriangle extends MyShape {

    private Color myColor2;

    int i;
    
    public MyTriangle(int x1, int y1, int x2, int y2, Color myColor, Color myColor2) 
    {
        super(x1, y1, x2, y2, myColor);
        setMyColor2(myColor2);
    }

    @Override
    public void draw(Graphics paramGraphics) 
    {
        paramGraphics.setColor(getMyColor2());

        for (i = (getX1() - (getY2()/2)); i <= (getX1() + (getY2()/2)); i++) 
        {
            paramGraphics.drawLine(i, getY1() + getX2(), getX1(), getY1());     
        }
        
        paramGraphics.setColor(getMyColor());
        paramGraphics.drawLine(getX1(), getY1(), getX1() + (getY2()/2), getY1() + getX2());
        paramGraphics.drawLine(getX1(), getY1(), getX1() - (getY2()/2), getY1() + getX2());
        paramGraphics.drawLine(getX1() + (getY2()/2), getY1() + getX2(), getX1() - (getY2()/2), getY1() + getX2());
    }

    public Color getMyColor2()
    {
        return myColor2;
    }

    public void setMyColor2(Color myColor2)
    {
        this.myColor2 = myColor2;
    }
    
}
