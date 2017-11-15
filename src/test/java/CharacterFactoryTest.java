import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterFactoryTest {
    @Test
    public void createCharacter() throws Exception {
        System.out.println("Creating CharacterFactory with Character");
        assertNotNull("Character was not created", new CharacterFactory().createCharacter());
    }

}