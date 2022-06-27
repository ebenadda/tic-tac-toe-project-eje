import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerOneGenTest {

    @Test
    public void isPlayerFirst() {
        PlayerOneGen playGen = new PlayerOneGen();
        assertTrue(playGen.isPlayerFirst());
    }
}