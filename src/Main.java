public class Main {
    public static void main(String[] args) {
Boss boss=new Boss();
boss.setDamage(50);
boss.setHeal(56);
boss.setDefends("magic");
        System.out.println(boss.getHeal());
        System.out.println(boss.getDamage());
        System.out.println(boss.getDefends());
    }
}