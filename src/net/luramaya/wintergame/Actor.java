package net.luramaya.wintergame;

import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    public void update(GameContainer gameContainer, int delta);
    public void render(GameContainer gameContainer, Graphics graphics);
}
