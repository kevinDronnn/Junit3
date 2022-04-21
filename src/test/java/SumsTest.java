import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumsTest {

    @Test
    void sum() {
        Sums sums=new Sums();
        int actual=sums.sum(10);
        int expected=31;
    }
}