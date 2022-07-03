package _01_WorkingWithAbstraction._08_JediGalaxy_excs;

public class Evil {

    public void moveEvil(int currentRowEvil, int currentColEvil, Field field) {
        while (currentRowEvil >= 0 && currentColEvil >= 0) {
            if (field.isInBounds(currentRowEvil, currentColEvil)) {
                field.setValue(currentRowEvil, currentColEvil, 0);
            }
            currentRowEvil--;
            currentColEvil--;
        }
    }
}
