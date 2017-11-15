import org.junit.Test;

import static org.junit.Assert.*;

public class GameManagerTest {
    @Test
    public void launch() throws Exception {
        CharacterFactory factory = new CharacterFactory();
        System.out.println("CharacterFactory is created");
        Character player1 = factory.createCharacter();
        System.out.println("Player1 is created");
        Character player2 = factory.createCharacter();
        System.out.println("Player2 is created");
        System.out.println("Game is launching");
        new GameManager().launch(player1, player2);
    }

}