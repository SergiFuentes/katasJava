package katas.katas.snakesAndLaddersKata;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class snakesAndLaddersTest {

    Player player1 = new Player();
    Player player2 = new Player();
    SnakesAndLadders game = new SnakesAndLadders();
    @Test
    void snakesAndLaddersPlayMethodReturnsAStringWithThePlayerPosition(){
        assertThat(game.play(1,3), equalTo("Player1 is on square 4") );
    }

    @Test
    void playerStartAtSquare1() {
        assertThat(player1.squarePosition, equalTo(0));
    }

    @Test
    void playerCanRollDices(){

        player1.rollDices(4,5);
        player1.rollDices(8,5);

        assertThat(player1.squarePosition, equalTo(22));
    }

    @Test
    void player1StartsAndAlternateWithPlayer2(){
        player1.rollDices(1,1);

    }

    @Test
    void thereAreOnly100squares(){

        player1.rollDices(100,5);
        if(player1.squarePosition>100){
            player1.squarePosition = 100-(player1.squarePosition -100);
        }
        assertThat(player1.squarePosition, equalTo(95));
    }
}
