import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {
    Knight knight = new Knight();
    CharacterFactory factory = new CharacterFactory();
    @Test
    public void toStringTest() throws Exception {
        knight.toString();
    }

    @Test
    public void kick() throws Exception {
        knight.kick(factory.createCharacter());
    }

}