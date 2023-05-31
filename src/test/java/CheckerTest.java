import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckerTest {

    private Checker checker;

    @BeforeEach
    public void init(){
        checker = new Checker();
    }

    @Test
    public void testshouldReturnFalse(){
        boolean strongPassword = checker.isStrongPassword("KN7qEXxSx");
        assertFalse(strongPassword);
    }

    @Test
    public void testshouldReturnTrue(){
        boolean strongPassword = checker.isStrongPassword("Sxl/1?oh");
        assertTrue(strongPassword);
    }
}
