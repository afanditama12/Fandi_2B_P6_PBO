public class RectangleToy extends GeometryToy{
    double weight, height;

    // constructor
    RectangleToy(double nWidth, double nHeight) {
        this.weight = nWidth;
        this.height = nHeight;
    }

    public String getGeometry() {
        return "Persegi Panjang";
    }

    public double area() {
        return weight *height;
    }

    public double circumference() {
        return 2*(weight + height);
    }
}


