package game.model;

import game.modelInterface.DiceInterface;

import java.util.Random;

public class Dice implements DiceInterface {
    private final Random random;

    public Dice() {
        this.random = new Random();
    }

    @Override
    public int rollRandomNumber() {
        return random.nextInt(6) + 1;
    }

}
