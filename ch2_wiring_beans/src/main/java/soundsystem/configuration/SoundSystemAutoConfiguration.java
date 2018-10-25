package soundsystem.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDConfig.class)
@ImportResource("classpath:cd-config.xml")
@ComponentScan(basePackages = {"soundsystem.model.disk", "soundsystem.model.player"})
public class SoundSystemAutoConfiguration {
}
