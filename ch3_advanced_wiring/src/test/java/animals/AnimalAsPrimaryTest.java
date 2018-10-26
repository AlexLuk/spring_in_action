package animals;


import animals.model.Animal;
import animals.model.Dog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = AnimalsConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AnimalAsPrimaryTest {
    @Autowired
    private Animal animal;

    @Test
    public void animalIsDog() {
        Assert.assertNotNull(animal);
        Assert.assertEquals(animal.getClass(), Dog.class);
    }
}