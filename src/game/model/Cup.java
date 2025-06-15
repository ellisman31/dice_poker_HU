package game.model;

import game.modelInterface.CupInterface;

import java.util.ArrayList;

public class Cup implements CupInterface {
    private Dice dice;
    private ArrayList<Integer> rollNumbers;

    public Cup() {
        this.dice = new Dice();
        this.rollNumbers = new ArrayList<>();
    }

    @Override
     public void fillTheCupWithRolledNumbers() {
        int rollRandomNumberCounter = 0;
        int maxRandomNumberSize = 5;
        while(maxRandomNumberSize > rollRandomNumberCounter) {
            rollNumbers.add(getDice().rollRandomNumber());
            rollRandomNumberCounter++;
        }
    }

    @Override
    public void rerollSpecificRolledNumbers(boolean isRerollNumber, ArrayList<Integer> rerollNumberIndex) {
        while(isRerollNumber) {
            for (Integer numberIndex : rerollNumberIndex) {
                int randomNumber = getDice().rollRandomNumber();
                setRollNumberIfNewRoll(randomNumber, numberIndex);
            }
            isRerollNumber = false;
        }
    }


    private void setRollNumberIfNewRoll(int randomRollNumber, int newNumberIndex) {
        rollNumbers.set(newNumberIndex, randomRollNumber);
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }


    public ArrayList<Integer> getRollNumbers() {
        return rollNumbers;
    }

    public void setRollNumbers(ArrayList<Integer> rollNumbers) {
        this.rollNumbers = rollNumbers;
    }
}
