// Class author: Rayan Hashmi
// Date created: 12/16/25
// General description: It's the paddle, controlled by the player, in Brick Break.
// The paddle moves left to right and is controlled via keyboard


package com.BrickBreak;
import java.awt.*;

public class Paddle {

    // Instance variables
    private int x;
    private int y;
	private int vel; //velocity
    private int width;
    private int height;

    // Pre-condition: variables x, y, width, and height must be valid screen values
    // Post-condition: Paddle created at given pos with no movement
    
    public Paddle(int x, int y, int width, int height) {
       
		this.width = width;
        this.height = height;
		this.x = x;
        this.y = y;
        vel = 0;
    }

    
    // Pre-condition: none
    // Post-condition: Paddle moves left to right
    
    public void move() {
        x += vel;
    }

    
    // Pre-condition: Graphics object not null
    // Post-condition: Paddle drawn on screen
    
    public void draw(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);

    }

    
    // Pre-condition: v is valid velocity value
    // Post-condition: Paddle velocity set to v
    
    public void addVelocity(int v) {
        vel = v; 
    }


    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }

    public int getVelocity() {
        return vel;
    }
    
    public void setVelocity(int v) {
        vel = v;
    }
    
    public void setX(int x) {
        this.x = x;
    }
}