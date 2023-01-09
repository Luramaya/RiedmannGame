package net.luramaya.wintergame;

import org.newdawn.slick.GameContainer;

public class MoveRight {

    private float x, y;
    private float speed;

    public MoveRight(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(GameContainer gameContainer, int delta) {
        this.x += delta * speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }
}
