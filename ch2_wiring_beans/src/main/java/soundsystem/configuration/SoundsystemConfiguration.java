package soundsystem.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CDPlayerConfiguration.class,CDConfig.class})
@ImportResource("classpath:cd-config.xml")
public class SoundsystemConfiguration {
}
