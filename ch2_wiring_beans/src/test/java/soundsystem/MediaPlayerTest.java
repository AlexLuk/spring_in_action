package soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.model.disk.CompactDisk;
import soundsystem.model.player.MediaPlayer;
import soundsystem.model.player.Player;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cd-config.xml")
public class MediaPlayerTest {
    @Autowired
    private Player mediaPlayer;
    @Autowired
    private CompactDisk compactDisk;

    @Test
    public void testMediaPlayerPresence() {
        Assert.assertNotNull(mediaPlayer);
        Assert.assertEquals(mediaPlayer.getClass(), MediaPlayer.class);
    }

    @Test
    public void testMediaPlayerPlayMikel() {
        Assert.assertEquals(mediaPlayer.play(), compactDisk.play());
    }
}
