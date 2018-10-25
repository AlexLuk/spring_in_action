package round_table.knight;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import round_table.quest.Quest;

@RequiredArgsConstructor
@Component
public class BraveKnight implements Knight {
    private final Quest quest;

    @Override
    public String embarkOnQuest() {
        return quest.embark();

    }
}
