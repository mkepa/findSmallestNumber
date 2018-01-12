import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class findSmallestNumberTest {

//    findSmallestNumber smallest = new findSmallestNumber();


    @Test

    public void getSmallestNumberTest() {
        assertEquals(2, findSmallestNumber.findSmallestInt(new int[]{3, 5, 7, 10, 2}));
        assertEquals(-3, findSmallestNumber.findSmallestInt(new int[]{-3, 5, 7, 10, 232, 324, 23, }));
        assertEquals(-345,findSmallestNumber.findSmallestInt(new int[]{34, -345, -1, 100}));
    }
}
