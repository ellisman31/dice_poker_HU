package game;

import game.model.Cup;
import game.model.User;

import java.util.ArrayList;

public class Game {
    public Game() {
    }

    public void gameStart() {
        Cup newCup = new Cup();
        newCup.fillTheCupWithRolledNumbers();
        System.out.println(newCup.getRollNumbers());
        User user = new User(newCup);

    }
}
