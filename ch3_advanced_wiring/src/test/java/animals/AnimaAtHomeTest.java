package animals;

import animals.model.Animal;
import animals.model.Cat;
import animals.model.Dog;
import animals.model.Tiger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("home")
@ContextConfiguration(classes = AnimalsConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AnimaAtHomeTest {
    @Autowired
    private Animal animal;

    @Test
    public void animalIsDog() {
        Assert.assertNotNull(animal);
        Assert.assertEquals(animal.getClass(), Dog.class);
    }
}