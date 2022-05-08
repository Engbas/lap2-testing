
import static org.junit.Assert.*;
import org.junit.Test;


public class evenandoddTest  {
    @Test
    public void isEven()

    {
        evenandodd lab2 = new evenandodd();
        assertEquals("even",lab2.even_or_Odd(4));
        assertEquals("odd",lab2.even_or_Odd(9));
    }
    int[] array = new int[] {1, 2, 3, 58, 47, 229, 40};

    @Test
    public void shouldBeMaxValue() {
        int maxValue = evenandodd.getMaxValue(array);
        assert(maxValue == 229);
    }

    @Test
    public void shouldBeMinValue() {
        int minValue = evenandodd.getMinValue(array);
        assert(minValue == 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldBeIllegalArgumentException() {
        int[] emptyArray = new int[] {};
        int maxValue = evenandodd.getMaxValue(emptyArray);
        int minValue = evenandodd.getMinValue(emptyArray);
    }

}