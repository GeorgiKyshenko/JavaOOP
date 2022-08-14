package football.entities.player;

public class Men extends BasePlayer {

    private double kg = 85.50;

    public Men(String name, String nationality, int strength) {
        super(name, nationality, strength);
        super.setKg(kg);
    }

    @Override
    public void stimulation() {
        setStrength(getStrength() + 145);
    }
}
