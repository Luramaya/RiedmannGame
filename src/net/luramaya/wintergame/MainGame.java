package net.luramaya.wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    public MainGame(String title) {
        super(title);
    }

    private List<Actor> actors;

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        actors = new ArrayList<>();
        actors.add(new CircleActor(new MoveRight(10,20,2),  10));
        actors.add(new CircleActor(new MoveRight(20,20,3),  20));
        actors.add(new RectActor(2,2 40, 70));
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : actors) {
            actor.update(gameContainer, delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : actors) {
            actor.render(gameContainer, graphics);
        }
    }

    public static void main(String[] args) {

        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Anti"));
            container.setDisplayMode(800, 800, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
