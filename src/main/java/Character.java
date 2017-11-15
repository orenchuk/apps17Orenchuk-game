import java.util.Random;

abstract class Character  {
    int power = 0, hp = 0;

    public void kick(Character c) {}

    public boolean isAlive() {
        return hp > 0 ? true : false;
    }

    Random random = new Random();
}