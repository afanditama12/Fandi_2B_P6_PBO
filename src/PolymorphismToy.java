public class PolymorphismToy {
    static void test() {
        RectangleToy rectangletoy = new RectangleToy(10, 20);
        SquareToy squaretoy = new SquareToy(30);
    }

    static void printGeometry(GeometryToy theG) {
        System.out.println("==========================");
        System.out.println("Geometri : " + theG.getGeometry());
        System.out.println("Luas Geometri : " + theG.area());
        System.out.println("Keliling Geometri : " + theG.circumference());
    }

    public static void main(String[] args) {
        test();
    }
}
