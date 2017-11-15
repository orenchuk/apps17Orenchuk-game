public class Elf extends Character {
    @Override
    public String toString() {
        super.toString();
        return " Elf was created with power: " + power + " and hp: " + hp;
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
        if (c.power < this.power) {
            c.hp = 0;
            System.out.println("Elf killed his enemy");
        } else {
            c.power -= 1;
            System.out.println("Elf attacked with 1 point");
        }
    }

    Elf() {
        power = 10;
        hp = 10;
    }
}