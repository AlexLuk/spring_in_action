package soundsystem.model.player;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import soundsystem.model.disk.CompactDisk;

@Component
public class MediaPlayer implements Player {
    private CompactDisk compactDisc;

    public MediaPlayer(@Qualifier("blankDisk") CompactDisk compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public String play() {
        return compactDisc.play();
    }
}
