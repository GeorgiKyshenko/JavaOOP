package _01_WorkingWithAbstraction._08_JediGalaxy_excs;

public class Galaxy {
    private Field field;
    private Jedi jedi;
    private Evil evil;

    public Galaxy(Field field) {
        this.field = field;
        this.jedi = new Jedi();
        this.evil = new Evil();
    }


    public long moveJedi(int currentRowJedi, int currentColJedi) {
        return jedi.moveJedi(currentRowJedi,currentColJedi,this.field);
    }

    public void moveEvil(int currentRowEvil, int currentColEvil) {
        this.evil.moveEvil(currentRowEvil,currentColEvil,this.field);
    }
}
