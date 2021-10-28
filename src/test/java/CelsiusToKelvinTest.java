import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CelsiusToKelvinTest {

    private Converter converter;

    @BeforeEach
    public void setup(){
        converter = new CelsiusToKelvin();
    }

    @Test
    public void from20_Cto293_K(){
        double expected = 293;
        double actual = converter.convert(20);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testNegativeDoubleValue() {
        double expected2 = 260.55;
        double actual2 = converter.convert(-12.45);
        assertEquals(expected2, actual2, 0.001);
    }
}