package net.luramaya.wintergame;

import org.newdawn.slick.GameContainer;

public class MoveLeft implements MoveStrat{

    private float x, y;
    private float speed;

    public MoveLeft(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(GameContainer gameContainer, int delta) {
        this.x -= delta * speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
