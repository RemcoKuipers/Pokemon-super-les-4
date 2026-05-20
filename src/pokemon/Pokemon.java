package pokemon;

public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private int maxHp;
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public Pokemon(String name, int level, int hp, int maxHp, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.maxHp = maxHp;
        this.sound = sound;

    }

    public void eat() {
        if (this.hp < this.maxHp) {
            this.hp += 1;
            System.out.println("You eat + 1 HP! Current HP: " + this.hp);
        } else {
            System.out.println("Your HP is full (100%)");
        }
    }

    public abstract void speaks();
}
