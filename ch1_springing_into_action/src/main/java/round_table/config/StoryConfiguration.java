package round_table.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import round_table.Dragon;
import round_table.knight.BraveKnight;
import round_table.knight.Knight;
import round_table.knight.Ministrel;
import round_table.quest.Quest;
import round_table.quest.SlayDragon;

@Configuration
@EnableAspectJAutoProxy
public class StoryConfiguration {
    @Bean
    public Dragon dragon() {
        return new Dragon("Deadly Red One");
    }

    @Bean
    public Quest quest() {
        return new SlayDragon(dragon());
    }

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Ministrel ministrel() {
        return new Ministrel(System.err);
    }
}
