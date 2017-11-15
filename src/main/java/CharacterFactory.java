import java.util.Random;

public class CharacterFactory {

    Random random = new Random();

    Character createCharacter() {
        switch (random.nextInt(4) + 1) {
            case 1:
                Hobbit hobbit = new Hobbit();
                System.out.println("Player" + hobbit.toString());
                return hobbit;
            case 2:
                Elf elf = new Elf();
                System.out.println("Player" + elf.toString());
                return elf;
            case 3:
                King king = new King();
                System.out.println("Player" + king.toString());
                return king;
            case 4:
                Knight knight = new Knight();
                System.out.println("Player" + knight.toString());
                return knight;
            default: break;
        }
        return null;
    }


}
