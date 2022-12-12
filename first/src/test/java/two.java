import org.testng.Assert;
import org.testng.annotations.Test;

public class two {

    @Test
    public void testDist1() {
        point one = new point(150.1);
        point two = new point(3.14);
        Assert.assertEquals(point.distance(one, two), 146.96);
    }

    @Test
    public void testDist2() {
        point one = new point(151);
        point two = new point(3);
        Assert.assertEquals(point.distance(one, two), 148);

    }
}
