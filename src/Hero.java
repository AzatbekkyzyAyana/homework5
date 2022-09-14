public class Hero {
    private int heal;
    private int damage;
    private String adam;

    public int getHeal() {
        return heal;
    }
    public int getDamage() {
        return damage;
    }
    public String getAdam() {
        return adam;
    }
    public Hero(int heal, int damage, String adam) {
        this.heal = heal;
        this.damage = damage;
        this.adam = adam;
    }

    public Hero(int heal, int damage) {
        this.heal = heal;
        this.damage = damage;

    }
}
