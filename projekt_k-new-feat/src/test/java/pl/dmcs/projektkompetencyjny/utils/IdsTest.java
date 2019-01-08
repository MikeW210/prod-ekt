package pl.dmcs.projektkompetencyjny.utils;

import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class IdsTest {

    @Test
    public void testEmptySet() {
        int result = Ids.generateNewId(Collections.emptySet());
        assertEquals(0, result);

    }


    @Test
    public void testGenerateNewId() {
        Set<Integer> sample = new HashSet<>();
        sample.add(1);
        sample.add(2);
        sample.add(23);
        int result = Ids.generateNewId(sample);
        assertEquals(24,result);
    }

}
