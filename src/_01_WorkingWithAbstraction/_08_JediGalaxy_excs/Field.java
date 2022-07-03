package _01_WorkingWithAbstraction._08_JediGalaxy_excs;

public class Field {
    private int[][] field;

    public Field(int rows, int cols) {
        this.field = new int[rows][cols];
        this.createGalaxy(rows, cols);
    }

    private void createGalaxy(int rows, int cols) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                this.field[row][col] = value++;
            }
        }
    }

    public boolean isInBounds( int row, int col) {
        return row >= 0 && col >= 0 && row < this.field.length && col < this.field[row].length;
    }

    public int getValue(int row, int col) {
        return this.field[row][col];
    }

    public void setValue(int row, int col, int newValue) {
        this.field[row][col] = newValue;
    }

    public int getColLength() {
        return this.field[1].length;
    }
}
