package animals;

import animals.model.Animal;
import animals.model.Tiger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("jungle")
@ContextConfiguration(classes = AnimalsConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AnimalsInJungleTest {
    @Autowired
    private Animal animal;

    @Test
    public void animalIsTiger() {
        Assert.assertNotNull(animal);
        Assert.assertEquals(animal.getClass(), Tiger.class);
    }
}