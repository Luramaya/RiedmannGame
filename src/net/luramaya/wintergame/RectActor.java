package net.luramaya.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor extends AbstractActor{
    private float width, height;

    public RectActor(MoveStrat moveStrat, float width, float height) {
        super(moveStrat);
        this.width = width;
        this.height = height;
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawRect(moveStrat.getX(), moveStrat.getY(), this.width, this.height);
    }
}
