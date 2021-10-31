public class SquareToy extends GeometryToy {
    double side;

    SquareToy(double nSide) {
        this.side = nSide;
    }

    public String getGeometry() {
        return "Persegi";
    }

    public double area() {
        return side * side;
    }

    public double circumference() {
        return 4 * side;
    }
}
