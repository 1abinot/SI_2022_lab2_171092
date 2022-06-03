
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SILab2Test {

    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatementTest() {
        IllegalArgumentException ex;
        List<String> expectedList;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "0", "#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));


        expectedList = Arrays.asList("#", "#", "#", "#");
        assertEquals(expectedList, SILab2.function(createList("#", "#", "#", "#")));

        expectedList = Arrays.asList("#", "#", "2", "#", "#", "#", "2", "#", "3", "#", "2", "#", "#", "#", "2", "#");
        assertEquals(expectedList, SILab2.function(createList("#", "#","0","#", "#", "#", "0", "#", "0", "#", "0", "#", "#", "#", "0", "#")));
    }


    @Test
    void everyBranchTest() {
        IllegalArgumentException ex;
        List<String> expectedList;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "0", "#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        expectedList = Arrays.asList("#", "#", "#", "#");
        assertEquals(expectedList, SILab2.function(createList("#", "#", "#", "#")));


        expectedList = Arrays.asList("0", "0", "0", "0");
        assertEquals(expectedList, SILab2.function(createList("0", "0", "0", "0")));


        expectedList = Arrays.asList("#", "#", "2", "#", "#", "#", "2", "#", "3", "#", "2", "#", "#", "#", "2", "#");
        assertEquals(expectedList, SILab2.function(createList("#", "#","0","#", "#", "#", "0", "#", "0", "#", "0", "#", "#", "#", "0", "#")));

    }

}
