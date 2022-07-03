package _01_WorkingWithAbstraction._08_JediGalaxy_excs;

public class Jedi {

    public long moveJedi(int currentRowJedi, int currentColJedi, Field field) {
        long starsCollected = 0;
        while (currentRowJedi >= 0 && currentColJedi < field.getColLength()) {
            if (field.isInBounds(currentRowJedi, currentColJedi)) {
                starsCollected += field.getValue(currentRowJedi, currentColJedi);
            }

            currentColJedi++;
            currentRowJedi--;
        }
        return starsCollected;
    }
}
