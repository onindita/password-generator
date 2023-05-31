import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GeneratorTest {
    private Generator generator;

    @BeforeEach
    public void init(){
        generator = new Generator();
    }

    @Test
    public void testCreatedPasswordLength(){
        String password = generator.generatePassword(10);
        assertEquals(10, password.length());
    }
}
