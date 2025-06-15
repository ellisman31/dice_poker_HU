package game.modelInterface;

import java.util.ArrayList;

public interface CupInterface {
    void rerollSpecificRolledNumbers(boolean isRerollNumber, ArrayList<Integer> rerollNumberIndex);
    void fillTheCupWithRolledNumbers();
}
