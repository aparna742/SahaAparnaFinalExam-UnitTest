import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStringCalculator {
    private StringCalculator stringCalculator;
    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        stringCalculator = null;
    }

    @Test
    public void testAddThrow1() {
        assertThrows(IllegalArgumentException.class, () -> {
            int result = StringCalculator.add("-1,5,10");
        });
    }
    @Test
    public void testAddThrow() {
        assertThrows(IllegalArgumentException.class, () -> {
            int result = StringCalculator.add("-1,5,1100");
        });

    }
