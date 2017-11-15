public class GameManager {

    public void launch(Character c1, Character c2) {
        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            System.out.println("Hobbits won");
        } else {
            fight(c1, c2);
        }
    }

    private void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println("Player1's power: " + c1.power + " and hp: " + c1.hp);
            System.out.println("Player2's power: " + c2.power + " and hp: " + c2.hp);
            System.out.println();
            if (c2.isAlive()) {
                c2.kick(c1);
                System.out.println("Player1's power: " + c1.power + " and hp: " + c1.hp);
                System.out.println("Player2's power: " + c2.power + " and hp: " + c2.hp);
                System.out.println();
                if (!c1.isAlive()) {
                    System.out.println("GAME OVER!!!\nPlayer1 is killed");
                }
            } else {
                System.out.println("GAME OVER!!!\nPlayer2 is killed");
            }
        }
    }

}
