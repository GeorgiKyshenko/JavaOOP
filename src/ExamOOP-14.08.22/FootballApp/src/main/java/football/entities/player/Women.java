package football.entities.player;

public class Women extends BasePlayer {

    private double kg = 60.00;

    public Women(String name, String nationality, int strength) {
        super(name, nationality, strength);
        super.setKg(kg);
    }

    @Override
    public void stimulation() {
        setStrength(getStrength() + 115);
    }
}
