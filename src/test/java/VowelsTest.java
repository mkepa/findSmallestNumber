import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelsTest {

    @Test

    public void getVolvesTest() {
        assertEquals(5,Vowels.getCount("Celebration"));
        assertEquals(1,Vowels.getCount("Palm"));
        assertEquals(4,Vowels.getCount("Prediction"));
    }
}
