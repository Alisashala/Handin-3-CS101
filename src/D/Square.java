package D;

public class Square implements Comparable<Square>{
    private double height;
    private double width;

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }


    public double getPerimeter () {
        return 2*(width + height);
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public int compareTo(Square comparableSquare) {

        if (this.getPerimeter() > comparableSquare.getPerimeter()) {
            return 1;
        } else {
            return -1;
        }
    }
}
