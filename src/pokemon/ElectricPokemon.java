package pokemon;

public class ElectricPokemon extends Pokemon {
    private int electricCharge;
    private int electricResistance;

    public ElectricPokemon(String name, int level, int hp, int maxHp, String sound, int electricCharge, int electroResistance) {
        super(name, level, hp, maxHp, sound);
        this.electricCharge = electricCharge;
        this.electricResistance = electroResistance;

    }

    public int getElectricCharge() {
        return electricCharge;
    }

    public void setElectricCharge(int electricCharge) {
        this.electricCharge = electricCharge;
    }

    public int getElectroResistance() {
        return electricResistance;
    }

    public void setElectroResistance(int electroResistance) {
        this.electricResistance = electroResistance;
    }

    public void voltTackle() {
        System.out.println(getName() + " uses Volt Tackle");
    }

    public void electroBall() {
        System.out.println(getName() + " uses Electro Ball");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " Got struck by lightning and screams: " + getSound());
    }
}
