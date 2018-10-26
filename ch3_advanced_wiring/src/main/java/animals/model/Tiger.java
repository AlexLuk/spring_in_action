package animals.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("jungle")
@Component
@Primary
public class Tiger implements Animal {
}
