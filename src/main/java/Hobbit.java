public class Hobbit extends Character {

    void toCry() {
        System.out.println("Hobbit is crying");
    }

    @Override
    public String toString() {
        super.toString();
        return " Hobbit was created with power: " + power + " and hp: " + hp;
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
        toCry();
    }

    Hobbit() {
        power = 0;
        hp = 3;
    }
}