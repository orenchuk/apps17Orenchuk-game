public class King extends Character {
    @Override
    public String toString() {
        super.toString();
        return " King was created with power: " + power + " and hp: " + hp;
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
        int randnum = random.nextInt(this.power) + 1;
        c.hp -= randnum;
        System.out.println("King attacked with " + randnum + " point(s)");
    }

    King() {
        power = random.nextInt(10) + 5;
        hp = random.nextInt(10) + 5;
    }
}