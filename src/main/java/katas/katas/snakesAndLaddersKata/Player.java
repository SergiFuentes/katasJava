package katas.katas.snakesAndLaddersKata;

import java.util.ArrayList;

public class Player {
    public int squarePosition =0;

    public void rollDices(int dice1, int dice2) {
        squarePosition += dice1 +dice2;
    }
}
