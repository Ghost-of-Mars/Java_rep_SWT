package two;

public class Point {
    double X;
    double Y;

    public Point(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public static double distance(Point p1, Point p2) {
        double p2xMinusP1xSquared = Math.pow(p2.X - p1.X, 2);
        double p2yMinusP1ySquared = Math.pow(p2.Y - p1.Y, 2);
        return Math.sqrt(p2xMinusP1xSquared + p2yMinusP1ySquared);
    }

    public double distanceNonStatic(Point p1, Point p2) {
        double p2xMinusP1xSquared = Math.pow(p2.X - p1.X, 2);
        double p2yMinusP1ySquared = Math.pow(p2.Y - p1.Y, 2);
        return Math.sqrt(p2xMinusP1xSquared + p2yMinusP1ySquared);
    }
}