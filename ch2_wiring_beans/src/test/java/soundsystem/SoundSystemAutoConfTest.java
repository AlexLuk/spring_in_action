package soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.configuration.SoundSystemAutoConfiguration;
import soundsystem.model.disk.BlankDisk;
import soundsystem.model.disk.CompactDisk;
import soundsystem.model.player.CDPlayer;
import soundsystem.model.player.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemAutoConfiguration.class)
public class SoundSystemAutoConfTest {
    @Autowired
    private CompactDisk compactDisk;

    @Autowired
    private BlankDisk blankDisk;

    @Autowired
    private CDPlayer cdPlayer;

    @Autowired
    private MediaPlayer mediaPlayer;


    @Test
    public void testCompactDiskPresence() {
        Assert.assertNotNull(compactDisk);
    }

    @Test
    public void testBlankDiskPresence() {
        Assert.assertNotNull(blankDisk);
    }

    @Test
    public void testCdPlayerPresence() {
        Assert.assertNotNull(cdPlayer);
    }

    @Test
    public void testMediaPlayerPresence() {
        Assert.assertNotNull(mediaPlayer);
    }

    @Test
    public void testCdPlayerPlaySGT() {
        Assert.assertEquals(compactDisk.play(), cdPlayer.play());
    }

    @Test
    public void testMediaPlayerPlayMikel() {
        Assert.assertNotNull(blankDisk.play(), mediaPlayer.play());
    }
}