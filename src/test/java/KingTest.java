import org.junit.Test;

import static org.junit.Assert.*;

public class KingTest {
    King king = new King();
    CharacterFactory factory = new CharacterFactory();
    @Test
    public void toStringTest() throws Exception {
        king.toString();
    }

    @Test
    public void kick() throws Exception {
        king.kick(factory.createCharacter());
    }

}