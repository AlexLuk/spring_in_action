package soundsystem.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soundsystem.model.player.CDPlayer;
import soundsystem.model.disk.CompactDisk;

@Configuration
public class CDPlayerConfiguration {
    @Bean
    CDPlayer cdPlayer(@Qualifier("compactDisk") CompactDisk compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
