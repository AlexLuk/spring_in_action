package soundsystem.model.disk;

import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
public class BlankDisk implements CompactDisk {
    @Setter
    private String title;
    @Setter
    private String artist;
    @Setter
    private List<String> tracks;

    @Override
    public String play() {
        return String.format("Playing '%s' by artist '%s' tracks: '%s'", title, artist, String.join(" ,", tracks));
    }
}
