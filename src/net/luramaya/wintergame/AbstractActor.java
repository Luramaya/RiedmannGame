package net.luramaya.wintergame;

import org.newdawn.slick.GameContainer;

public abstract class AbstractActor implements Actor{
    protected MoveStrat moveStrat;

    public AbstractActor(MoveStrat moveStrat) {
        this.moveStrat = moveStrat;
    }

    public void update(GameContainer gameContainer, int delta) {
        moveStrat.update(gameContainer, delta);
    }
}
