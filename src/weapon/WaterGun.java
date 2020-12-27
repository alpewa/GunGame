package weapon;

public class WaterGun extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("Водный пистолет");
        System.out.println("Пшшшшшшшш");
    }
}