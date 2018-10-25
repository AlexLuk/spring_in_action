package soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.model.disk.BlankDisk;
import soundsystem.model.player.CDPlayer;
import soundsystem.model.disk.CompactDisk;
import soundsystem.model.player.Player;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerTest.CDPlayerTestConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisk compactDisk;

    @Autowired
    private Player player;

    @Configuration
    static class CDPlayerTestConfig {
        @Bean
        public CompactDisk compactDisk() {
            return new BlankDisk();
        }

        @Bean
        public Player cdPlayer() {
            return new CDPlayer(compactDisk());
        }
    }

    @Test
    public void testCompactDiskPresence() {
        Assert.assertNotNull(compactDisk);
    }

    @Test
    public void testPlayerPresence() {
        Assert.assertNotNull(player);
    }

    @Test
    public void testPlayerHasBalankDiskInItPresence() {
        Assert.assertEquals(compactDisk.getClass(), BlankDisk.class);
    }
}
