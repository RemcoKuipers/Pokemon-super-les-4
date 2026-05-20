package pokemon;

public class WaterPokemon extends Pokemon {
    private int waterPower;
    private int waterResistance;

    public WaterPokemon(String name, int level, int hp, int maxHp, String sound, int waterPower, int waterResistance) {
        super(name, level, hp, maxHp, sound);
        this.waterPower = waterPower;
        this.waterResistance = waterResistance;
    }

    public int getWaterPower() {
        return waterPower;
    }

    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }

    public int getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(int waterResistance) {
        this.waterResistance = waterResistance;
    }

    public void hydroPump() {
        System.out.println(getName() + " uses Hydro Pump.");
    }

    public void rainDance() {
        System.out.println(getName() + " uses Rain Dance.");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " Says " + getSound());
    }
}
