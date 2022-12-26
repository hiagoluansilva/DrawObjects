package Java.drawnRandomObjects;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyShape{

    private Color myColor2;
    
    public MyRectangle(int x1, int y1, int x2, int y2, Color myColor, Color myColor2) 
    {
        super(x1, y1, x2, y2, myColor);
        setMyColor2(myColor2);
    }

    @Override
    public void draw(Graphics paramGraphics) 
    {
        paramGraphics.setColor(getMyColor2());
        paramGraphics.fillRect(getX1(), getY1(), getX2(), getY2());
        paramGraphics.setColor(getMyColor());
        paramGraphics.drawRect(getX1(), getY1(), getX2(), getY2());
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
