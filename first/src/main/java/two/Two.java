package two;

public class Two {
    public static void main(String[] args) {
        Point one = new Point(150.1, 150.1);
        Point two = new Point(3.14, 3.14);

        System.out.println(Point.distance(one, two));
        System.out.println(one.distanceNonStatic(two));

    }
}
