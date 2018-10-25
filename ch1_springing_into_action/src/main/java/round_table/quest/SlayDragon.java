package round_table.quest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import round_table.Dragon;

@RequiredArgsConstructor
@Component
public class SlayDragon implements Quest {

    private final Dragon dragon;

    @Override
    public String embark() {
        return String.format("Quest of dragon %s has started ", dragon.getName());
    }
}
