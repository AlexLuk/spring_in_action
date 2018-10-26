package animals.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"home", "default"})
@Component
@Primary
public class Dog implements Animal {
}
