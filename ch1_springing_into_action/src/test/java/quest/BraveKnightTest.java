package quest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import round_table.knight.BraveKnight;
import round_table.knight.Knight;
import round_table.quest.Quest;

public class BraveKnightTest {

    @Test
    public void testKnight() {
        Quest quest = Mockito.mock(Quest.class);
        Knight braveKnight = new BraveKnight(quest);
        Mockito.when(quest.embark()).thenReturn("On quest");
        String result = braveKnight.embarkOnQuest();
        Assert.assertEquals(result, "On quest");
        Mockito.verify(quest, Mockito.times(1));
    }
}