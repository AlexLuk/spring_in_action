package shop;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import shop.model.Toilet;
import shop.model.Cart;

@ContextConfiguration(classes = ShopConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ShopServiceTest {
    @Autowired
    private Cart cart1;

    @Autowired
    private Cart cart2;

    @Autowired
    private Toilet toilet1;

    @Autowired
    private Toilet toilet2;

    @Test
    public void testShopCarts() {
        Assert.assertNotNull(cart1);
        Assert.assertNotNull(cart2);
        Assert.assertNotEquals(cart1, cart2);
    }

    @Test
    public void testShopBags() {
        Assert.assertNotNull(toilet1);
        Assert.assertNotNull(toilet2);
        Assert.assertEquals(toilet1, toilet2);
    }
}
