package animals.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"home", "default"})
@Component
@Qualifier("small")
public class Cat implements Animal {
}

