import org.testng.Assert;
import org.testng.annotations.Test;
import two.Point;

public class Two {

    @Test
    public void testDist1() {
        Point one = new Point(150.1, 150.1);
        Point two = new Point(3.14, 3.14);
        Assert.assertEquals(Point.distance(one, two), 207.83282512635006);
    }

    @Test
    public void testDist2() {
        Point one = new Point(151, 151);
        Point two = new Point(3, 3);
        Assert.assertEquals(Point.distance(one, two), 209.30360723121808);

    }
}
