package johan.test;

import johan.main.CodeForTesting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeForTestingTest {

    private final CodeForTesting numberHandler = new CodeForTesting();

    @Test
    void lowestNumber(){
        assertEquals(3f, numberHandler.lowestNumber(423f, 3f));
        assertEquals(3, numberHandler.lowestNumber(3,534));
        assertEquals(3.23,numberHandler.lowestNumber(3.23,4.32));
        assertEquals(2312L,numberHandler.lowestNumber(2312L, 2222222L));
    }

    @Test
   void highestNumber() {
        assertEquals(423f, numberHandler.highestNumber(423f, 3f));
        assertEquals(534, numberHandler.highestNumber(3,534));
        assertEquals(4.32,numberHandler.highestNumber(3.23,4.32));
        assertEquals(2222222L,numberHandler.highestNumber(2312L, 2222222L));
    }

    @Test
    void powerOf() {
        assertEquals(25.0, numberHandler.powerOf(5.0,2.0));
    }

    @Test
    void addOne() {
        assertEquals(35, numberHandler.addOne(34));
        assertEquals(22L, numberHandler.addOne(21L));
    }

    @Test
    void subtractOne() {
        assertEquals(33, numberHandler.subtractOne(34));
        assertEquals(30L, numberHandler.subtractOne(31L));
    }

    @Test
    void squareRoot()  {
        assertEquals(5d, numberHandler.squareRoot(25d));
    }

    @Test
    void cubicRoot() {
        assertEquals(4d, numberHandler.cubicRoot(64d));
    }

}