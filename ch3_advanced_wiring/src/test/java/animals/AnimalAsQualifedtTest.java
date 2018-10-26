package animals;

import animals.model.Animal;
import animals.model.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = AnimalsConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AnimalAsQualifedtTest {
    @Autowired
    @Qualifier("small")
    private Animal animal;

    @Test
    public void animalIsCat() {
        Assert.assertNotNull(animal);
        Assert.assertEquals(animal.getClass(), Cat.class);
    }
}