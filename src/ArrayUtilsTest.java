import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArrayUtilsTest {
    @Test
    public void findHighestInArrayOfOne(){
        int[] array = {10};
        assertEquals(array[0], ArrayUtils.findHighest(array));

    }

    @Test
    public void findHighestOfTwo(){
        int [] array = {10, 200};
        assertEquals(200, ArrayUtils.findHighest(array));
    }
}
