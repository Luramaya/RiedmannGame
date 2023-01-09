package net.luramaya.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class CircleActor implements Actor{

    private MoveRight moveRight;

    private float diameter;

    public CircleActor(MoveRight moveRight, float diameter) {
        this.moveRight = moveRight;
        this.diameter = diameter;
    }

    public void update(GameContainer gameContainer, int delta){
        moveRight.update(gameContainer, delta);
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawOval(moveRight.getX(), moveRight.getY(), this.diameter, this.diameter);
    }

}
