package Java.drawnRandomObjects;

import java.awt.Graphics;
import java.awt.Color;

public class MyLine extends MyShape
{

    public MyLine(int x1, int y1, int x2, int y2, Color myColor) {
        super(x1, y1, x2, y2, myColor);
    }

    @Override
    public void draw(Graphics paramGraphics) 
    {
        paramGraphics.setColor(getMyColor());
        paramGraphics.drawLine(getX1(), getY1(), getX2(), getY2());
    }  

}
