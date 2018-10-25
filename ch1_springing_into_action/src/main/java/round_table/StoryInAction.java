package round_table;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import round_table.config.StoryConfiguration;
import round_table.knight.Knight;

public class StoryInAction {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StoryConfiguration.class);
        Knight knight = context.getBean(Knight.class);
        System.out.println(knight.embarkOnQuest());
        context.close();
    }
}
