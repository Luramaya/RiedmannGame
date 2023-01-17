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
        actors.add(new CircleActor(new MoveLeft(960,500, 0),200));
        actors.add(new CircleActor(new MoveRight(950,200,0.4f),  100));
        actors.add(new CircleActor(new MoveLeft(950,300,0.4f),  200));
        actors.add(new RectActor(new MoveLeft(950, 400, 0.2f), 100,100));
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
            container.setDisplayMode(1920, 1000, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
