package system_greeters;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import system_greeters.model.Greeter;
import system_greeters.model.NotLinuxGreeter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = GreeterConfig.class)
public class GreeterTest {
    @Autowired
    private Greeter greeter;

    @Test
    public void greeterInNotLinuxOne() {
        Assert.assertEquals(greeter.getClass(), NotLinuxGreeter.class);
    }
}