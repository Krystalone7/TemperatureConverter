import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CelsiusToFahrenheitTest {

    private Converter converter;

    @BeforeEach
    public void setup(){
        converter = new CelsiusToFahrenheit();
    }

    @Test
    public void from45_Cto113_F(){
        double expected = 113;
        double actual = converter.convert(45);
        assertEquals(expected,actual,0.001);
    }

    @Test
    public void testNegativeDoubleValue() {
        double expected2 = -238.9;
        double actual2 = converter.convert(-150.5);
        assertEquals(expected2, actual2, 0.001);
    }
}