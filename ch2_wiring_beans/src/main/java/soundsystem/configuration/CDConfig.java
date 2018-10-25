package soundsystem.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soundsystem.model.disk.CompactDisk;
import soundsystem.model.disk.SgtPeppers;

@Configuration
public class CDConfig {
    @Bean(name = "compactDisk")
    public CompactDisk compactDisk() {
        return new SgtPeppers();
    }
}
