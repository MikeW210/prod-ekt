package pl.dmcs.projektkompetencyjny.domain;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class KnightTest {

    @Test
    public void testIfQuestMarkedAsStarted() {
        Knight knight = new Knight("Roland", 40);
        Quest quest = new Quest(1,"Zadanie testowe!");

        knight.setQuest(quest);

        assertTrue(knight.getQuest().isStarted());
    }
}
