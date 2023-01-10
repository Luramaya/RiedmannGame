package net.luramaya.wintergame;

import org.newdawn.slick.GameContainer;

public interface MoveStrat {

    float getX();

    float getY();

    void update(GameContainer gameContainer, int delta);

}
