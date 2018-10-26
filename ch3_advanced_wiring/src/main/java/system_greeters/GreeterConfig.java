package system_greeters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import system_greeters.model.*;

@Configuration
public class GreeterConfig {

    @Bean
    @Conditional(NotLinux.class)
    public Greeter NotLinuxGreeter(){
        return new NotLinuxGreeter();
    }

    @Bean
    @Conditional(IsLinux.class)
    public Greeter LinuxGreeter(){
        return new LinuxGreeter();
    }

}
