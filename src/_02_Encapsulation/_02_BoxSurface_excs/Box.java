package _02_Encapsulation._02_BoxSurface_excs;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        checkForIllegalArgument(length, "Length");
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        checkForIllegalArgument(width, "Width");
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        checkForIllegalArgument(height, "Height");
        this.height = height;
    }

    private void checkForIllegalArgument(double argument, String argumentType) {
        if (argument <= 0) {
            throw new IllegalArgumentException(argumentType + " cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
        return calculateLateralSurfaceArea() + 2 * (length * width);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (length * height) + 2 * (width * height);
    }

    public double calculateVolume() {
        return width * height * length;
    }
}
