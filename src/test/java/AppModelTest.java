import model.AppModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppModelTest {
    private AppModel model;

    @Before
    public void setUp() {
        this.model = new AppModel(42);
    }

    @Test
    public void TestConstructor() {
        Assert.assertEquals(42, this.model.getX());
    }

    @Test
    public void TestSetter() {
        this.model.setX(90);
        Assert.assertEquals(90, this.model.getX());
    }
}
