package soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import soundsystem.model.disk.BlankDisk;

import java.util.List;

@Configuration
@PropertySource("classpath:config-${system_properties_for_my_application.profiles.active}.properties")
public class SystemConfig {
    @Value("${disk.artist}")
    private String artist;
    @Value("${disk.title}")
    private String title;
    //    using SpEL
    @Value("#{'${disk.traks}'.split(';')}")
    private List<String> traks;

    @Bean
    BlankDisk blankDisk() {
        BlankDisk blankDisk = new BlankDisk();
        blankDisk.setArtist(artist);
        blankDisk.setTitle(title);
        blankDisk.setTracks(traks);
        return blankDisk;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
