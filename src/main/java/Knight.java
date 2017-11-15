public class Knight extends Character {

    @Override
    public String toString() {
        super.toString();
        return " Knight was created with power: " + power + " and hp: " + hp;
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
        int randnum = random.nextInt(this.power) + 1;
        c.hp -= randnum;
        System.out.println("Knight attacked with " + randnum + " point(s)");
    }

    Knight() {
        power = random.nextInt(10) + 2;
        hp = random.nextInt(19) + 2;
    }
}