package D;

public class Square implements Comparable<Square>{
    private double height;
    private double width;

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter () {
        return 2*(width + height);
    }

    @Override
    public int compareTo(Square o) {
        return 0;
    }
}
