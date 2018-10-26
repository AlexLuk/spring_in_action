package desserts;

import desserts.model.Cold;
import desserts.model.Creamy;
import desserts.model.Dessert;
import desserts.model.IceCream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DesertConfig.class)
public class DesertTest {
    @Autowired
    @Cold
    @Creamy
    private Dessert dessert;

    @Test
    public void desertIsIceCream() {
        Assert.assertEquals(dessert.getClass(), IceCream.class);
    }
}