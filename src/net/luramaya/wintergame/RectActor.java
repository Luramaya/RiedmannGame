package net.luramaya.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.*;

public class RectActor implements Actor{
    private float x,y;

    private float width, height;

    public RectActor(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void update(GameContainer gameContainer, int delta){
        this.x++;
        this.y--;
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawRect(this.x, this.y, this.width, this.height);
    }
}
