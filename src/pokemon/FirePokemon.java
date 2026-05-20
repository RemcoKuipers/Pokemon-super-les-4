package pokemon;

public class FirePokemon extends Pokemon {
    private String weakness;
    private int fireResistance;

    public FirePokemon(String name, int level, int hp, int maxHp, String sound, String weakness, int fireResistance) {
        super(name, level, hp, maxHp, sound);
        this.weakness = weakness;
        this.fireResistance = fireResistance;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getFireResistance() {
        return fireResistance;
    }

    public void setFireResistance(int fireResistance) {
        this.fireResistance = fireResistance;
    }

    public void fireLash() {
        System.out.println("Fire Lash");
    }

    public void flameThrower() {
        System.out.println("Flame Thrower");
    }

    @Override
    public void speaks() {
        System.out.println(getSound());
    }
}
