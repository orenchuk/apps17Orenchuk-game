import org.junit.Test;

import static org.junit.Assert.*;

public class HobbitTest {
    Hobbit hobbit = new Hobbit();
    CharacterFactory factory = new CharacterFactory();
    @Test
    public void toCry() throws Exception {
        hobbit.toCry();
    }

    @Test
    public void toStringTest() throws Exception {
        hobbit.toString();
    }

    @Test
    public void kick() throws Exception {
        hobbit.kick(factory.createCharacter());
    }

}