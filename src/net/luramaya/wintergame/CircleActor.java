package net.luramaya.wintergame;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor extends AbstractActor {

    private float diameter;

    public CircleActor(MoveStrat moveStrat, float diameter) {
        super(moveStrat);
        this.diameter = diameter;
    }


    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.drawOval(moveStrat.getX(), moveStrat.getY(), this.diameter, this.diameter);
    }

}
