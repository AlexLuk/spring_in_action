package soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.model.disk.BlankDisk;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SystemConfig.class)
@TestPropertySource(properties = {"system_properties_for_my_application.profiles.active = dev"})
public class SoundSystemTest {
    @Autowired
    private BlankDisk blankDisk;

    @Value("${system_properties_for_my_application.profiles.active}")
    private String activeProfile;

    @Autowired
    Environment environment;
    @Test
    public void testDisk() {
        Assert.assertNotNull(blankDisk);
        Assert.assertEquals("Marie Bernadette O'Connor", blankDisk.getArtist());
        Assert.assertEquals("I Do Not Want What I Haven't Got", blankDisk.getTitle());
        Assert.assertEquals(2, blankDisk.getTracks().size());
    }

    @Test
    public void testActiveProfileSystemProperty() {
        Assert.assertEquals(activeProfile, "dev");
    }
}