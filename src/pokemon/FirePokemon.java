package pokemon;

public class FirePokemon extends Pokemon {
    private int firePower;
    private int fireResistance;

    public FirePokemon(String name, int level, int hp, int maxHp, String sound, int firePower, int fireResistance) {
        super(name, level, hp, maxHp, sound);
        this.firePower = firePower;
        this.fireResistance = fireResistance;
    }

    public int getFirePower() {
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    public int getFireResistance() {
        return fireResistance;
    }

    public void setFireResistance(int fireResistance) {
        this.fireResistance = fireResistance;
    }

    public void fireLash() {
        System.out.println(getName() + "used Fire Lash");
    }

    public void flameThrower() {
        System.out.println(getName() + " used Flame Thrower.");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " Says " + getSound());
    }
}
