package soundsystem.model.disk;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisk {
    @Override
    public String play() {
        String title = "Sgt. Pepper's Lonely Hearts Club Band";
        String artist = "The Beatles";
        return String.format("Playing '%s' by artist '%s'", title, artist);
    }
}
