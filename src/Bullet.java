import org.w3c.dom.css.Rect;

import java.awt.*;

public class Bullet {

    int x, y, diameter = 10;
    int speed, dx, dy = 10;
    boolean remove;

    public Bullet(Player player){

        x = player.getX() + player.getWIDTH()/2 - diameter/2;
        y = player.getY() - diameter;
    }

    public void move(){
        y-=dy;
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, diameter, diameter);
    }

    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x, y, diameter, diameter);
    }

    public int getY(){
        return y;
    }

    public void setRemove(){
        remove = true;
    }
    public boolean getRemove(){
        return remove;
    }

}