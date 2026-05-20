package pokemon;

public class GrassPokemon extends Pokemon {
    private int grassPower;
    private int grassResistance;

    public GrassPokemon(String name, int level, int hp, int maxHp, String sound, int grassPower, int grassResistance) {
        super(name, level, hp, maxHp, sound);
        this.grassPower = grassPower;
        this.grassResistance = grassResistance;
    }

    public int getGrassPower() {
        return grassPower;
    }

    public void setGrassPower(int grassPower) {
        this.grassPower = grassPower;
    }

    public int getGrassResistance() {
        return grassResistance;
    }

    public void setGrassResistance(int grassResistance) {
        this.grassResistance = grassResistance;
    }

    public void leafStorm() {
        System.out.println(getName() + " used Leaf Storm");
    }

    public void leechSeed() {
        System.out.println(getName() + " used Leech Seed");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " Is looking around and makes a weird sound like: " + getSound());
    }
}
