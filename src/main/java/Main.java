public class Main {

    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character player1 = factory.createCharacter();
        Character player2 = factory.createCharacter();

        GameManager game = new GameManager();
        game.launch(player1, player2);
    }
}
