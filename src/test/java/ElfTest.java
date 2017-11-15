import org.junit.Test;

import static org.junit.Assert.*;

public class ElfTest {
    Elf elf = new Elf();
    CharacterFactory factory = new CharacterFactory();

    @Test
    public void toStringTest() throws Exception {
        elf.toString();
    }

    @Test
    public void kick() throws Exception {
        elf.kick(factory.createCharacter());
    }

}