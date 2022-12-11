public class two {

    public static void main(String[] args) {
        point one = new point(150.1);
        point two = new point(3.14);

        System.out.println(point.distance(one, two));
    }
}

class point {
    double p;

    public point(double p) {
        this.p = p;
    }

    public static double distance(point p1, point p2) {
        return p1.p - p2.p;
    }
}
