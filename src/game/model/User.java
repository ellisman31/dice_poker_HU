package game.model;

import game.modelInterface.UserInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements UserInterface {
    private ArrayList<Cup> cupResult;
    private boolean isNewReroll;
    private final Scanner userInput = new Scanner(System.in);

    public User(Cup ownCup) {
        this.cupResult = new ArrayList<>();
        this.isNewReroll = false;
    }

    public boolean isRerollRolledNumbers() {
        System.out.println("Would you like to reroll (Yes/No)?:");
        String isReroll = userInput.next();
        return isReroll.equalsIgnoreCase("yes");
    }


    public ArrayList<Cup> getCupResult() {
        return cupResult;
    }

    public void setCupResult(ArrayList<Cup> cupResult) {
        this.cupResult = cupResult;
    }

    public Scanner getUserInput() {
        return userInput;
    }

    public boolean isNewReroll() {
        return isNewReroll;
    }

    public void setNewReroll(boolean newReroll) {
        isNewReroll = newReroll;
    }
}
