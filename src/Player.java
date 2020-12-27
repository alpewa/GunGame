import weapon.*;

public class Player {
    private int Weapon;
    private weapon.Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new AutoGun(),
                new RPG(),
                new Slingshot(),
                new WaterGun()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}