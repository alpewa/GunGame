package weapon;

public class Pistol extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("Пистолет");
        System.out.println("Пиу-Пиу");
    }
}