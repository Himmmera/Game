package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Game1Test {

    @Test

    public void WhenFirstPlayerStrongestTest() {
        Game1 game = new Game1();
        Player player1 = new Player(1, "Michael", 111);
        Player player2 = new Player(2, "Chris", 222);

        game.register(player1);
        game.register(player2);
        int actual = game.round("Michael", "Chris");
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void WhenSecondPlayerStrongestTest() {
        Game1 game = new Game1();
        Player player1 = new Player(1, "Michael", 111);
        Player player2 = new Player(2, "Chris", 222);

        game.register(player1);
        game.register(player2);
        int actual = game.round("Chris", "Michael");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void PlayerNotFoundTest() {
        Game1 game = new Game1();
        Player player1 = new Player(1, "Michael", 111);
        Player player2 = new Player(2, "Chris", 222);

        game.register(player1);
        game.register(player2);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Michael", "Nick")
        );
    }

    @Test

    public void PlayerNotFoundTest1() {
        Game1 game = new Game1();
        Player player1 = new Player(1, "Michael", 111);
        Player player2 = new Player(2, "Chris", 222);

        game.register(player1);
        game.register(player2);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Chris", "Nick")
        );
    }
}
