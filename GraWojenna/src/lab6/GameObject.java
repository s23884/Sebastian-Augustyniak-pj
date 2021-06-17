package lab6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;

/**
 *
 * @author sebik
 */
public abstract class GameObject {
    
    protected int width, height;
    protected int x, y;
    protected Type type;

    protected Image imageSzer = Toolkit.getDefaultToolkit().createImage("szeregowy1.png");
    protected Image imageKapr = Toolkit.getDefaultToolkit().createImage("karl.png");
    protected Image imageKap = Toolkit.getDefaultToolkit().createImage("kap.png");
    protected Image imageMaj = Toolkit.getDefaultToolkit().createImage("maj.png");
    protected Image imageEmpty = Toolkit.getDefaultToolkit().createImage("background1.png");

    public GameObject(int width, int height, int x, int y, Type type)
    {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
        this.type = type;
    }
    
    public abstract void render(Graphics graphics);
    
    public abstract void tick();
    
    public int getX(){ return x; }
    public int getY(){ return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setXY(int x, int y) { this.x = x; this.y = y; }
    
    public enum Type
    {
        Szeregowy,
        General,
        Empty,
    }
    
    public enum Strona
    {
        Niebieska,
        Czerwa
    }
    
}
