
// Class author: Rayan Hashmi
// Date created: 12/16/25
// General description: Class that manages ball in the game.

package com.BrickBreak;
import java.awt.*;

public class Ball {

    // Instance variables
    private int x;
    private int y;
    private int dx;
    private int dy;
	private int size;

    
    // Pre-condition: variables x y and size must be valid screen values
    // Post-condition: Ball object created with starting velocity
    
    public Ball(int x, int y, int size) {
        
		this.x = x;
        this.y = y;
        this.size = size;
        dx = 1;
        dy = -2;

    }

    
    // Pre-condition: none
    // Post-condition: Ball position changed based on velocity
    
    public void move() {
        x = x + dx;
        y += dy;
    }

    
    // Pre-condition: Graphics object not null
    // Post-condition: Ball drawn (on screen)
    
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, size, size);
    }

    
    // Pre-condition: none
    // Post-condition: Up down (vertical) direction of ball reversed
    
    public void reverseY() {
        dy = -dy;
    }

    
    // Pre-condition: none
    // Post-condition: Left right (horizontal) direction of ball reversed
    
    public void reverseX() {
        dx = -dx;
    }

    public int getXpos() {
        return x;
    }
    
    public int getYpos() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setXVelocity(int dx) {
        this.dx = dx;
    }

    public void setYVelocity(int dy) {
        this.dy = dy;
    }
}