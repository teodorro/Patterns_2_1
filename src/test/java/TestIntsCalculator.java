import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestIntsCalculator {
    @Test
    public void testSum(){
        IntsCalculator calculator = new IntsCalculator(new Calculator());

        int sum = calculator.sum(3, 5);

        Assertions.assertEquals(8, sum);
    }

    @Test
    public void testMult(){
        IntsCalculator calculator = new IntsCalculator(new Calculator());

        int mult = calculator.mult(3, 5);

        Assertions.assertEquals(15, mult);
    }

    @Test
    public void testPow(){
        IntsCalculator calculator = new IntsCalculator(new Calculator());

        int pow = calculator.pow(3, 5);

        Assertions.assertEquals(243, pow);
    }
}